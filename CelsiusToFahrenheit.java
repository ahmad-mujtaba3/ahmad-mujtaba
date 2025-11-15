
package celsius.to.fahrenheit;

import java.util.Scanner;


public class CelsiusToFahrenheit {

       public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
           System.out.println("inter a degree in celsius:");
           double celsius = input.nextDouble();
           double fahrenheit = (9 / 5) * celsius + 32;
           System.out.println( celsius + " celsius is" + fahrenheit + " fahrenheit");
                  
      
    }
    
}
