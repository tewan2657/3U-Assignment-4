
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner to get user input 
        Scanner input = new Scanner(System.in);

        //Asking the user to type 4 numbers 
        System.out.println("Please enter 4 numbers");

        //letting user type in number
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double D = input.nextDouble();
        
        System.out.println("Your Numbers were " + A  + ", " +  B + ", " +  C + ", " + "and " +  D);
    }
}
