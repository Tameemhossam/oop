/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ass6p1;

public class Ass6p1 {

    public static void main(String[] args) {
      Student s1 = new Student();
        Student s2 = new Student("20261234", "Omar", 3.2);

        s2.setGPA(3.8);

        System.out.println("Student 1:");
        System.out.println("ID: " + s1.getStudentID());
        System.out.println("Name: " + s1.getStudentName());
        System.out.println("GPA: " + s1.getGPA());
        System.out.println("Honor Student: " + s1.isHonorStudent());

        System.out.println();

        System.out.println("Student 2:");
        System.out.println("ID: " + s2.getStudentID());
        System.out.println("Name: " + s2.getStudentName());
        System.out.println("GPA: " + s2.getGPA());
        System.out.println("Honor Student: " + s2.isHonorStudent());
    }
}