
package population.projection;


public class PopulationProjection {

   
    public static void main(String[] args) {
   long currentpopulation = 312_032_486;
   int secondsinyear = 365 * 24 * 60 * 60;
   double birthrate = 1.0 / 7;
   double deathrate = 1.0 / 13;
   double immigrantrate = 1.0 / 45;
   double annualchange = secondsinyear * (birthrate - deathrate + immigrantrate);
   for (int year = 1; year <= 5; year++) { long projectedpopulation = 
           (long)(currentpopulation + year * annualchange);
       System.out.println("year " + year + ":" + projectedpopulation);
           }
    }
           
           
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
