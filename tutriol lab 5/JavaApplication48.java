package javaapplication48;

import java.util.Scanner;

public class JavaApplication48 {

    public static void main(String[] args) {
        int a[] = new int[7];
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter the daily sales of 7 days:");
        
        int sum = 0;
        int count = 0; 
        double avarge = 0;
        
        for (int i = 0; i < 7; i++) {
            a[i] = in.nextInt();
            sum += a[i];          
            if (a[i] > 20) {
                count++;          
            }
    }
                    avarge = sum / 7;
        
        
        System.out.println("Total: " + sum);
        System.out.println("Days greater than 20: " + count);
        System.out.println("Average: " + avarge );
 }
}
