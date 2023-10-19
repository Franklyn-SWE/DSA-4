/**
 * Test Class 002.
 * This test class will convert HashMap to TreeMap and 
 * also confirmed that the tree is now in sorted order
 * to the registration number.
 * 
 * @author Franklyn Oliha
 * Student Number: 1611857
 * Date: 20/12/2021
 *
 */
public class Test002 {

	public static void main(String[] args) {
		
		DVLA dv = new DVLA();
		
	    // Registration numbers	
	    RegNo rg3 = new RegNo("AX 19 D");
		RegNo rg2 = new RegNo("XY 0899 F");
		RegNo rg1 = new RegNo("BC 3637 K");
		
		// Cars
		Car c1 = new Car(rg1, "Mercedes Benz","E200","Blue", Month.MAY);
		Car c2 = new Car(rg2, "Toyota","C29","Black", Month.AUGUST);
		Car c3 = new Car(rg3, "Corola","X50","Yellow", Month.MARCH);
	
	
		// Address
		Address ad1 = new Address("Erskene street", "Manchester","M40 2AB");
		Address ad2 = new Address("20 St James Street", "Bolton","BL13TL");
		Address ad3 = new Address("30 Davis Street", "Manchester","M17 5AA");
		
		// Keepers details
		Keeper k1 = new Keeper("John", "Paul",ad1);
		Keeper k2 = new Keeper("Peter", "James",ad2);
		Keeper k3 = new Keeper("Sam", "Thomson",ad3);
	
		
		
		
		// Adding cars with registration numbers
		dv.AddCars(rg1, c1);
		dv.AddKeepers(rg1, k1);
		
		dv.AddCars(rg2, c2);
		dv.AddKeepers(rg2, k2);
		
		dv.AddCars(rg3, c3);
		dv.AddKeepers(rg3, k3);
		
		
		//adding cars to the Tree
		dv.AddTree(rg1, c1);
		dv.AddTree(rg2, c2);
		dv.AddTree(rg3, c3);
		
		// Displaying all cars in  Tree
		System.out.println("Cars Tree displays in sorted order:");
		dv.showCarTree();
		
		
		
		// adding keepers to the Tree Map
		dv.AddKeeperTree(rg1,k1);
		dv.AddKeeperTree(rg2,k2);
		dv.AddKeeperTree(rg3,k3);
		
		System.out.println(" keepers Tree displays in sorted order:");
		dv.showKeeperTree();
		
}
		
	

	}


