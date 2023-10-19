import java.io.Serializable;
/**
 * Keeper Class
 * @author Franklyn Oliha
 * Student Number: 1611857
 * Date: 20/12/2021
 */
// Keeper Class 
public class Keeper implements Serializable, Comparable  <Keeper> {
	// Stores forname attributes 
    private String forname;
    //Stores surname attributes 
	private String surname;
	//Stores Address attributes 
	private Address address;
	
	/**
	 * Keeper parameter constructor 
	 * Sets attribute values of Keeper class.
	 * 
	 * @param forname The first name of Keeper
	 * @param surname The surname of Keeper
	 * @param address  Address of Keeper 
	 */
	public Keeper( String forname, String surname, Address address) {
	    
		this.forname = forname;
		this.surname = surname;
		this.address = address;
	}

	/**
	 * Returns the forname of the keeper
	 * @return forname
	 */
	public String getForname() {
		return forname;
	}

/**
 *  Sets forname of the Keeper
 * @param forname
 */
	public void setForname(String forname) {
		this.forname = forname;
	}

/**
 * Method to returns surname of the Keeper
 * @return surname
 */
	public String getSurname() {
		return surname;
	}

/**
 * Sets Surname of the Keeper
 * @param surname
 */
	public void setSurname(String surname) {
		this.surname = surname;
	}


	/**
	 * Methods to returns address of the Keeper
	 * 
	 * @return Address
	 */
	public Address getAddress() {
		return address;
	}

/**
 *  Sets the address of the Keepers
 * @param address
 */
	public void setAddress(Address address) {
		this.address = address;
	}


	/**To String method
	 * Returns formatted string of the attribute values 
	 */
	public String toString() {
		return "Keeper [Forname: " + forname + ", Surname: " + surname + ", Address: " + address + "]";
	}


	/**
	 * Methods to invoked Keeper comparable 
	 */
	public int compareTo(Keeper k) {
	
		return 0;
	}
	
	
	

}
