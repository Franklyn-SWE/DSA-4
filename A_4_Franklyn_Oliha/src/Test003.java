/**
 * Test Class 003.
 * This test class will map registration number to keepers
 * by listing registration numbers and keepers.
 * 
 * @author Franklyn Oliha
 * Student Number: 1611857
 * Date: 20/12/2021
 *
 */
public class Test003 {
	
public static void main(String[] args) {
	
	DVLA dv = new DVLA();

	       // Registration number
		    RegNo rg3 = new RegNo("AX 19 D");
			RegNo rg2 = new RegNo("XY 0899 F");
			RegNo rg1 = new RegNo("BC 3637 K");
			
		    // Address
			Address ad1 = new Address("Erskene street", "Manchester","M40 2AB");
			Address ad2 = new Address("20 St James Street", "Bolton","BL13TL");
			Address ad3 = new Address("30 Davis Street", "Manchester","M17 5AA");
			
			//Keeper details
			Keeper k1 = new Keeper("John", "Paul",ad1);
			Keeper k2 = new Keeper("Peter", "James",ad2);
			Keeper k3 = new Keeper("Sam", "Thomson",ad3);

			
		
		
			// Adding keepers with registration number
			
			dv.AddKeepers(rg2, k2);
			
			dv.AddKeepers(rg3, k3);
			
			dv.AddKeepers(rg1, k1);
			
			// Method to show all keepers
			System.out.println(" Mapping Registration Number to Keepers:");
			dv.showAllKeepers();
			
			
			// adding keepers to the Tree Map
			dv.AddKeeperTree(rg1,k1);
			dv.AddKeeperTree(rg2,k2);
			dv.AddKeeperTree(rg3,k3);
			
			// Display keepers in Tree Map
			System.out.println(" keepers Mapped with Reg number Tree displays in sorted order:");
			dv.showKeeperTree();
					
			
			
	}

}


