
package javaapplication8;

import java.util.Scanner;

public class JavaApplication8 {

    public static void main(String[] args) {
       
   Scanner input = new Scanner (System.in);     
        System.out.println("enter anumber");
        int number = input.nextInt();
        if 
                (number % 2 == 0)
            System.out.println( number + " is even number");
        else System.out.println( number + " is odd number");
    }
    
}
