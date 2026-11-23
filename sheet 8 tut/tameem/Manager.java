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
public class Manager extends Employee {
    private String department;
    private double allowance;
    public Manager(String name,int ID,double salary,String department,double allowance){
   super(ID,salary,name);
   this.allowance = allowance;
   this.department = department;
}
    @Override
     public double calculateBonus(){
     return (20/100)*salary;    
     }
    @Override
      public void displayInfo(){
          super.displayInfo();
          System.out.println("depratment :" + department);
          System.out.println("allowance :" + allowance);
      }
    @Override
      public String toString(){
          super.toString();
          return "department" + department + "allowance" +allowance;
      }
}

