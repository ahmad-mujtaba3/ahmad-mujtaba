
package future.investment.value;

import java.util.Scanner;

public class FutureInvestmentValue {

   
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
        System.out.println("enter investment amount: ");
        double IN = input.nextDouble();
        System.out.println("enter annual interest rate in percentage: ");
        double AIR = input.nextDouble();
        System.out.println("enter number of years: ");
        int numberofyears = input.nextInt();
        double MIR = AIR / 1200;
        double FIV = IN * Math.pow(1 + MIR, numberofyears * 12);
        System.out.println("accumlated value is $"
                + "\n" + FIV);
    }
    
}
