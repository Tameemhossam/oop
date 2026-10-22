/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication75;

import java.util.Scanner;


public class JavaApplication75 {

 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Password");
        String pass= input.nextLine();
        if(ValidPass(pass)){
            System.out.println("Password is valid");
        }
        else{
            System.out.println("Password is invalid");
        }
            
    }
    public static boolean ValidPass(String pass){
        if(pass.length()<8){
            return false;
        }
        int d=0;
        int uppercase=0;
        for(int i=0;i<pass.length();i++){
            char ch=pass.charAt(i);
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }
            if(Character.isDigit(ch)){
                d++;
            }
            if(Character.isUpperCase(ch)){
                uppercase++;
            }
        }
        return d>=2&&uppercase>=1;
    }
}

