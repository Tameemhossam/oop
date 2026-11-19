package javaapplication87;

import java.util.Scanner;

public class JavaApplication87 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the number of the students:");
        int n = in.nextInt();
        
       
        Student[] Students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            in.nextLine();
            System.out.println("Enter Name for student " + (i + 1) + ": ");
            String Name = in.nextLine();
            System.out.println("Enter ID: ");
            int ID = in.nextInt();
            System.out.println("Enter Grade: ");
            double Grade = in.nextDouble();
            
            Students[i] = new Student(Name, ID, Grade);
        }
        
     
        System.out.println("Enter the index of the student whose grade needs to be updated (0 to " + (n - 1) + "):");
        int index = in.nextInt();
        
        if (index >= 0 && index < n) {
            System.out.println("Enter the new grade: ");
            double newGrade = in.nextDouble();
            Students[index].updateGrade(newGrade);
            System.out.println("Grade updated successfully");
        } else {
            System.out.println("Invalid index!");
        }
        
        
        System.out.println("ALL STUDENTS INFORMATION");
        for (int i = 0; i < n; i++) {
            String passStatus = Students[i].isPassed() ? "Passed" : "Failed";
            System.out.println("Index [" + i + "] -> Name: " + Students[i].getStudentName() + 
                               ", ID: " + Students[i].GetStudentID() + 
                               ", Grade: " + Students[i].GetGrade() + 
                               ", Status: " + passStatus);
        }
    }
}