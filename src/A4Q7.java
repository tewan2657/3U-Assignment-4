
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a scanner
    	Scanner input = new Scanner(System.in);
 	
	int position = 1;
	// game will run until a player reaches the 100th position
    	while(position <= 100){
        	// if player gets to the 100th position, they win
        	if(position == 100){
            	System.out.println("You Win");
            	break;
        	}
    	// ask the user the sum of dice	
    	System.out.println("Enter sum of dice");
    	int dice = input.nextInt();
    	
    	// if number is 0 terminate game
    	if(dice == 0){
        	System.out.println("You Quit");
        	break;
        	}
    	// if number is less than 2 but greater than 12 break
        	if(dice < 2 || dice >12){
            	System.out.println("invalid entry");
            	break;
        	}
    	
    	// position incremented
     	position = position + dice;
    	
   	
    	// LADDERS
    	// ladder at 9, go to 34
    	if(position == 9){
        	position = position + 25;
    	}
    	//ladder at 40, go to 50
    	if(position == 40){
        	position = position + 24;
    	}
        	
     	// ladder at 67, go to 86
        	if(position == 67){
            	position = position + 19;
          	} 
            	
        	// SNAKES 	
     	// snake at 54, go to 19
    	if(position == 54){
        	position = position - 35;
    	}
    	//snake at 90, go to 48
    	if(position == 90){
        	position = position - 42;
    	}
        	
     	// snake at 99, go to 77
        	if(position == 99){
            	position = position - 22;
        	}
        	
        	
     	// if position is greater than 100, try again
    	if(position > 100){
        	position = position - dice;
        	System.out.println("Try Again");
    	}
    	else{
        	System.out.println("You are now on square " + position);
    	}
    	
    	
    	
    	
    	
	}
}
}

    

