package compute.bmi;

import java.util.Scanner;

public class ComputeBMI {

   
    public static void main(String[] args) {
  Scanner input = new Scanner (System.in);
        System.out.println("enter wight in pounds: ");
        
        double WIP = input.nextDouble();
        System.out.println("enter height in inches: ");
        double HII = input.nextDouble();
        double WIK = WIP * 0.45359237;
        double HIM = HII * 0.0254;
        double bmi = WIK / (HIM * HIM);
        System.out.println("BMI is " + bmi);
     
    }
    
}
