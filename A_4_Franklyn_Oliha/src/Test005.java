/**
 * Test Class 005.
 * This Test class will save all data for warning and reminder letter.
 * 
 * @author Franklyn Oliha
 * Student Number: 1611857
 * Date: 20/12/2021
 *
 */
public class Test005 {

	public static void main(String[] args) {

		// Registration numbers	
	    RegNo rg3 = new RegNo("AX 19 D");
		RegNo rg2 = new RegNo("XY 0899 F");
		RegNo rg1 = new RegNo("BC 3637 K");
		
		// Address
		Address ad1 = new Address("Erskene street", "Manchester","M40 2AB");
		Address ad2 = new Address("20 St James Street", "Bolton","BL13TL");
		Address ad3 = new Address("30 Davis Street", "Manchester","M17 5AA");
		
		
        // Keeper details
		Keeper k1 = new Keeper("John", "Paul",ad1);
		Keeper k2 = new Keeper("Peter", "James",ad2);
		Keeper k3 = new Keeper("Sam", "Thomson",ad3);
		
		
		// Cars
		Car c1 = new Car(rg1, "Mercedes Benz","E200","Blue", Month.MAY);
		Car c2 = new Car(rg2, "Toyota","C29","Black", Month.AUGUST);
		Car c3 = new Car(rg3, "Corola","X50","Yellow", Month.MARCH);
		
		

		DVLA dv = new DVLA();
		
		// Adding keepers with registration numbers		
		dv.AddKeepers(rg2, k2);
				
		dv.AddKeepers(rg3, k3);
				
		dv.AddKeepers(rg1, k1);
		
		dv.AddCars(rg1, c1);
			
		dv.AddCars(rg2, c2);
			
		dv.AddCars(rg3, c3);
					
		
	     // reminder letter alert
		dv.showReminderLetters(8);
			
		// warning letter alert
		dv.showWarnLetter(8);
			
		// Displaying serialization
		dv.serializingRandW();
		

	}

}
