/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeometricTriangle;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class GeometricTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Enter the first point of the triangle
        System.out.print("Enter the first point of the triangle: ");
        double s1 = input.nextDouble();
        
        //Enter the second point of the triangle
        System.out.print("Enter the second point of the triangle: ");
        double s2 = input.nextDouble();
        
        //Enter the third point of the triangle
        System.out.print("Enter the third point of the triangle: ");
        double s3 = input.nextDouble();
        
        //compute the sum of the triangle
       double s = (s1 + s2 + s3)/2; 
       
       //compute Area of the triangle
       double area = Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
       
       //Display the computed Area of the Triangle
       System.out.println("The Area of the triangle is: " + (int)(area*100)/100.0);
       
    }
    
}
