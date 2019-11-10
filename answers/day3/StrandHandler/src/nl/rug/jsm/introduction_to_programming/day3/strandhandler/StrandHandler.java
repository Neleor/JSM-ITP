// this is an assignment for the JSM introduction to programming course
// the assignment here is as follows:
//
// create an application that can:
// - calculate the GC percentage of a DNA String (GCATTAGG DNA strand has 0.5 GC percentage for example)
// - calculate the melting temperature of a DNA String (formula is (nr of T or A * 2) + (nr of C or G * 4) )
// - get a complement of a DNA String (A matches to T, G to C, thus the complement of AACGTC is TTGCAG)
// - get the reverse complement of a DNA String (so the complement reversed, the reverse complement of AACGAG is CTCGTT)
package nl.rug.jsm.introduction_to_programming.day3.strandhandler;

import java.util.Scanner;

/**
 * this is a class description, here we tell people what our class does
 * @author OelenR
 *
 */
public class StrandHandler {
// wait, what? The class is not named main?! No, it doesn't have to be
	
	/**
	 * the start of our application
	 * @param args any arguments the user may have supplied us with
	 */
	public static void main(String[] args) {
		// create the Object
		Scanner scanner = new Scanner(System.in);
		// ask the user what they want
		System.out.print("what do you want?\n"
				+ "\t1. GC percentage\n"
				+ "\t2. melting temperature\n"
				+ "\t3. complement\n"
				+ "\t4. reverse complement\n");
		// get the option the user entered
		int option = scanner.nextInt();
		// ask the user to enter their DNA strand
		System.out.println("enter your DNA strand");
		// get the strand
		String strand = scanner.next();
		// to the appropriate thing
		if(option == 1) {
			double gcPercentage = calculateGCPercentage(strand);
			System.out.println("the GC percentage is "+gcPercentage);
		}
		else if(option == 2) {
			double meltingTemperature = calculateMeltingTemperature(strand);
			System.out.println("the melting temperature is "+meltingTemperature);
		}
		else if(option == 3) {
			String complement = getComplementaryDNAString(strand);
			System.out.println("the complementary strand is "+complement);
		}
		else if(option == 4) {
			String reverseComplement = getReverseComplementaryDNAString(strand);
			System.out.println("the complementary strand is "+reverseComplement);
		}
		else {
			System.out.println("you chose an invalid option");
		}
		// close the scanner
		scanner.close();
	}
	
	/**
	 * calculate the GC percentage of a DNA strand
	 * @param dnaStrand the DNA strand to calculate the GC percentage for
	 * @return the GC percentage
	 */
	private static double calculateGCPercentage(String dnaStrand) {
		// fetch the number of G and C bases
		int nrOfGCs = getNumberOfGCs(dnaStrand);
		// get the total number of bases
		int lengthOfStrand = dnaStrand.length();
		// calculate the percentage
		double percentage = (double) nrOfGCs/lengthOfStrand; // for this to work, we need to cast one of the values to a double
		return percentage;
	}
	
	/**
	 * get the number of G or C bases in a DNA Strand
	 * @param dnaStrand the strand to check for the number of G or C bases
	 * @return the number of G or C bases in the DNA Strand
	 */
	private static int getNumberOfGCs(String dnaStrand) {
		// initialize the value
		int nrOfGCs = 0;
		// get the length to know how many characters to check
		int lengthOfStrand = dnaStrand.length();
		// check for each character by position
		for(int i = 0; i< lengthOfStrand; i++) {
			// get the base at that position in the strand
			char base = dnaStrand.charAt(i);
			// we cast to uppercase to make it easier on ourselves
			if(Character.toUpperCase(base) == 'C' || Character.toUpperCase(base) == 'G') {
				nrOfGCs++;
			}
			else if(Character.toUpperCase(base) == 'T' || Character.toUpperCase(base) == 'A') {
				// nothing to do here
			}
			else {
				// there should only be these four bases, it not we should warn the user
				System.out.println("invalid bases detected");
			}
		}
		return nrOfGCs;
	}
	
	/**
	 * calculate the melting temperature of a DNA strand
	 * @param dnaStrand the DNA strand to calculate the melting temperature for
	 * @return the melting temperature
	 */
	private static double calculateMeltingTemperature(String dnaStrand) {
		int nrOfGCs = 0;
		int nrOfATs = 0;
		// check for each character by position
		for(int i = 0; i< dnaStrand.length(); i++) {
			// get the base at that position in the strand
			char base = dnaStrand.charAt(i);
			// we cast to uppercase to make it easier on ourselves
			if(Character.toUpperCase(base) == 'C' || Character.toUpperCase(base) == 'G') {
				nrOfGCs++;
			}
			else if(Character.toUpperCase(base) == 'T' || Character.toUpperCase(base) == 'A') {
				nrOfATs++;
			}
			else {
				// there should only be these four bases, it not we should warn the user
				System.out.println("invalid bases detected");
			}
		}
		// calculate the temperature
		double temperature = (nrOfATs*2)+(nrOfGCs*4);
		
		return temperature;
	}
	
	/**
	 * get the complement of a DNA stand
	 * @param dnaStrand the DNA strand to get the complement for
	 * @return the complement of the DNA strand
	 */
	private static String getComplementaryDNAString(String dnaStrand) {
		StringBuilder stringBuilder = new StringBuilder();
		// check for each character by position
		for(int i = 0; i< dnaStrand.length(); i++) {
			// get the base at that position in the strand
			char base = dnaStrand.charAt(i);
			// we cast to uppercase to make it easier on ourselves
			if(Character.toUpperCase(base) == 'C') {
				stringBuilder.append('G');
			}
			else if(Character.toUpperCase(base) == 'T') {
				stringBuilder.append('A');
			}
			else if(Character.toUpperCase(base) == 'G') {
				stringBuilder.append('C');
			}
			else if(Character.toUpperCase(base) == 'A') {
				stringBuilder.append('T');
			}
			else {
				// there should only be these four bases, it not we should warn the user
				System.out.println("invalid bases detected");
				stringBuilder.append('N');
			}
		}
		// make regular String
		String complementStrand = stringBuilder.toString();
		return complementStrand;
	}
	
	/**
	 * get the reverse complement of a DNA strand
	 * @param dnaStrand the DNA strand to get the reverse complement for
	 * @return the reverse complement of the DNA strand
	 */
	private static String getReverseComplementaryDNAString(String dnaStrand) {
		StringBuilder stringBuilder = new StringBuilder();
		// go through the String from the end to the beginning, take into account that the last index is always the length-1
		for(int i = dnaStrand.length()-1; i >= 0; i--) {				
			// get the base at that position in the strand
			char base = dnaStrand.charAt(i);
			// we cast to uppercase to make it easier on ourselves
			if(Character.toUpperCase(base) == 'C') {
				stringBuilder.append('G');
			}
			else if(Character.toUpperCase(base) == 'T') {
				stringBuilder.append('A');
			}
			else if(Character.toUpperCase(base) == 'G') {
				stringBuilder.append('C');
			}
			else if(Character.toUpperCase(base) == 'A') {
				stringBuilder.append('T');
			}
			else {
				// there should only be these four bases, it not we should warn the user
				System.out.println("invalid bases detected");
				stringBuilder.append('N');
			}
		}
		// make the regular String
		String reverseComplementStrand = stringBuilder.toString();
		return reverseComplementStrand;
	}
	
	
	/**
	 * get the reverse complement of a DNA strand
	 * @param dnaStrand the DNA strand to get the reverse complement for
	 * @return the reverse complement of the DNA strand
	 */
	private static String getReverseComplementaryDNAString2(String dnaStrand) {
		StringBuilder stringBuilder = new StringBuilder();
		// check for each character by position
		for(int i = 0; i< dnaStrand.length(); i++) {
			// get the base at that position in the strand
			char base = dnaStrand.charAt(i);
			// we cast to uppercase to make it easier on ourselves
			if(Character.toUpperCase(base) == 'C') {
				stringBuilder.append('G');
			}
			else if(Character.toUpperCase(base) == 'T') {
				stringBuilder.append('A');
			}
			else if(Character.toUpperCase(base) == 'G') {
				stringBuilder.append('C');
			}
			else if(Character.toUpperCase(base) == 'A') {
				stringBuilder.append('T');
			}
			else {
				// there should only be these four bases, it not we should warn the user
				System.out.println("invalid bases detected");
				stringBuilder.append('N');
			}
		}
		// reverse the String
		stringBuilder.reverse();
		// make regular String
		String reverseComplementStrand = stringBuilder.toString();
		return reverseComplementStrand;
	}
	
	/**
	 * get the reverse complement of a DNA strand
	 * @param dnaStrand the DNA strand to get the reverse complement for
	 * @return the reverse complement of the DNA strand
	 */
	private static String getReverseComplementaryDNAString3(String dnaStrand) {
		// get the complement
		String complement = getComplementaryDNAString(dnaStrand);
		// get the reverse
		String reverseComplement = reverseString(complement);
		return reverseComplement;
	}
	
	/**
	 * get the reverse of a String
	 * @param stringToReverse the String to reverse
	 * @return the reverse of the String
	 */
	private static String reverseString(String stringToReverse) {
		StringBuilder stringBuilder = new StringBuilder();
		// go through the String from the end to the beginning, take into account that the last index is always the length-1
		for(int i = stringToReverse.length()-1; i >= 0; i--) {
			stringBuilder.append(stringToReverse.charAt(i));
		}
		// create the String
		String reverse = stringBuilder.toString();
		return reverse;
	}
}
