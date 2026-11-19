/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication86;

/**
 *
 * @author STUDENT
 */
public class Bankaccount {
     private int accountNumber ;
    private String accountHolder ;
    private double Balance ;
    
    
    public Bankaccount(){    
    accountNumber = 0;
    accountHolder= "";
    Balance = 0;
}
    public Bankaccount( int accountNumber , String accountHolder , double Balance){
        
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.Balance = Balance;
    }
    
     public void deposit(double amount){
     
         Balance += amount;
 
     }
     public void withdraw(double amount){
     if (amount <= Balance){
     Balance -= amount;
     }
     else{
     System.out.println("Something went Wrong");
 }
     }
     }
    
    

