package nl.rug.jsm.day4.filereadexample;

public class Student {
	private String studentID;
	private double points;
	private boolean hasExtracurriculars;
	
	/**
	 * constructor
	 * @param givenStudentId the student ID to assign
	 * @param givenPoints the points to assign
	 * @param givenExtraCir whether or not they have extra curricular activities
	 */
	public Student(String givenStudentId, double givenPoints, boolean givenExtraCir) {
		this.studentID = givenStudentId;
		this.points = givenPoints;
		this.hasExtracurriculars = givenExtraCir;
	}
	
	/**
	 * @return the studentID
	 */
	public String getStudentID() {
		return studentID;
	}
	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	/**
	 * @return the points
	 */
	public double getPoints() {
		return points;
	}
	/**
	 * @param points the points to set
	 */
	public void setPoints(double points) {
		this.points = points;
	}
	/**
	 * @return the hasExtracurriculars
	 */
	public boolean isHasExtracurriculars() {
		return hasExtracurriculars;
	}
	/**
	 * @param hasExtracurriculars the hasExtracurriculars to set
	 */
	public void setHasExtracurriculars(boolean hasExtracurriculars) {
		this.hasExtracurriculars = hasExtracurriculars;
	}
	
	
}
