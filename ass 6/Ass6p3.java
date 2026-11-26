/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ass6p3;

import java.util.Scanner;

/**
 *
 * @author Tameem
 */
public class Ass6p3 {

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        float[] arr = new float[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextFloat();
        }

        ArrayStatistics stats = new ArrayStatistics();
        stats.findMaxMin(arr);

        System.out.println("Maximum value: " + stats.getMaxValue());
        System.out.println("Minimum value: " + stats.getMinValue());
    }
}

