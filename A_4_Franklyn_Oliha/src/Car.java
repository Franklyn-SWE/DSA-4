import java.io.Serializable;
/**
 * Car Class
 * @author Franklyn Oliha
 * Student Number: 1611857
 * Date: 20/12/2021
 *
 */
// Car class implementing comparable and serialization 
public class Car implements Serializable, Comparable <Car> {
	
	// Stores registration attributes 
    private final RegNo regNo;
    //Stores make attributes 
	private final String make;
	//Stores model attributes 
	private final String model;
	//stores colour attributes 
	private String colour;
	// stores Month Class attributes 
	private Month taxExpiresEndMonth;
	
	
	/**
	 * Car parameter constructor;
	 * sets attribute values of Car class.
	 * 
	 * @param regNo The regNo of the car
	 * @param make  The make of the car
	 * @param model  The model of the car
	 * @param colour The colour of the car
	 */
	public Car(RegNo regNo, String make, String model, String colour,Month taxExpiresEndMonth) {
		this.regNo = regNo;
		this.make = make;
		this.model = model;
		this.colour = colour;
		this.taxExpiresEndMonth = taxExpiresEndMonth;
	
	}
	
	/**
	 * Methods to compare car with registration  number
	 */
	public int compareTo(Car c) {
		if(c == null)
			return -1;
		else
			return regNo.compareTo(c.regNo);
	}
	
	/**
	 * Methods to compare of registration numbers are equal
	 */
	public boolean equals(Object o) {
		Car c = (Car) o;
		if (c == null)
			return false;
		else
			return regNo.equals(c.regNo);
	}

	/**
	 * Returns the colour of the car
	 * @return colour
	 */
	public String getColour() {
		return colour;
	}

	/**
	 * Sets a new colour for a car
	 * @param colour The new colour
	 */
	public void setColour(String colour) {
		this.colour = colour;
	}

	/**
	 * Returns the make of the car
	 * @return make
	 */
	public String getMake() {
		return make;
	}
	
/**
 * Returns the model of the car
 * @return model
 */
	public String getModel() {
		return model;
	}

	/**
	 * Returns car registration number
	 * @return registration number
	 */
		public RegNo getRegNol() {
			return regNo;
		}
		
	/**
	 * Methods to returns  Tax expiring month
	 * 
	 * @return tax expires month
	 */
	public Month getTaxExpiresEndMonth() {
		return taxExpiresEndMonth;
	}

/**
 * Sets Tax expiring month
 * @param taxExpiresEndMonth
 */
	public void setTaxExpiresEndMonth(Month taxExpiresEndMonth) {
		this.taxExpiresEndMonth = taxExpiresEndMonth;
	}
	
	/**To String method
	 * Returns formatted string of the attribute values 
	 */
	public String toString() {
		return "Car [RegNo: " + regNo + ", Make: " + make + ", Model: " + model + ", Colour: " + colour + ",Tax Expiring Month: " + taxExpiresEndMonth + " ]";
	}


	
	


}
