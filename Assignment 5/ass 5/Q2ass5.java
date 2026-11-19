/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q2ass5;

import java.util.Scanner;


public class Q2ass5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] board = new char[3][3];

        System.out.print("Enter 9 cells (X or O): ");
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = in.next().charAt(0);
            }
        }

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(board[r][c]);
                if (c < 2) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        int xCount = 0;
        int oCount = 0;
        boolean hasFullXRow = false;

        for (int r = 0; r < 3; r++) {
            int rowX = 0;
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == 'X') {
                    xCount++;
                    rowX++;
                } else if (board[r][c] == 'O') {
                    oCount++;
                }
            }
            if (rowX == 3) {
                hasFullXRow = true;
            }
        }

        System.out.println("X count: " + xCount);
        System.out.println("O count: " + oCount);
        if (hasFullXRow) {
            System.out.println("X has a full row");
        } else {
            System.out.println("No full X row");
        }
        in.close();
    }
}