/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication86;
import java.util.Scanner;
/**
 *
 * @author STUDENT
 */
public class JavaApplication86 {
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter The Account Number : " );
        int AccNum = in.nextInt();
        System.out.println("Enter the account Holder : ");
        String AccHolder = in.nextLine();
        System.out.println("Enter the Balanace :");
        double bal = in.nextDouble(); 
        
        Bankaccount acc = new Bankaccount(AccNum , AccHolder , bal);
        System.out.println("enter the amount to depoist : ");
        double dep = in.nextDouble();
        acc.deposit(dep);
        System.out.println("enter the amount to withdraw :");
        double with = in.nextDouble();
        acc.withdraw(with);
        
       
        
    }
    
}
