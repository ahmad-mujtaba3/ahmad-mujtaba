
package compute.change;

import java.util.Scanner;


public class ComputeChange {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("enter an amount in integer, for example 1156 for $11.56: ");
        int amount = input.nextInt();
        int RA = amount;
        int dollars = RA / 100;
        RA = RA % 100;
        int qourters = RA % 25;
        RA = RA % 25;
        int dimes = RA / 10;
        RA = RA % 10;
        int nickles = RA / 5;
        RA = RA % 5;
        int pennies = RA;
        System.out.println("your amount " + amount + "consist of:");
        System.out.println("   " + dollars + " dollars");
        System.out.println("   " + qourters + " qourtes");
        System.out.println("   " + dimes + " dimes");
        System.out.println("   " + nickles + " nickles");
        System.out.println("   " + pennies + " pennies");
    }
    
}
