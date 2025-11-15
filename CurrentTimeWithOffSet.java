
package current.time.with.off.set;

import java.util.Scanner;


public class CurrentTimeWithOffSet {

   
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in); 
        System.out.println("enter the time zone offset to GMT: ");
        int offset = input.nextInt();
        long totalmilliseconds = System.currentTimeMillis();
        long totalseconds = totalmilliseconds / 1000;
        long currentseconds = totalseconds % 60;
        long totalminutes = totalseconds / 60;
        long currentminute = totalminutes % 60;
        long totalhours = totalminutes / 60;
        long currenthour = (totalhours + offset) % 24;
        if (currenthour < 0){ currenthour += 24;}
        System.out.println("currens time is " + currenthour + ":" + currentminute + ":" + currentseconds);
        
            
            
            
            
            
            
            
            
            
            
            
            
            
            
           }
    
}
