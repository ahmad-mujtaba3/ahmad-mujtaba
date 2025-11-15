package compound.volue;
import java.util.Scanner;


public class CompoundVolue {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
        System.out.println("enter the montly saving amount: ");
        double MS = input.nextDouble();
        double MIR = 0.05 / 12;
        double total = 0;
        total = (MS + total) * (1 + MIR); 
        total = (MS + total) * (1 + MIR);
        total = (MS + total) * (1 + MIR);
        total = (MS + total) * (1 + MIR);
        total = (MS + total) * (1 + MIR);
        total = (MS + total) * (1 + MIR);
        System.out.println("after the sixth month the acount volue is $" + total);
                
            
    }
    
}
