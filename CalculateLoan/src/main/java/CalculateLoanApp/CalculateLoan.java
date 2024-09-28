/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculateLoanApp;

/**
 *
 * @author user
 */
public class CalculateLoan {
    
  //  private double loan = 0.0;
    public CalculateLoan() {
     //   loan = 0.0;
    }
    
    public double monthlyPayment(double loanAmount, double yearlyRate, int noOfYears){
        double monthlyPaymentAmount;
        double monthlyrate = yearlyRate/1200.0;
        
        monthlyPaymentAmount = (loanAmount * monthlyrate)/(1 - (1/Math.pow((1 + monthlyrate),(noOfYears*12))));
        return monthlyPaymentAmount;
    }
    
    public double totalPayment (double loanAmount, double yearlyRate, int noOfYears){
        
        double monthlypaymt = monthlyPayment(loanAmount,yearlyRate, noOfYears);
        double totalPymt = monthlypaymt * noOfYears * 12;
        return totalPymt;
    }
    
}

