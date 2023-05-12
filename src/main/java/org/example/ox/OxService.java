package org.example.ox;

import java.util.Scanner;

public class OxService {
Board board;
Player player;
private boolean endGame;
private boolean draw;
Scanner scanner;

    public OxService() {
        this.board = new Board();
        this.player = new Player();
        this.endGame = false;
        this.draw = false;
        this.scanner = new Scanner(System.in);

    }
    public void rules(){
        System.out.println("Gra w O i X. Zdobądź 3 znaki w pionie, poziomie lub na ukos \n" +
                "plansza składa się z 9 pól co odzwiercieldla następujący układ cyfr:\n" +
                "7 8 9\n" +
                "4 5 6\n" +
                "1 2 3\n" +
                "wybierają poszczególne cyfry stawiasz w to miejsce swój znak\n" +
                "powodzenia!");
    }
    public void run(){
        rules();
        while (!endGame && !draw){
            board.printBoard();
            System.out.println("Wybiera gracz " + player.getActualPlayer() + " podaj gdzie chcesz postawić swój znak");
            int choose = scanner.nextInt();
            board.makeMove(choose, player.getActualPlayer());
            player.changePlayer();
        }
    }
    public void checkIfWin(){

    }

    @Override
    public String toString() {
        return "OxService{" +
                "board=" + board +
                ", player=" + player +
                '}';
    }
}
