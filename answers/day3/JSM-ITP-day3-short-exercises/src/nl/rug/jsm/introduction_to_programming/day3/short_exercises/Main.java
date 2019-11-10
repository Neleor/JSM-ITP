package nl.rug.jsm.introduction_to_programming.day3.short_exercises;

/**
 * the 'Main' our class that has the 'public static void main' method
 * @author royoelen
 *
 */
public class Main {

	/**
	 * the method that is called when our application starts
	 * @param args any command line arguments
	 */
	public static void main(String[] args) {
		// initialize our number to square
		int numberToSquare = 4;
		// call the function to get our squared number
		int numberThatWasSquared = getSquare(numberToSquare);
		// print the squared number
		System.out.println(numberThatWasSquared);
		
		// create the array of numbers
		int[] numbers = {1,5,7,9};
		printArrayContents(numbers);
		
		String putmeinarray = "Iambeingputinanarray";
		// use function
		char[] charactersThatWereReturned = stringToArray(putmeinarray);
		// use function to print result
		printArrayContentsCharacters(charactersThatWereReturned);
		
		// get an array of squares by calling the function with our numbers
		int[] squares = getSquares(numbers);
		// use function to print our result
		printArrayContents(squares);
		
		
		// use reverse function
		char[] reversed = reverseCharArray(charactersThatWereReturned);
		// print using method again
		printArrayContentsCharacters(reversed);
	}

	/**
	 * get the square of a number
	 * @param number the number to square
	 * @return the number squared
	 */
	public static int getSquare(int number) { // <-- remember, methods have opening brackets
		// squaring is the number times itself, so do that
		int squared = number*number;
		// return the value that we created
		return squared;
	} // <-- remember, method have closing brackets 
	
	/**
	 * print the contents of an integer array
	 * @param numbersReceived the array with integers to print
	 */
	public static void printArrayContents(int[] numbersReceived) {
		// go through all elements by increasing the index 
		for(int in = 0; in < numbersReceived.length; in++) { // <-- remember, loops have opening brackets
			// grab the element at the index
			int element = numbersReceived[in];
			// print the element and the index
			System.out.println("we are grabbing the element at index "+in+" which was "+element);
		} // <-- remember, loops have closing brackets
		// there is no 'return', because the method is 'void'
	}
	
	/**
	 * print the contents of a character array
	 * @param charactersReceived the array with characters to print
	 */
	public static void printArrayContentsCharacters(char[] charactersReceived) {
		// go through the characters
		for(int anotherIndex = 0; anotherIndex < charactersReceived.length; anotherIndex++) {
			// grab the character by index
			char element = charactersReceived[anotherIndex];
			// print the element
			System.out.print(element + " ");
		}
		// there is no 'return', because the method is 'void'
	}
	
	/**
	 * split a String into an array of characters
	 * @param toPutInArray the String to split into an array of characters
	 * @return the array of characters, created from splitting the String
	 */
	public static char[] stringToArray(String toPutInArray) {
		// initialize array with length of String
		char[] characters = new char[toPutInArray.length()];
		// loop through the String (much like an array loop)
		for(int index = 0; index < toPutInArray.length(); index++) {
			// grab the character
			char currentCharacter = toPutInArray.charAt(index);
			// put the character in array
			characters[index] = currentCharacter;
		}
		// return character array to the user
		return characters;
	}
		
	/**
	 * get the squared number for each number in an array of integers ({1,3,4} becomes {1,9,16})
	 * @param numbersToSquare the numbers as integers to square, in an array
	 * @return the numbers squared, in an array
	 */
	public static int[] getSquares(int[] numbersToSquare) {
		// create array to put squares in
		int[] squares = new int[numbersToSquare.length];
		// go through numbers
		for(int index = 0; index < numbersToSquare.length; index++) {
			// grab the number
			int number = numbersToSquare[index];
			// square the number
			int number2 = number*number;
			// put it in the array to return
			squares[index] = number2;
		}
		// return the values we created
		return squares;
		
	}
	
	/**
	 * reverse an array of characters ({'q','w','e','r'} becomes {'r','e','w','q'})
	 * @param charactersSupplied an array of characters that we need to reverse 
	 * @return the array of characters reversed
	 */
	public static char[] reverseCharArray(char[] charactersSupplied) {
		// create the array
		char[] reversed = new char[charactersSupplied.length];
		//create an index for putting elements into the new array
		int indexForPuttingIn = 0;
		// go through the old array from back to front
		for(int index = charactersSupplied.length-1; index >= 0; index--) {
			// grab our current character
			char character = charactersSupplied[index];
			// put in reversed array
			reversed[indexForPuttingIn] = character;
			// update our index for putting it in
			indexForPuttingIn++;
		}
		// return the array we created
		return reversed;
	}
		
}
