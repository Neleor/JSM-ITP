package nl.rug.jsm.introduction_to_programming.day4.diseases;

/**
 * this class represents the Tremor-Dominant subtype of Parkinsons
 * @author OelenR
 *
 */
public class TremorDominantParkinsons extends Parkinsons{
	
	/**
	 * the constructor for the class
	 */
	public TremorDominantParkinsons() {
		// tremor dominant Parkinsons patients don't usually have a higher fall risk
		super.fallRisk = FallRisk.LOW;
		// their sense of smell is often decreased
		super.scent = Scent.HYPOSMIA;
		// they don't often have REM sleep disorder
		super.rbd = false;
	}
	
}
