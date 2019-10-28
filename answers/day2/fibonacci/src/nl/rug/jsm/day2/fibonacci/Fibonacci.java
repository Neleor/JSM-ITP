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
		
		// use the printing method
		printFibonacci(10);
		
		// use any of our 'getting' methods		
		System.out.println("\nmethod1");
		int[] fibo = getFibonacci(10);
		for(int number : fibo) {
			System.out.print(number+" ");
		}
				
		System.out.println("\nmethod2");
		int[] numbersM2 = getFibonacciMethod2(10);
		for(int number : numbersM2) {
			System.out.print(number + " ");
		}
		
		System.out.println("\nmethod3");
		int[] numbersM3 = getFibonacciMethod3(10);
		for(int number : numbersM3) {
			System.out.print(number + " ");
		}
		
		
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
	
	
	/**
	 * this method gets the fibonacci range for a number of iterations
	 * @param nrOfIterations the iteratios the fibonacci range should be printed for
	 */
	public static int[] getFibonacci(int length) {	
		// initialize the array
		int[] fibonacci = new int[length];
				
		// initialize the numbers
		int previousPreviousNumber = 0;
		int previousNumber = 1;
		
		// put the first two numbers in
		fibonacci[0] = previousPreviousNumber;
		fibonacci[1] = previousNumber;
		
		// print the first numbers
		// System.out.print(previousPreviousNumber+" "+previousNumber);
		
		// we start from two, because we already initialized the first two values
		for(int i = 2; i < length; i++) {
			// the next number is the two previous ones summed
			int sumOfPreviousNumbers = previousNumber+previousPreviousNumber;
			// print the number
			// System.out.print(" "+sumOfPreviousNumbers);
			
			// add the number
			fibonacci[i] = sumOfPreviousNumbers;
			
			//reassign the numbers for the next round through the loop
			previousPreviousNumber = previousNumber;
			previousNumber = sumOfPreviousNumbers;
			
		}
		
		return fibonacci;
	}
	
	/**
	 * get the fibonacci sequence for a certain length
	 * @param length the length of the fibonacci you want
	 * @return the fibonacci sequence in an array
	 */
	public static int[] getFibonacciMethod2(int length) {
		// initialize the array to store the numbers
		int[] numbers = new int[length];
		// initialize the first two numbers
		numbers[0] = 0;
		numbers[1] = 1;
		// start at two, because we already initialized the first two
		for(int i = 2; i < length; i++) {
			// do a lookback to the previous number
			int previousNumber = numbers[i-1];
			// do a lookback to the number before the previous number
			int previousPreviousNumber = numbers[i-2];
			// calculate the sum
			int sumOfPreviousTwo = previousNumber+previousPreviousNumber;
			// set this sum at this position
			numbers[i] = sumOfPreviousTwo;
		}		
		return numbers;
	}
	
	/**
	 * get the fibonacci sequence for a certain length
	 * @param length the length of the fibonacci you want
	 * @return the fibonacci sequence in an array
	 */
	public static int[] getFibonacciMethod3(int length) {
		// initialize the array to store the numbers
		int[] numbers = new int[length];
		// initialize the first two numbers
		numbers[0] = 0;
		numbers[1] = 1;
		// we're filling the values ahead, so we need to stop looping earlier
		for(int i = 0; i < length-2; i++) {
			// get the number at our location
			int currentNumber = numbers[i];	
			// get the next number
			int nextNumber = numbers[i+1];
			// sum the two numbers
			int nextNextNumber = currentNumber+nextNumber;
			// set the sum as the number at the location after the two values we summed
			numbers[i+2] = nextNextNumber;
		}		
		return numbers;
	}


}
