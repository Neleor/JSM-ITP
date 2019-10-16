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
