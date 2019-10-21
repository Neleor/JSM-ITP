// this is an assignment for the JSM introduction to programming course
// the assignment here is as follows:
//
// Make a simple program that asks the name of the user, then greet the user.
//
// Ask the body temperature of the user and tell if he/she has a fever.

package nl.rug.jsm.introduction_to_programming.day1;

import java.util.Scanner;

/**
 * this is a class description, here we tell people what our class does
 * @author OelenR
 *
 */
public class Main {

	/**
	 * this is a method description, here we tell people what our method does
	 * @param args here we describe what this parameters does or why its required
	 */
	public static void main(String[] args) {
		// create the Object
		Scanner scanner = new Scanner(System.in);
		// tell the user what we are going to ask them
		System.out.println("what is your name?");
		// get the name the user entered
		String text = scanner.nextLine();
		// greet the user
		System.out.println("hello "+text);
		
		// again, tell the user what we are going to ask them
		System.out.println("what is your body temperature in Celcius?");
		// get the number the user entered
		double number = scanner.nextDouble();
		// check the number the user entered and tell if he/she has a fever (operators?)
		if(number > 37.0) { //bigger than 37
			System.out.println("you have a fever");
		}
		else if(number <= 37.0 && number>35.0) { //equal or smaller than 37 and more than 35
			System.out.println("you do not have a fever");
		}
		else if(number <= 35.0) { //equal or smaller than 35
			System.out.println("you do not have a fever, but you're pretty cold");
		}
		else {
			// all the conditions are already captured by the other if/elseifs, so the program should never end up here
			System.out.println("what are you doing here?");
		}
	}
}