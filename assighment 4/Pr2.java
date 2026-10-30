/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pr2;

import java.util.Scanner;

/**
 *
 * @author Tameem
 */
public class Pr2 {
public static double coneVolume(double dValue, double hValue) {
        double r = dValue / 2.0;
        return (1.0 / 3.0) * Math.PI * Math.pow(r, 2) * hValue;
    }
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Enter diameter: ");
        double diameter = scanner.nextDouble();
        System.out.print("Enter height: ");
        double height = scanner.nextDouble();
        double volume = coneVolume(diameter, height);
        System.out.printf("Volume: %.2f%n", volume);
        scanner.close();
    }
}
