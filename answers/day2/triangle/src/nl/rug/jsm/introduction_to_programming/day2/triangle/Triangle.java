  
// this is an assignment for the JSM introduction to programming course
// the assignment here is as follows:
//
//	Given a integer input, print out a triangle made out of plusses.
//
//	Input: 
//	5
//
//	Output: 
//	+
//	++
//	+++
//	++++
//	+++++
package nl.rug.jsm.introduction_to_programming.day2.triangle;

import java.util.Scanner;

/**
 * this is a class description, here we tell people what our class does
 * @author OelenR
 *
 */
public class Triangle {
	/**
	 * this is a method description, here we tell people what our method does
	 * @param args here we describe what this parameters does or why its required
	 */
	public static void main(String[] args) {
		// create the Object
		Scanner scanner = new Scanner(System.in);
		// ask the user for how far the triangle should go
		System.out.println("please enter the length of the base of the triangle");
		// get the number the user entered
		int number = scanner.nextInt();
		// call a method that prints the plusses triangle
		printPlusLinesIncreasing(number);
		printPlusLinesDecreasing(number);
		// close the scanner
		scanner.close();
	}
	
	/**
	 * print the plus triangle from top to bottom
	 * @param baseSize the base size of the triangle
	 */
	public static void printPlusLinesIncreasing(int baseSize) {
		// increase the number of plusses we want
		for(int i = 1; i <= baseSize; i++) {
			// print the plusses
			printPlusses(i);
		}
	}
	
	/**
	 * print plusses
	 * @param nrOfPlusses the number of plusses to print
	 */
	public static void printPlusses(int nrOfPlusses) {
		// print as much as supplied
		for(int i = 1; i <= nrOfPlusses; i++) {
			// print the '+'
			System.out.print("+");
		}
		// print a newline
		System.out.print("\n");
	}
	
	/**
	 * print the plus triangle from bottom to top
	 * @param baseSize
	 */
	public static void printPlusLinesDecreasing(int baseSize) {
		// decrease the number of plusses we want
		for(int i = baseSize; i >= 1; i--) {
			// print the plusses
			printPlusses(i);
		}
	}
	
}
