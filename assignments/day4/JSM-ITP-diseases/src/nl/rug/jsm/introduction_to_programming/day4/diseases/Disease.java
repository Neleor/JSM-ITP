package nl.rug.jsm.introduction_to_programming.day4.diseases;

/**
 * This Object represents a disease
 * @author OelenR
 *
 */
public class Disease {
	// the name of the disease
	protected String diseaseName;
	
	/**
	 * get the disease name
	 * @return the disease name
	 */
	public String getDiseaseName() {
		return this.diseaseName;
	}
	
}

// this is the same object, but by saying it is 'abstract', it cannot be created, only a subclass can be created
//public abstract class Disease {
//	// the name of the disease
//	protected String diseaseName;
//	
//	/**
//	 * get the disease name
//	 * @return the disease name
//	 */
//	public String getDiseaseName() {
//		return this.diseaseName;
//	}
//	
//}