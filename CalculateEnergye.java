
package calculate.energye;

import java.util.Scanner;


public class CalculateEnergye {

  
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in); 
        System.out.println("enter the amount of water in kilogram: ");
        double M = input.nextDouble();
        System.out.println("enter the initial temperature in celius: ");
        double IT = input.nextDouble();
        System.out.println("enter the final temperature in cesius: ");
        double FT = input.nextDouble();
        double Q = M * (FT - IT) * 4184;
        System.out.println("the energy needed is " + Q + "joules");
  
         
    }
    
}
