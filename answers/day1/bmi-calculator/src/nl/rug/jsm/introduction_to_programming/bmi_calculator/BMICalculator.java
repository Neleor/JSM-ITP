// this was an assignment for the JSM introduction to programming course
// the assignment here is as follows:
//
// Make a simple program that asks the the user for their height in meters and weight in kilograms, and the tells them which BMI category they are in
package nl.rug.jsm.introduction_to_programming.bmi_calculator;

// imports, the Scanner is here because we need it
import java.util.Scanner;

/**
 * our class containing the 'public static void main' method and where we start
 * @author royoelen
 *
 */
public class BMICalculator {

	/**
	 * out application starting point, from here the magic happens
	 * @param args optional arguments, not used here
	 */
	public static void main(String[] args) {
		// import the scanner that we need to read whatever the user enters in the terminal/console
		Scanner scanner = new Scanner(System.in);
		
		// print so the user knows what to enter
		System.out.println("what is your height in meters?");
		// get the height the user entered
		double height = scanner.nextDouble();
		
		// if you are getting an 'exception' here or at the next question, you might need to replace the comma or dot in the number you enter or vice versa
		// depending on your region settings, either the dot or the comma gets interpreted as the decimal separator.
		
		// again, print so the user knows that to enter
		System.out.println("what is your weight in kgs?");
		// get the weight the user entered
		double weight = scanner.nextDouble();
		
		// calculate the BMI
		double bmi = (weight /(height*height));
		
		// evaluate what the condition is
		if(bmi < 15.0) {
			// and print our classification
			System.out.println("you are very severely underweight");
		}
		else if(bmi >= 15.0 && bmi <= 16.0) {
			System.out.println("you are severely underweight");
		}
		else if(bmi > 16.0 && bmi < 18.5) {
			System.out.println("you are underweight");
		}
		else if(bmi >= 18.5 && bmi < 25) {
			System.out.println("you are of normal weight");
		}
		else if(bmi >= 25 && bmi < 30) {
			System.out.println("you are overweight");
		}
		else if(bmi >= 30.0 && bmi < 35) {
			System.out.println("you are moderately obese");
		}
		else if(bmi >= 35.0 && bmi < 40) {
			System.out.println("you are severely obese");
		}
		else if(bmi > 40) {
			System.out.println("you are morbidly obese");
		}
		else {
			// we should have caught all possibilities already, so we should never end up in the else
			System.out.println("why are you here?");
		}
		
		// okay, it's not required, but still the decent thing to close something after we're done using it right?
		scanner.close();

	}

}
