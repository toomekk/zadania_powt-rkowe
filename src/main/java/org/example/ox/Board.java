package org.example.ox;

import java.util.Arrays;

public class Board {
    private char[][] board;

    public Board() {
        this.board = new char[3][3];
        initialization();
    }

    public void initialization() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void makeMove(int choose, char playerChar) {
        if (tableCell(choose) == '-') {
            putSign(choose, playerChar);
        } else {
            System.out.println("To miejsce już jest zajęte!");
        }
    }

    public void putSign(int choose, char playerChar) {
        switch (choose) {
            case 1:
                board[2][0] = playerChar;
                break;
            case 2:
                board[2][1] = playerChar;
                break;
            case 3:
                board[2][2] = playerChar;
                break;
            case 4:
                board[1][0] = playerChar;
                break;
            case 5:
                board[1][1] = playerChar;
                break;
            case 6:
                board[1][2] = playerChar;
                break;
            case 7:
                board[0][0] = playerChar;
                break;
            case 8:
                board[0][1] = playerChar;
                break;
            case 9:
                board[0][2] = playerChar;
                break;
        }
    }

    public char tableCell(int choose) {
        char cellChar = '-';
        switch (choose) {
            case 1:
                cellChar = board[2][0];
                break;
            case 2:
                cellChar = board[2][1];
                break;
            case 3:
                cellChar = board[2][2];
                break;
            case 4:
                cellChar = board[1][0];
                break;
            case 5:
                cellChar = board[1][1];
                break;
            case 6:
                cellChar = board[1][2];
                break;
            case 7:
                cellChar = board[0][0];
                break;
            case 8:
                cellChar = board[0][1];
                break;
            case 9:
                cellChar = board[0][2];
                break;
        }
        return cellChar;
    }

    @Override
    public String toString() {
        return "Board{" +
                "board=" + Arrays.toString(board) +
                '}';
    }
}

