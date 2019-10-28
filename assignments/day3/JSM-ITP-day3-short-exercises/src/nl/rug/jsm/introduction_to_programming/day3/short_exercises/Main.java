package nl.rug.jsm.introduction_to_programming.day3.short_exercises;

/**
 * starting class of our application
 *
 */
public class Main {

	/**
	 * starting method
	 * @param args
	 */
	public static void main(String[] args) {
		int square = getSquare(5);
		System.out.println(square);

		int[] someIntegers = {3,4,6,8};
		// TODO call the method to print them
		
		char[] myCharacters = getCharacters("thisistext");
		// TODO call the method
		
		// TODO call method to get squares of 'someIntegers'
		
		// TODO call method to reverse array, using the output of 'getCharacters'
	}
	
	/**
	 * get the square of a number
	 * @param numberToSquare the number to square
	 * @return the square of the number
	 */
	public static int getSquare(int numberToSquare) {
		// TODO make this work
		int squared = 0;
		return squared;
	}
	
	/**
	 * print the contents of an array
	 * @param contents the contents to print
	 */
	public static void printArrayContents(int[] contents) {
		// TODO print the content (loop?)
	}
	
	/**
	 * get array of characters from String
	 * @param string the String to get the characters from
	 * @return the characters in the String
	 */
	public static char[] getCharacters(String string) {
		// get the length for the array, should be the same as the String
		char[] characters = new char[string.length()];
		//TODO fill with characters
		return characters;
	}

	/**
	 * get the squares from an array of integers
	 * @param numbersToSquare the array of integers to square
	 * @return the integers that were supplied, squared
	 */
	public static int[] getSquares(int[] numbersToSquare) {
		//TODO implement method
	}
	
	/**
	 * reverse an array
	 * @param originalArray the array to reverse
	 * @return the original array, with its content reversed
	 */
	public static char[] reverseArray(char[] originalArray) {
		// TODO implement method
	}
	
}
