
package average.acceleration;

import java.util.Scanner;


public class AverageAcceleration {

   
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);  
        System.out.println("enter starting velocity v0 in meter/second: ");
        double v0 = input.nextDouble();
        System.out.println("enter ending velocity v1 in meter/second: ");
        double v1 = input.nextDouble();
        System.out.println("enter time spand t in seconds: ");
        double t = input.nextDouble();
        double a = (v1 - v0) / t;
        System.out.println("the average acceleration is " + a + "meter/seconds squared.");
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
