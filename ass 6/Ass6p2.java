/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ass6p2;

/**
 *
 * @author Tameem
 */
public class Ass6p2 {

    public static void main(String[] args) {
       BankAccount account = new BankAccount("12345", 1000);

        account.deposit(500);
        account.withdraw(300);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Final Balance: " + account.getBalance());
    }
}