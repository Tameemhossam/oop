/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication80;
import java.util.Scanner;
/**
 *
 * @author STUDENT
 */
public class JavaApplication80 {

    public static double computeArea(double radius) {
        return Math.PI * radius * radius;
    }
    public static double computeArea(double length, double width) {
        return length * width;
    }
    public static double computeArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
    return 0.0;}
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the inputs");
        //double inputs = in.nextDouble();
        System.out.println(computeArea(5)); 
        System.out.println(computeArea(5,2));
        System.out.println(computeArea(5,3,true));
    
        
    }
    
}
