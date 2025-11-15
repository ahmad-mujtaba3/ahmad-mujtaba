
package population.projectioned;

import java.util.Scanner;


public class PopulationProjectioned {

    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     final int births = 31536000 / 7;
     final int deaths = 31536000 / 13;
     final int immigrants = 31536000 / 45;
        System.out.println("enter the number of years: ");
        int years = input.nextInt();
        int population = 312032486;
        int populationafteryears = population + years * (births - deaths + immigrants);
        System.out.println("the population after " + years + " years is " + populationafteryears);
     
        
        
         
        
    }
    
}
