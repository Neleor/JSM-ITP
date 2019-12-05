package nl.rug.jsm.day4.filereadexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	/**
	 * the starting point of the application
	 * @param args any command line arguments
	 */
	public static void main(String[] args) {
		// create the Main class
		Main main = new Main();
		
		// the location of the file
		String fileLocation = "resources/students.tsv";
		
		// call the method that just prints each line
		//main.printLines(fileLocation);
		
		// call the method that gives an example of String splitting
		//main.printSplitStringExample();
		
		// call the method that gives an example of String parsing
		//main.parseStringsExample();
		
		// call the method that puts it all together
		//main.averagePointsStudentsFromFile(fileLocation);
		
		// call the method that shows another example of putting it together
		//main.printStudentsWithExtraCurriculars(fileLocation);
		
		// call the method that shows how a list works
		//main.listExample();
		
		// call a method that gets a List returned
		//ArrayList<Double> volumes = main.listExampleReturn();
		
		// call a method that gives an example of iterating over a list
		//main.listExampleIterating();
		
		// call a method that shows how a map works
		// main.mapExample();
		
		// call a method that gets a Map returned
		//main.mapExampleReturn();
		
		// call a method that shows how objects can be added to a map
		main.getAllStudentObjectsPerIds(fileLocation);
	}
	
	/**
	 * print the contents of a file
	 * @param fileLocation the full location of the file
	 */
	public void printLines(String fileLocation) {
		// the 'try' keyword indicates that we do something that might fail
		try {
			// the scanner is going to open the file for us
			Scanner scanner = new Scanner(new File(fileLocation));
			// then we will read the file line by line
			while (scanner.hasNextLine()) {
				// grab the line we are at
				String line = scanner.nextLine();
				// print the line
				System.out.println(line);
			}
			// it is good practice to close the file when you are done with it
			scanner.close();
		}
		// if what we are trying between brackets fails, we end up in the 'catch'
		catch (FileNotFoundException e) {
			// lets print that something went wrong
			System.out.println("an error occured reading the file");
		}
	}

	/**
	 * print a String that was split
	 */
	public void printSplitStringExample() {
		// create the String we will split
		String stringToSplit = "1 30 n";
		// split the String on the space character
		String[] splitString = stringToSplit.split(" ");
		// print what we managed to split
		for(int i = 0; i < splitString.length; i++) {
			// get from the array
			String splitPart = splitString[i];
			// print what we grabbed
			System.out.println(splitPart);
		}
	}
	
	/**
	 * show an example of parsing Strings
	 */
	public void parseStringsExample() {
		// create some numbers
		String number1String = "10.0";
		String number2String = "20.0";
		// try to sum them together
		String addedNumbersString = number1String+number2String;
		// show the result
		System.out.println(addedNumbersString); // that's not what we wanted right?
		
		// parse the Strings to doubles
		double number1 = Double.parseDouble(number1String);
		double number2 = Double.parseDouble(number2String);
		// sum them again
		double addedNumbers = number1+number2;
		// show the result
		System.out.println(addedNumbers); // that's more like it
	}
	
	/**
	 * calculate the average score from a file
	 * @param fileLocation the location of the file with the scores
	 */
	public void averagePointsStudentsFromFile(String fileLocation) {
		// we're going to count the number of students, so start at zero
		int numberOfStudents = 0;
		// for an average we first need to sum all the points, so start that at zero
		double summedPoints = 0.0;
		// now start reading the file
		try {
			// the scanner is going to open the file for us
			Scanner scanner = new Scanner(new File(fileLocation));
			// then we will read the file line by line
			while (scanner.hasNextLine()) {
				// grab the line we are at
				String line = scanner.nextLine();
				// split the line by the tab character
				String[] splitString = line.split("\t");
				// to make sure we are not grabbing stuff that is not there, we check if the size is big enough
				if(splitString.length >= 2) {
					// the points were at the second spot, so index 1
					String pointsAsString = splitString[1];
					// now we need to parse it to a number
					double points = Double.parseDouble(pointsAsString);
					// add it to the summed points
					summedPoints = summedPoints + points;
					// increment the number of students
					numberOfStudents = numberOfStudents+1;
				}
			}
			// close the file
			scanner.close();
			// now lets calculate the average
			double averagePoints = summedPoints/numberOfStudents;
			// and show it to the user
			System.out.println(averagePoints);
		}
		// if what we are trying between brackets fails, we end up in the 'catch'
		catch (FileNotFoundException e) {
			// lets print that something went wrong
			System.out.println("an error occured reading the file");
		}
	}
	
	/**
	 * print which students have done extra curriculars
	 * @param fileLocation the location of the file with the scores
	 */
	public void printStudentsWithExtraCurriculars(String fileLocation) {
		try {
			// the scanner is going to open the file for us
			Scanner scanner = new Scanner(new File(fileLocation));
			// then we will read the file line by line
			while (scanner.hasNextLine()) {
				// grab the line we are at
				String line = scanner.nextLine();
				// split the line by the tab character
				String[] splitString = line.split("\t");
				// to make sure we are not grabbing stuff that is not there, we check if the size is big enough
				if(splitString.length >= 3) {
					// the extracurricular flag was at the third spot, so index 2
					String extracurricularDone = splitString[2];
					// check if it was set to 'y'
					if(extracurricularDone.equalsIgnoreCase("y")) {
						// the student ID was in the first spot, so grab that at index 0
						String studentID = splitString[0];
						// print the student ID
						System.out.println(studentID);
					}
				}
			}
			// close the file
			scanner.close();
		}
		// if what we are trying between brackets fails, we end up in the 'catch'
		catch (FileNotFoundException e) {
			// lets print that something went wrong
			System.out.println("an error occured reading the file");
		}
	}
	
	/**
	 * show an example of a list
	 */
	public void listExample() {
		// create a list that we will fill with doubles
		ArrayList<Double> volumesInML = new ArrayList<>();
		// add some stuff to the list
		volumesInML.add(1.2);
		volumesInML.add(2.5);
		volumesInML.add(5.3);
		// grab the value we added second, so index 1
		double volume2 = volumesInML.get(1);
		System.out.println(volume2);
	}
	
	/**
	 * show an example where a list was returned
	 * @return the list we created
	 */
	public ArrayList<Double> listExampleReturn() {
		// create a list that we will fill with doubles
		ArrayList<Double> volumesInML = new ArrayList<>();
		// add some stuff to the list
		volumesInML.add(1.2);
		volumesInML.add(2.5);
		volumesInML.add(5.3);
		// return the list with its contents
		return volumesInML;
	}
	
	/**
	 * show an example of where a list is created and iterated over
	 */
	public void listExampleIterating() {
		// create a list that we will fill with doubles
		ArrayList<Double> volumesInML = new ArrayList<>();
		// add some stuff to the list
		volumesInML.add(1.2);
		volumesInML.add(2.5);
		volumesInML.add(5.3);
		// looping through a list is almost the same as an array
		for(int i = 0; i < volumesInML.size(); i++) {
			// grab the volume
			double volume = volumesInML.get(i);
			// print the volue
			System.out.println(volume);
		}
	}
	
	
	/**
	 * get all student IDs from a file
	 * @param fileLocation the location of the file
	 * @return a list with all the student IDs in it
	 */
	public ArrayList<String> getAllStudentIds(String fileLocation){
		// create our list of student IDs
		ArrayList<String> studentIDs = new ArrayList<>();
		try {
			// the scanner is going to open the file for us
			Scanner scanner = new Scanner(new File(fileLocation));
			// then we will read the file line by line
			while (scanner.hasNextLine()) {
				// grab the line we are at
				String line = scanner.nextLine();
				// split the line by the tab character
				String[] splitString = line.split("\t");
				// to make sure we are not grabbing stuff that is not there, we check if the size is big enough
				if(splitString.length >= 1) {
					// the student ID was in the first spot, so grab that at index 0
					String studentID = splitString[0];
					// add the student ID to our list
					studentIDs.add(studentID);
				}
			}
			// close the file
			scanner.close();
		}
		// if what we are trying between brackets fails, we end up in the 'catch'
		catch (FileNotFoundException e) {
			// lets print that something went wrong
			System.out.println("an error occured reading the file");
		}
		// return the list we created
		return studentIDs;
	}
	
	/**
	 * show an example of how a map works
	 */
	public void mapExample() {
		// create our map
		HashMap<String, Double> volumePerPatient = new HashMap<>();
		// add some key value pairs
		volumePerPatient.put("patient1", 1.2);
		volumePerPatient.put("patient2", 4.5);
		volumePerPatient.put("patient3", 3.2);
		// check if a key is there with 'contains'
		if(volumePerPatient.containsKey("patient2")) {
			// grab the value for that key
			double volume = volumePerPatient.get("patient2");
			// print that volume
			System.out.println(volume);
		}
	}
	
	/**
	 * shows an example where a map was returned
	 * @return the map we created
	 */
	public HashMap<String, Double> mapExampleReturn(){
		// create our map
		HashMap<String, Double> volumePerPatient = new HashMap<>();
		// add some key value pairs
		volumePerPatient.put("patient1", 1.2);
		volumePerPatient.put("patient2", 4.5);
		volumePerPatient.put("patient3", 3.2);
		// return the map we created
		return volumePerPatient;
	}
	
	
	/**
	 * get all student IDs from a file
	 * @param fileLocation the location of the file
	 * @return a with the student IDs as keys and their points as values
	 */
	public HashMap<String, Integer> getAllStudentPointsPerIds(String fileLocation){
		// create our map
		HashMap<String, Integer> studentPointsPerIds = new HashMap<>();
		try {
			// the scanner is going to open the file for us
			Scanner scanner = new Scanner(new File(fileLocation));
			// then we will read the file line by line
			while (scanner.hasNextLine()) {
				// grab the line we are at
				String line = scanner.nextLine();
				// split the line by the tab character
				String[] splitString = line.split("\t");
				// to make sure we are not grabbing stuff that is not there, we check if the size is big enough
				if(splitString.length >= 2) {
					// the student ID was in the first spot, so grab that at index 0
					String studentID = splitString[0];
					// the points was in the second spot, so grab that at index 1
					String pointsAsString = splitString[1];
					// remember, we have to parse Strings to numbers
					int points = Integer.parseInt(pointsAsString);
					// now add the entry in our map
					studentPointsPerIds.put(studentID, points);
				}
			}
			// close the file
			scanner.close();
		}
		// if what we are trying between brackets fails, we end up in the 'catch'
		catch (FileNotFoundException e) {
			// lets print that something went wrong
			System.out.println("an error occured reading the file");
		}
		// return the list we created
		return studentPointsPerIds;
	}
	
	/**
	 * get all student from a file
	 * @param fileLocation the location of the file
	 * @return a with the student IDs as keys and their Objects as values
	 */
	public HashMap<String, Student> getAllStudentObjectsPerIds(String fileLocation){
		// create our map
		HashMap<String, Student> studentObjectsPerIds = new HashMap<>();
		try {
			// the scanner is going to open the file for us
			Scanner scanner = new Scanner(new File(fileLocation));
			// then we will read the file line by line
			while (scanner.hasNextLine()) {
				// grab the line we are at
				String line = scanner.nextLine();
				// split the line by the tab character
				String[] splitString = line.split("\t");
				// to make sure we are not grabbing stuff that is not there, we check if the size is big enough
				if(splitString.length >= 3) {
					// the student ID was in the first spot, so grab that at index 0
					String studentID = splitString[0];
					// the points was in the second spot, so grab that at index 1
					String pointsAsString = splitString[1];
					// remember, we have to parse Strings to numbers
					int points = Integer.parseInt(pointsAsString);
					// now grab the extracurricular
					String extraCirAsString = splitString[2];
					// set a default
					boolean extraCir = false;
					// check if it was a 'y'
					if(extraCirAsString.equalsIgnoreCase("y")) {
						extraCir = true;
					}
					// now create the student object
					Student student = new Student(studentID, points, extraCir);
					// now add the entry in our map
					studentObjectsPerIds.put(studentID, student);
				}
			}
			// close the file
			scanner.close();
		}
		// if what we are trying between brackets fails, we end up in the 'catch'
		catch (FileNotFoundException e) {
			// lets print that something went wrong
			System.out.println("an error occured reading the file");
		}
		// return the list we created
		return studentObjectsPerIds;
	}
}
