
package average.accelerations;

import java.util.Scanner;


public class AverageAccelerations {

   
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        System.out.println("enter starting volacity v0 in m/s: ");
        double v0 = input.nextDouble();
        System.out.println("enter ending velacity v1 in m/s: ");
        double v1 = input.nextDouble();
        System.out.println("enre time span t in second: ");
        double t = input.nextDouble();
        double a = (v1 - v0) / t;
        System.out.println("the average acceleration is " + a);
    }
    
}
