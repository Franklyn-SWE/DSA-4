import java.io.Serializable;

/**
 * Months Enum Class
 * @author Franklyn Oliha
 * Student Number: 1611857
 * Date: 20/12/2021.
 *
 */
public enum Month implements Serializable {
	JANUARY(1), FEBRUARY(2), MARCH(3), APRIL(4), MAY(5), JUNE(6),
	JULY(7), AUGUST(8), SEPTEMBER(9), OCTOBER(10), NOVEMBER(11), DECEMBER(12);

	// stores the value of months
	private  int monthsValues;
	
	
	/**
	 * Parameter constructor that sets  the month values.
	 * @param monthsValues
	 */
	Month(int monthsValues){
		this.monthsValues = monthsValues;
		
	}
	/**
	 * Methods to get and returns the value of the months
	 * @return Month values 
	 */
	public int getMonthsValues () {
		return monthsValues;
	}
		

	
}
