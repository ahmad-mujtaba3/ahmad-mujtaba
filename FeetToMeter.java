
package feet.to.meter;

import java.util.Scanner;


public class FeetToMeter {

    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in) ;  
        System.out.println("enter a volue in feet : ");
        double feet = input.nextDouble();
        double meter = feet * 0.305;
        System.out.println( feet + " feet is " + meter + " meters");
    
    }
    
}
