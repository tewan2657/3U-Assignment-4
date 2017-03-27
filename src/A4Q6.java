
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
        Scanner input = new Scanner(System.in);

        // asking the user the speed limit
        System.out.println("Enter the speed limit");
        int speedl = input.nextInt();

        // asking the user of the recorded speed of the car
        System.out.println("Enter the recorded speed of the car:");
        int rspeed = input.nextInt();

        //person is within the speed limit
        if (rspeed < speedl) {
            System.out.println("Congratulations, you are within the speed limit!");
        } else {
            // person is going 1 to 20 km over speed limit
            if (rspeed > speedl && rspeed < speedl + 20) {
                System.out.println("You are speeding and your fine is $100.");
            }


            // person is going 21 to 30 km over speed limit
            if (rspeed > speedl + 20 && rspeed < speedl + 30) {
                System.out.println("You are speeding and your fine is $270.");

            }

            // person is going 31 km over speed limit
            if (rspeed > speedl + 30) {
                System.out.println("You are speeding and your fine is $500.");
            }
        }






    }
}
