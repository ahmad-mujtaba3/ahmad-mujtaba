
package sum.digits;

import java.util.Scanner;

public class SumDigits {

   
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in); 
        System.out.println("enter an integer between 0 and 1000: " );
        int number = input.nextInt();
        if (number < 0 || number > 1000){ System.out.println("invalid input please enter a number between 0 and 1000.");
        
        } else { int sum = 0; int temp = number;
        while (temp > 0) { sum += temp % 10;
        temp /=10;
        }
            System.out.println(" the sum of the digits in " + number + " is 34" + sum);
        }
              
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
