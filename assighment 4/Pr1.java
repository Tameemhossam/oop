/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pr1;

import java.util.Scanner;

/**
 *
 * @author Tameem
 */
public class Pr1 {
public static double getDouble(Scanner s, String prompt) {
        System.out.print(prompt);
        return s.nextDouble();
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9.0 / 5.0 + 32;
    }
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        double celsius = getDouble(scanner, "Enter temperature in Celsius: ");
        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
        scanner.close();
    }
}
