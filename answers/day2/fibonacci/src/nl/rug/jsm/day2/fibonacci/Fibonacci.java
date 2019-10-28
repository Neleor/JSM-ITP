// this is an assignment for the JSM introduction to programming course
// the assignment here is as follows:
//
// Starts with 1
// Each following number is the sum of the previous two numbers
// (0) 1 1 2 3 5 8 13 21 …etc.

package nl.rug.jsm.day2.fibonacci;

/**
 * this is a class description, here we tell people what our class does
 * @author OelenR
 *
 */
public class Fibonacci {

	/**
	 * this is a method description, here we tell people what our method does
	 * @param args here we describe what this parameters does or why its required
	 */
	public static void main(String[] args) {
		System.out.println("method1");
		printFibonacci(10);
	}

	/**
	 * this method prints the fibonacci range for a number of iterations
	 * @param nrOfIterations the iteratios the fibonacci range should be printed for
	 */
	public static void printFibonacci(int length) {	
		// initialize the numbers
		int previousPreviousNumber = 0;
		int previousNumber = 1;
		
		// print the first numbers
		System.out.print(previousPreviousNumber+" "+previousNumber);
		
		// we start from two, because we already initialized the first two values
		for(int i = 2; i < length; i++) {
			// the next number is the two previous ones summed
			int sumOfPreviousNumbers = previousNumber+previousPreviousNumber;
			// print the number
			System.out.print(" "+sumOfPreviousNumbers);
			
			//reassign the numbers for the next round through the loop
			previousPreviousNumber = previousNumber;
			previousNumber = sumOfPreviousNumbers;
			
		}
	}

}
