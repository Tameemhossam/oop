/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication79; 
import java.util.Scanner;

public class JavaApplication79 {

      public static double Distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("please enter x1");
        double x1 = in.nextDouble();
        System.out.println("enter y1");
        double y1 = in.nextDouble();
        System.out.println("enter x2");
        double x2 = in.nextDouble();
        System.out.println("enter y2");
        double y2 = in.nextDouble();
        System.out.println( "distance = " + Distance (x1 , y1 , x2 , y2));
    }
    
}
