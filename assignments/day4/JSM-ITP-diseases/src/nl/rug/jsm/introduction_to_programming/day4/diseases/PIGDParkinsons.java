package nl.rug.jsm.introduction_to_programming.day4.diseases;

/**
 * this class represents the PIGD subtype of Parkinsons
 * @author OelenR
 *
 */
public class PIGDParkinsons extends Parkinsons{
	
	/**
	 * the constructor for the class
	 */
	public PIGDParkinsons() {
		// PIGD Parkinson patients often have higher fall risk
		super.fallRisk = FallRisk.HIGH;
		// their ability to smell is usually not decreased
		super.scent = Scent.NORMOSMIA;
		// they do often have REM sleep disorder
		super.rbd = true;
	}
}
