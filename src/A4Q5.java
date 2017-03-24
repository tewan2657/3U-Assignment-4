
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input  
        Scanner input = new Scanner(System.in);

        // asking the user to type in thier name  
        System.out.println("Please enter your name");

        // scanning in their name into a variable 
        String name = input.nextLine();

        // make a variable to keep asking the user for their mark on each test 
        int first = 0;
        while (first < 5) {
            first++;

            //Asking the user what they got on thier first test
           
                System.out.println("What was the " + first + " test out of?");
            
            // let user enter what the test was out of 
            int test1 = input.nextInt();
            int test2 = input.nextInt();
            int test3 = input.nextInt();
            int test4 = input.nextInt();
            int test5 = input.nextInt();

            // ask the user what their mark was 
            System.out.println("What mark did you get?");

            // let the user type in their mark they got 
            int mark1 = input.nextInt();
            int mark2 = input.nextInt();
            int mark3 = input.nextInt();
            int mark4 = input.nextInt();
            int mark5 = input.nextInt();


            //List their test scores 
            double percent = 100 * (test1 / mark1);
             percent = 100 * (test2 / mark2);
             percent = 100 * (test3 / mark3);
             percent = 100 * (test4 / mark4);
             percent = 100 * (test5 / mark5);
            
                    



        }
        System.out.println("Test Scores for " + name);

        int Num = 0;
        while (Num < 5) {
            Num++;
            System.out.println("test " + Num);

        }

    }
}