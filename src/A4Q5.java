
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
    	
    	//Asking the user what they got on their first test
    	System.out.println("What was the first test out of?");
    	// let user enter what the test was out of
    	double test1 = input.nextInt();
    	// ask the user what their mark was
    	System.out.println("What mark did you get?");
    	// let the user type in their mark they got
    	int mark1 = input.nextInt();
    	//Asking the user what they got on their second  test
    	System.out.println("What was the second test out of?");
    	// let user enter what the test was out of
    	double test2 = input.nextInt();
    	// ask the user what their mark was
    	System.out.println("What mark did you get?");
    	// let the user type in their mark they got
    	int mark2 = input.nextInt();
    	//Asking the user what they got on their third  test
    	System.out.println("What was the third test out of?");
    	// let user enter what the test was out of
    	double test3 = input.nextInt();
    	// ask the user what their mark was
    	System.out.println("What mark did you get?");
    	// let the user type in their mark they got
    	int mark3 = input.nextInt();
    	//Asking the user what they got on their fourth test
    	System.out.println("What was the fourth test out of?");
    	// let user enter what the test was out of
    	double test4 = input.nextInt();
    	// ask the user what their mark was
    	System.out.println("What mark did you get?");
    	// let the user type in their mark they got
    	int mark4 = input.nextInt();
    	//Asking the user what they got on their fifth  test
    	System.out.println("What was the fifth test out of?");
    	double test5 = input.nextInt();
    	// ask the user what their mark was
    	System.out.println("What mark did you get?");
    	// let the user type in their mark they got
    	int mark5 = input.nextInt();
    	
     	
    	// calculate the percentage of each test
    	double percent1 = Math.round((mark1/test1) * 100);
    	double percent2 = Math.round((mark2 / test2) * 100);
    	double percent3 = Math.round((mark3 / test3) * 100);
    	double percent4 = Math.round((mark4 / test4) * 100);
    	double percent5 = Math.round((mark5 / test5) * 100);
    	
    	// listing the test scores of each test
    	System.out.println("Test Scores for " + name);
    	System.out.println("Test 1: " + percent1 +"%");
    	System.out.println("Test 2: " + percent2 +"%");
    	System.out.println("Test 3: " + percent3 +"%");
    	System.out.println("Test 4: " + percent4 +"%");
    	System.out.println("Test 5: " + percent5 +"%");
    	
    	double average = (percent1 + percent2 + percent3 + percent4 + percent5) / 5 ;
    	System.out.println("");
    	System.out.println("Average: " + average +"%");


    }
}