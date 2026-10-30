/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pr4;

import java.util.Scanner;

/**
 *
 * @author Tameem
 */
public class Pr4 {
public static String maskEmail(String email) {
        email = email.trim();
        int atIndex = email.indexOf('@');
        if (atIndex == -1) {
            return "Invalid Email";
        }
        
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1).toLowerCase();
        
        if (username.length() <= 2) {
            return username + "@" + domain;
        }
        
        String maskedUser = username.substring(0, 2);
        for (int i = 2; i < username.length(); i++) {
            maskedUser += "*";
        }
        
        return maskedUser + "@" + domain;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String emailInput = scanner.nextLine();
        System.out.println("Output: " + maskEmail(emailInput));
        scanner.close();
    }
}
