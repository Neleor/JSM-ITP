package nl.rug.jsm.introduction_to_programming.day4.immune_cell_classifier.raw;

public class RawOutput {
	private String barcode;
	private String[] highlyExpressedGenes;
	
	public RawOutput(String barcode, String[] highlyExpressedGenes) {
		this.barcode = barcode;
		this.highlyExpressedGenes = highlyExpressedGenes;
	}
	
	/**
	 * @return the highlyExpressedGenes
	 */
	public String[] getHighlyExpressedGenes() {
		return highlyExpressedGenes;
	}

	/**
	 * @return the barcode
	 */
	public String getBarcode() {
		return barcode;
	}
}
