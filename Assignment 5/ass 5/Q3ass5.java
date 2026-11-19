/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q3ass5;

import java.util.Scanner;

/**
 *
 * @author Tameem
 */
public class Q3ass5 {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        char[][] grid = new char[3][4];

        System.out.println("Enter 3 words (4 letters each):");
        for (int r = 0; r < 3; r++) {
            String word = in.next();
            for (int c = 0; c < 4; c++) {
                grid[r][c] = word.charAt(c);
            }
        }

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 4; c++) {
                System.out.print(grid[r][c]);
                if (c < 3) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.print("Columns:");
        for (int c = 0; c < 4; c++) {
            String colWord = "";
            for (int r = 0; r < 3; r++) {
                colWord = colWord.concat(String.valueOf(grid[r][c]));
            }
            System.out.print(" " + colWord);
        }
        System.out.println();

        int vowels = 0;
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 4; c++) {
                if ("aeiou".indexOf(grid[r][c]) != -1) {
                    vowels++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        in.close();
    }
}