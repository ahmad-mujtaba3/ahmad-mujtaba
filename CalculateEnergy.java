
package calculate.energy;

import java.util.Scanner;


public class CalculateEnergy {

   
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);   
        System.out.println("enter the amount of water in kilogram: ");
        double M = input.nextDouble();
        System.out.println("enter the initial temperature in celsius: ");
        double T = input.nextDouble();
        System.out.println("enter the fainal temperature in celsius: ");
        double FT = input.nextDouble();
        double Q = M * (FT - T) * 4184;
        System.out.println("the energy needed is " + Q + "joules.45");
          
        
        
        
        
        
        
        
        
        
        
        
        
          }
    
}
