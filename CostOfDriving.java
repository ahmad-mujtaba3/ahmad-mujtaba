
package cost.of.driving;

import java.util.Scanner;

public class CostOfDriving {

   
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("enter the driving distance: ");
        double distance = input.nextDouble();
        System.out.print("enter miles per gallon: ");
        double MPG = input.nextDouble();
        System.out.print("enter price per gallon: ");
        double PPG = input.nextDouble();
        double COD = (distance / MPG) * PPG;
        System.out.printf("the cost of driving is $%.2f\n", COD);
                
                
    }
    
}
