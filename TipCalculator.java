
package tip.calculator;

import java.util.Scanner;


public class TipCalculator {

   
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);  
        System.out.println("enter the subtotal: ");
        double subtotal = input.nextDouble();
        System.out.println("enter the gratuity rate (%): ");
        double gratuityrate = input.nextDouble();
        double gratuity = subtotal * (gratuityrate / 100);
        double total = subtotal + gratuity;
        System.out.println("the gratuity is $" + gratuity);
        System.out.println("the total is $" + total);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
