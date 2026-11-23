/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication73;

/**
 *
 * @author STUDENT
 */
public class Employee {
    private String name ="";
    private int ID ;
    double salary;
    
    public Employee(){
        name = null;
        ID = 0;
        salary = 0; 
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int ID, double salary, String name) {
        this.ID = ID;
        this.salary = salary;
        this.name = name;
    }
    
    public double calculateBonus(){
        return salary *(10/100);
    }
    public double calculateBonus(double percentage){
        return salary=salary+(salary*percentage/100);
    }
    public void displayInfo(){
        System.out.println("name:" + name); 
        System.out.println("ID:"+ ID);
        System.out.println("Salary:"+ salary);
    }
      @Override 
    public String toString(){
        return "name" + name + "ID" + ID + "Salary" + salary;
    }
    
}
