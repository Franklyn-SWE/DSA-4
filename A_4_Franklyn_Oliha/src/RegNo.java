import java.io.Serializable;
/**
 * Registration Number Class
 * @author Franklyn Oliha
 * Student Number: 1611857
 * Date: 20/12/2021.
 *
 */
public class RegNo implements Serializable, Comparable <RegNo> {
	//Stores registration number attributes 
	private final String regNo;
	/**
	 * Parameter constructor to initialised and sets attribute values of Registration number class.
	 * @param regNo Returns registration numbers
	 */
    public RegNo (String regNo) {
		
		this.regNo = regNo;
		
	}

    /**
     *  hashCode methods - overrides 
     */
    public int hashCode() {
		if(regNo == null)
			return 0;
		else
			return regNo.hashCode();
	}
	
	/**
	 * Overriding the default equals method in Object.
	 
	 */
	public boolean equals(Object o){
		RegNo rn = (RegNo) o;
		return (rn != null && regNo.equals(rn.regNo));
	}
	
	/**To String method
	 * Returns formatted string of the attribute values 
	 */
	public String toString(){
		return "  <" + regNo + ">";
	}
     
    
	/**
	 * Comparable method to compare registration numbers 
	 */
	public int compareTo(RegNo r) {
		if(r ==null)
			return -1;
		else 
			return regNo.compareTo(r.regNo);
		
	
	}
/**GETTER
 * Gets the registration number
 * 
 * @return
 */
	public String getRegNo() {
		return regNo;
	}	
	
	


}
