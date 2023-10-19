import java.io.Serializable;
/**
 * 
 * @author Franklyn Oliha
 * Student Number: 1611857
 * Date:20/12/2021
 *
 */
// Address class implementing serialization 
public class Address implements Serializable {
	
	// Address field to store Street attributes 
	private String street;
	//Address field to store town attributes 
	private String town;
	//Address field to store postcode attributes 
	private String postcode;
	
	/**
	 * Parameter constructor to set attribute values of  address class
	 * attributes
	 * @param street
	 * @param town
	 * @param postcode
	 */
	public Address(String street, String town, String postcode) {

		this.street = street;
		this.town = town;
		this.postcode = postcode;
	}
/**
 * Method to get street inputs
 * @return street 
 */
	public String getStreet() {
		return street;
	}

	/**
	 * Set the street inputs 
	 * @param street
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * Method to get Town inputs
	 * 
	 * @return Town
	 */
	public String getTown() {
		return town;
	}

	/**
	 * Set town inputs
	 * @param town
	 */
	public void setTown(String town) {
		this.town = town;
	}
	
/**
 * Method to get postcode 
 * @return postcode 
 */
	public String getPostcode() {
		return postcode;
	}

	/**
	 * Method to set postcode 
	 * @param postcode
	 */
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	/**To String method
	 * Returns formatted string of the attribute values 
	 */
	public String toString() {
		return " [Street: " + street + ", Town: " + town + ", Postcode: " + postcode + "]";
	}
	
	

}
