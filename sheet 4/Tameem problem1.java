/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication77;

import java.util.Scanner;
 
public class JavaApplication77 {
    
public static int getInt(Scanner s, String prompt) {
    System.out.print(prompt);
    return s.nextInt();
}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("enter your age :");
        //String A =in.nextLine();
        System.out.println(getInt(in ,"enter your age :"));
        
        
    }
    
}
