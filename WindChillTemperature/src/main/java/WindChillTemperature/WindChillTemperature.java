/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WindChillTemperature;

import java.util.Scanner;
/**
 *
 * @author user
 */
public class WindChillTemperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);
         
        //Enter the value of the outside temperature
        System.out.print("Enter the value of the outside Temperature in Fahrenheit: ");
        double outsideTemp = input.nextDouble();
        
        //Enter the wind speed in miles per hour
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();
        
        if (windSpeed >= 2.0) {
            if ((outsideTemp >= -58.0) && (outsideTemp <= 41.0)) {
                double windChill = 35.74 + (0.6215 * outsideTemp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * outsideTemp * Math.pow(windSpeed, 0.16));
                System.out.println("The wind chill index is: " + (int)(windChill*10000)/10000.0);
            }
            else
                System.out.println("you have entered an invalid outside Temperature, pls try again!");
        }
        else
            System.out.println("you have entered an Wind Speed value, pls try again!");
    }
    
}
