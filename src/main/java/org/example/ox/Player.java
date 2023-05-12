package org.example.ox;

public class Player {
    private char actualPlayer;

    public Player() {
        this.actualPlayer = 'O';
    }

    public char getActualPlayer() {
        System.out.println(actualPlayer);
        return actualPlayer;
    }
    public void changePlayer(){
        if(actualPlayer == 'O'){
            actualPlayer = 'X';
        }else actualPlayer = 'O';
    }
}
