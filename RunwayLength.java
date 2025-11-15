
package runway.length;

import java.util.Scanner;


public class RunwayLength {

   
    public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
        System.out.println("enter take off speed v in m/s: "); 
        double v = input.nextInt();
        System.out.println("enter accslsration a in m/s2: ");
        double a = input.nextDouble();
        double length = (v * v) / (2 * a);
        System.out.println("the minimum runway length needed is " + length + "meters");
                
                
                
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
