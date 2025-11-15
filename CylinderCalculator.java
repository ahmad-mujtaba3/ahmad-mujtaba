
package cylinder.calculator;

import java.util.Scanner;

public class CylinderCalculator {

    
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        System.out.println("enter the radius of the cylinder");   
        double radius = input.nextDouble();
        System.out.println("enter the length of the cylinder");
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println("the area is " + area);
        System.out.println("the volume is " + volume);
        input.close();
         
    }
    
}
