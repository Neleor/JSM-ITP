// this is an assignment for the JSM introduction to programming course
// Here, an example is shown of how extending classes, superclasses and subclasses work
// the assignment here is as follows:
//
// extend the application to have more diseases
//
// read the comments about the 'abstract' classes and try it. Which classes in your opinion should be abstract?

package nl.rug.jsm.introduction_to_programming.day4.diseases;

/**
 * start the application here
 * @author OelenR
 *
 */
public class Main {

	/**
	 * start the application
	 * @param args any parameters supplied on the command line
	 */
	public static void main(String[] args) {
		// create a disease that is Parkinsons, with the PIGD subtype
		Disease pgidParkinsons = new PIGDParkinsons();
		// create a disease that is Parkingsons, with the TD subtype
		Disease tremorDominantParkinsons = new TremorDominantParkinsons();
		// and one more disease
		Disease hiv = new HIV();
		// though these classes are different, they are all part of the 'Disease' superclass
		// because they are all of the same superclass, an array of that superclass can hold all of them
		Disease[] diseases = new Disease[3];
		diseases[0] = pgidParkinsons;
		diseases[1] = tremorDominantParkinsons;
		diseases[2] = hiv;
		// if we print their names though, we see that they are actually all different diseases
		for(int i = 0; i < diseases.length; i++) {
			System.out.println(diseases[i].getDiseaseName());
		}
		
		// the same works for any sub-/superclass. An array with only objects of the type Parkinsons, can still hold the subclasses
		Parkinsons[] parkinsons = new Parkinsons[2];
		// here we do something special, we tell the application that these 'Disease' classes we made, are of the subtype 'Parkinsons', and should be treated as such 
		parkinsons[0] = (Parkinsons) pgidParkinsons;
		parkinsons[1] = (Parkinsons) tremorDominantParkinsons;
		
		// parkinsons[1] = tremorDominantParkinsons; -> this would not work, the array can only contain Parkinsons objects, and the application only knows this is a 'Disease' object
		// parkinsons[1] = (Parkinsons) hiv; -> this would now work, this object is of the 'Disease' superclass, but not of the 'Parkinsons' subclass
		// parkinsons[1] = (HIV) hiv; -> this would not work, this object is of the 'Disease' superclass, but this array can only contain 'Parkinsons' class Objects

		// though this list contains the generic 'Parkinsons' class, printing the superclass shows that there are different fall risks
		for(int i = 0; i < parkinsons.length; i++) {
			System.out.println(parkinsons[i].getFallRisk());
		}
		
		// but what if we create a 'Disease' object without specifying which one it is?
		Disease disease = new Disease();
		// System.out.println(disease.getDiseaseName()); <- this would go wrong, because it was not set in the constructor
		// we can make it so that creating the superclass is not possible, by stating as 'abstract'
		
	}

}
