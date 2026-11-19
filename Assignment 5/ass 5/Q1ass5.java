/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q1ass5;

import java.util.Scanner;

/**
 *
 * @author Tameem
 */
public class Q1ass5 {

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        int[] nums = new int[6];

        System.out.print("Enter 6 numbers: ");
        for (int i = 0; i < 6; i++) {
            nums[i] = in.nextInt();
        }

        System.out.print("Reverse: ");
        for (int i = 5; i >= 0; i--) {
            System.out.print(nums[i]);
            if (i > 0) {
                System.out.print(" ");
            }
        }
        System.out.println();

        int evenSum = 0;
        int greaterCount = 0;
        for (int i = 0; i < 6; i++) {
            if (nums[i] % 2 == 0) {
                evenSum += nums[i];
            }
            if (nums[i] > nums[0]) {
                greaterCount++;
            }
        }

        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Greater than the first number: " + greaterCount);
        in.close();
    }
}