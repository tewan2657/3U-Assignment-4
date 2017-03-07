
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner to get user input 
        Scanner input = new Scanner(System.in);

        //Asking the user to tye their name 
         System.out.println("Please enter your name");
         
          // scanning in their name into a variable 
        String name2 = input.nextLine();
        
         //saying hello to the user 
         System.out.println("Hello " + name2 + ". How are your today?" );
         
    }
}
