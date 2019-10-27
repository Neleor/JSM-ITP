// this is an assignment for the JSM introduction to programming course
// the assignment here is as follows:
//
// create an application that can:
// - calculate the GC percentage of a DNA String (GCATTAGG DNA strand has 0.5 GC percentage for example)
// - calculate the melting temperature of a DNA String (formula is (nr of T or A * 2) + (nr of C or G * 4) )
// - get a complement of a DNA String (A matches to T, G to C, thus the complement of AACGTC is TTGCAG)
// - get the reverse complement of a DNA String (so the complement reversed, the reverse complement of AACGAG is CTCGTT)
package nl.rug.jsm.introduction_to_programming.day3.strandhandler;

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
		// TODO get our DNA strand from somewhere
		
		// TODO maybe ask the user what they want to do with the strand?
		
		// TODO call the appropriate method
	}
	
	/**
	 * calculate the GC percentage of a DNA strand
	 * @param dnaStrand the DNA strand to calculate the GC percentage for
	 * @return the GC percentage
	 */
	private static double calculateGCPercentage(String dnaStrand) {
		// TODO actually calculate it
		
		// let's try returning the value for a change
		return 0.0;
	}
	
	/**
	 * calculate the melting temperature of a DNA strand
	 * @param dnaStrand the DNA strand to calculate the melting temperature for
	 * @return
	 */
	private static double calculateMeltingTemperature(String dnaStrand) {
		// TODO actually calculate it
		
		// returning the value
		return 0.0;
	}
	
	// I'm sure you can manage to write your own javadoc now
	private static String getComplementaryDNAString(String dnaStrand) {
		// TODO get the complement of the supplied DNA strand
		
		return "";
	}
	
	
	// TODO create a method to get the reverse complement
	
}
