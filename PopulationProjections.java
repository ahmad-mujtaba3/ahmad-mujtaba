
package population.projections;

import java.util.Scanner;


public class PopulationProjections {

    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
int secondsperyear = 365 * 24 * 60 * 60;
int  cpopulation = 31203286;
int birthevery = 7;
int deatevery = 13;
int newie = 45;
        System.out.println("enter the number of year: ");
        int year = input.nextInt();
        int bpv = secondsperyear / birthevery;
        int dpy = secondsperyear / deatevery;
        int ipy = secondsperyear / newie;
        int newpopulation = cpopulation + (bpv + ipy - dpy) * year;
        System.out.println("the population after " + year + " years is " + newpopulation);
                
            
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
