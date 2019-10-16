package nl.rug.jsm.introduction_to_programming.day4.diseases;

/**
 * this class represents the Parkinsons disease
 * @author OelenR
 *
 */
public class Parkinsons extends Disease{
	
	/**
	 * the fallrisk represented in an enum
	 * this is an enum, this is sort of a multiple choice type of value
	 *
	 */
	public enum FallRisk{
		HIGH,
		LOW
	}
	
	/**
	 * the patients ability to smell in an enum
	 * this is an enum, this is sort of a multiple choice type of value
	 *
	 */
	public enum Scent{
		NORMOSMIA,
		HYPOSMIA
	}
	
	// the values stored
	protected boolean rbd;
	protected FallRisk fallRisk;
	protected Scent scent;
	
	/**
	 * the constructor of the class
	 */
	public Parkinsons() {
		// we set the disease name
		super.diseaseName = "Parkinsons";
	}
	
	/**
	 * get the risk the patient has of falling
	 * @return the risk of the patient of falling
	 */
	public FallRisk getFallRisk() {
		return this.fallRisk;
	}
	
	/**
	 * get the patients ability to smell
	 * @return the patients ability to smell
	 */
	public Scent getScent() {
		return this.scent;
	}
}
