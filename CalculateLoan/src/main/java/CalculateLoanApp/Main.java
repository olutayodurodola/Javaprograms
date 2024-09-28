/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculateLoanApp;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CalculateLoan Calloan = new CalculateLoan();
        Scanner input = new Scanner(System.in);
        double annualInterestRate;
        int numberOfYears;
        double loanAmount;
        
        //Annual interest rate in percentage e.g. 7.25%
        System.out.print("Enter annual interest rate e.g. 7.25% : ");
        annualInterestRate = input.nextDouble();
        
        //Number of years
        System.out.print("Enter number of years as an integer e.g. 5: ");
        numberOfYears = input.nextInt();
        
         //Loan Amount
        System.out.print("Enter loan amount e.g. 12000.95 : ");
        loanAmount = input.nextDouble();
        
        
        double monthpymt = Calloan.monthlyPayment(loanAmount, annualInterestRate, numberOfYears);
        System.out.println("Monthly Payment is: $" + (int)(monthpymt*100)/100.0);
        
        double totalpymt = Calloan.totalPayment(loanAmount, annualInterestRate, numberOfYears);
        System.out.println("Total Payment is: $" + (int)(totalpymt*100)/100.0);
        
    }
    
}
