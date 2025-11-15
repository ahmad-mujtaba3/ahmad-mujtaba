
package the.day.of.week;

import java.util.Scanner;


public class TheDayOfWeek {

    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        System.out.println("enter a number for chose of day"); 
       int number = input.nextInt();
       if (number == 0) 
            System.out.println (" today is saturday");
   
       else  if (number == 1)    
            System.out.println(" today is sunday");
       else if (number == 2)
            System.out.println(" today is monday");
       else if (number == 3)
            System.out.println(" today is tuesday");
         else if (number == 4)  
            System.out.println(" today is wednesday");  
          else if (number == 5) 
            System.out.println(" today is thursday"); 
          else  if (number == 6)
            System.out.println(" today is friday"); 
            else
                System.out.println(" the number is not for day");  
                
             
    }
    
}
