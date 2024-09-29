/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ComputeLoanUsingInputDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ComputeLoanUsingInputDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Enter annual interest rate
        String annualInterestRateString = JOptionPane.showInputDialog("Enter annual interest rate, for example 8.25: ");
        
        //Convert string to double
        double annualInterestRate = Double.parseDouble(annualInterestRateString);
        
        //Obtain Monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;
        
        //Enter number of years
        String numberOfYearsString = JOptionPane.showInputDialog("Enter the number of years as an integer, for example, 5: ");
        
        //Convert string to int
        int numberOfYears = Integer.parseInt(numberOfYearsString);
        
        //Enter loan amount
       String loanString = JOptionPane.showInputDialog("Enter loan amount, for example, 120000.95: ");
       
       //Convert String to double
       double loanAmount = Double.parseDouble(loanString);
       
       //Calculate payment
       double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1/ Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
       double totalPayment = monthlyPayment * numberOfYears * 12;
       
       //Format to keep two digits after the decimal point
       monthlyPayment = (int)(monthlyPayment * 100)/100.0;
        totalPayment = (int)(totalPayment * 100)/100.0;
        
        //Display Results
        String output = "The monthly payment is $" +  monthlyPayment + "\nThe total payment is $" + totalPayment;
        JOptionPane.showMessageDialog(null, output);
        
    }
    
}

