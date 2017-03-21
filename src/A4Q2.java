
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // scanner to get user input  
        Scanner input = new Scanner(System.in);
        
       // asking the user to type in a number in inches 
       System.out.println("Please enter the measurement in inches you wish to convert");
      
       //letting user type in number
       double inches = input.nextDouble();
       
       //convert inches to centimetres 
        System.out.println(inches*2.54);
       
       // give them the answer 
        System.out.println( inches + " inches is the same as " + inches*2.54 + " cm");
       
       
       
       
       
       
       
       
       
       
       
    }
}
