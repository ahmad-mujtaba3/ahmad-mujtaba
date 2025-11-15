
package average.speed.km;


public class AverageSpeedKm {

    
    public static void main(String[] args) {
      double distancemiles = 24.0;
      double hours = 1.0;
      double minutes = 40.0;
      double seconds = 35.0;
      double miletokm = 1.6;
      double distancekm = distancemiles * miletokm;
      double totalhours = hours + (minutes / 60) + (seconds / 3600);
      double averagespeedkm = distancekm / totalhours;
        System.out.println("average speed in kilometer per hour = " + averagespeedkm);
    
    }
    
}
