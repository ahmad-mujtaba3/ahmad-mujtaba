
package minutes.to.years.days;

import java.util.Scanner;


public class MinutesToYearsDays {

   
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        System.out.println("enter the number of minutes: ");
        long minutes = input.nextLong();
        int minutesinday = 24 * 60; int daysinyear = 365;
        long totalday = minutes  / minutesinday;
        long years = totalday / daysinyear;
        long remainingdays = totalday % daysinyear;
        System.out.println(minutes + " minutes is approximately " + years + " years and " + remainingdays + " days");
    
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
