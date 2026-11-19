/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication87;


public class Student {
    private String StudentName;
    private int  StudentID ;
    private double Grade;
    
    public Student(){
        StudentName = "";
        StudentID = 0 ;
        Grade = 0;
}
    public Student(String StudentName , int  StudentID , double Grade){
        
        this.StudentName = StudentName;
        this.StudentID = StudentID;
        this.Grade= Grade ;
    }
    public void updateGrade(double newGrade){
            Grade = newGrade;
}
    public boolean isPassed(){
        if(Grade >= 50){
     return true; }
        else
            return false; }
    
    public String getStudentName(){
        return StudentName;
    }
    public int  GetStudentID(){
        return StudentID;
    }
    public double GetGrade(){
        return Grade;
    }
}
