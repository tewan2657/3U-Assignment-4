
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner to get user input 
        Scanner input = new Scanner(System.in);
        
        // asking the user to type in the cost of food at prom 
        System.out.println("How much does the food for prom cost?");
        // scanning the price into a variable 
        int food = input.nextInt();
        
        // asking the user to type in the cost of the DJ
        System.out.println("How much does the DJ cost?");
        int DJ = input.nextInt();

         // asking the user to type in the cost to rent the hall
        System.out.println("How much does it cost to rent the hall?");
        int hall = input.nextInt();
        
         // asking the user to type in the cost of decorations 
        System.out.println("How much does decorations cost?");
        int Dec = input.nextInt();
        
        
        // asking the user to type in the cost of Staff 
        System.out.println("How much does it cost for staff?");
        int staff = input.nextInt();
        
        
         // asking the user to type in the miscellaneous costs
        System.out.println("How much for miscellaneous costs?");
        int mis  = input.nextInt();
        
        int total = food + DJ + hall + Dec + staff + mis;
        
        // calculating the total price for prom 
        System.out.println("The total cost is " + "$" + total + ".");
        
        // asking the user to type in the cost of each ticket 
        System.out.println("How much does a ticket cost?");
        int tick = input.nextInt();
        
        // finding how many tickets are required to break even
        //rounding up 
        int even = (int)(Math.ceil(1.0*total/tick));
        
         // calculating the tickets required to break even 
        System.out.println("You will need to sell " + even + " tickets" + " to break even.");
        
        
        
    }
}
