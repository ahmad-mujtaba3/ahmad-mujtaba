
package average.speed;


public class AverageSpeed {

  
    public static void main(String[] args) {
     double distanceKm = 14.0; 
     double timeMinutes = 45.0;
     double timeSeconds = 30.0;
     double kmtoMiles = 1.0 / 1.6;
     double distanceMiles = distanceKm * kmtoMiles;
     double totalHours = (timeMinutes + timeSeconds / 60) / 60;
     double averageSpeed = distanceMiles / totalHours;
        System.out.println("average speed in miles per hour = " + averageSpeed);
    
    }
    
}
