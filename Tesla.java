package classes_vs_objects;

import java.util.Random;

public class Tesla {
	/* Factory specific attributes:
 		* The total number of cars produced at this factory.
 	*/
	private static int numberOfCarsManufactured = 0; //Factory/Class level variable/attribute
	
	public static int getTotalProducedCars() {
		return numberOfCarsManufactured;
	}
	
	/* Car specific attributes. A manufactured car/object must have the followings:
	 	* Model
	 	* Made
	 	* Year
	 	* Color
	 	* VIN Number. Random generated
 	*/
	
	//Attributes for future objects.
	
	private String model;
	private String made;
	private int year;
	private String color;
	private String VINumber; //write a method to generate random number
	
	//Constructor:
	
	public Tesla(String initialModel, String initialMade, int initialYear, String initialColor, String vinNumber) {
		this.model = initialModel;
		this.made = initialMade;
		this.year = initialYear;
		this.color = initialColor;
		this.VINumber = vinNumber;
		
		numberOfCarsManufactured++; // automatically increments on producing of a new car.
		
	}
	
	
	@Override
	public String toString() {
		String output = "Model: " + model + "\n" +
						"Made:	" + made + "\n" +
						"Year:	" + year + "\n" +
						"Color:	" + made + "\n" + 
						"VIN Number: " + (VINumber);
		return output;
	}
	
	
	

}
