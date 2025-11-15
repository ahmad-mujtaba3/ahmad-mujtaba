
package calculate.interest;

import java.util.Scanner;


public class CalculateInterest {

    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        System.out.println("enter balance: ");
        double balance = input.nextDouble();
        System.out.println("enter annal interest rate (e.g., 3 for 3%): ");
        double AIR = input.nextDouble();
        double interest = balance * (AIR /1200);
        System.out.println("the interest is $" + interest);
            
    }
    
}
