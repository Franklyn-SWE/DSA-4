import java.util.Map.Entry;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
/**
 * DVLA Class
 * @author Franklyn Oliha
 * Student Number: 1611857
 * Date: 20/12/2021
 *
 */

//DVLA Class Implementing Serialization 
public class DVLA implements Serializable {
	
	// Hash Map (Car class)
	private Map<RegNo, Car> cmap = new HashMap<RegNo, Car>();
	// Hash Map (Keeper class)
	private Map<RegNo, Keeper> kp = new HashMap<RegNo, Keeper>();
	
	// Converting to Tree Map
	private Map<RegNo, Car> tmap = new TreeMap<RegNo, Car>();
	// Reminder Letter's attribute
	
	private Map <RegNo,Keeper> ktmap = new TreeMap<RegNo, Keeper>();

	private TreeMap<RegNo, Keeper> remLetter = new TreeMap<RegNo, Keeper>();
	// Warning Letter's attribute
	private TreeMap<RegNo, Keeper> warnLetter = new TreeMap<RegNo, Keeper>();
		
  /**
   * Method to display the content of cars in HashMap (Natural order)
   */
		public void showAllCars(){
			Iterator<Entry<RegNo, Car>> iter = cmap.entrySet().iterator();;
			RegNo key;
			Car car;
			Map.Entry<RegNo, Car> entry;
			System.out.println("\n=========  " + cmap.getClass().getSimpleName() + "  ============");
			while(iter.hasNext()){
				entry = (Entry<RegNo, Car>)iter.next();
				key = entry.getKey();
				car = entry.getValue();
				if (car != null) {
					System.out.println(car);
				}
			}
			System.out.println("==================================");	
			
			

	}
		
		/**
		 * Method to convert Hash Map to Tree Map and display all cars
		 * in Tree Map
		 */
		public void showCarTree(){
			Iterator<Entry<RegNo, Car>> iter = tmap.entrySet().iterator();;
			RegNo key;
			Car car;
			Map.Entry<RegNo, Car> entry;
			System.out.println("\n=========  " + tmap.getClass().getSimpleName() + "  ============");
			while(iter.hasNext()){
				entry = (Entry<RegNo, Car>)iter.next();
				key = entry.getKey();
				car = entry.getValue();
				if (car != null) {
					System.out.println(car);
				}
			}
			System.out.println("==================================");		
		}
		
		// Methods to add cars in Tree 
		/**
		 * Methods to add cars to  Tree Map
		 * @param registration number
		 * @param Car Object 
		 */
		public void AddTree (RegNo rg, Car c) {
			
			tmap.put(rg,c);
			
			
		}

		
		/**
		 * Method to show all keepers in Hash Map with Registration number
		 * as the key.
		 * (Contents displayed in natural ascending order )
		 */
		public void showAllKeepers(){
			Iterator<Entry<RegNo, Keeper>> iter = kp.entrySet().iterator();;
			RegNo key;
			Keeper keeper;
			Map.Entry<RegNo, Keeper> entry;
			System.out.println("\n=========  " + kp.getClass().getSimpleName() + "  ============");
			while(iter.hasNext()){
				entry = (Entry<RegNo, Keeper>)iter.next();
				key = entry.getKey();
				keeper = entry.getValue();
				if (keeper != null) {
					System.out.println(key + ", " + keeper);
				}
			}
			System.out.println("================================");	

	}
		
		
		/**
		 * Methods to add Keepers
		 * @param registration number
		 * @param keeper Object 
		 */
				public void AddKeepers (RegNo rg, Keeper k) {
					
					kp.put(rg,k);					
					
		
				}
				
				
				// Methods to add cars
				/**
				 * Methods to add cars
				 * @param regristation number
				 * @param Car Object 
				 */
				public void AddCars (RegNo rg, Car c) {
					
					cmap.put(rg,c);		
					
				}
				
				

				/**
				 * Method to convert Hash Map to Tree Map and display all Keepers
				 * in Tree Map
				 */
				public void showKeeperTree(){
					Iterator<Entry<RegNo, Keeper>> iter = ktmap.entrySet().iterator();;
					RegNo key;
					Keeper keeper;
					Map.Entry<RegNo, Keeper> entry;
					System.out.println("\n=========  " + ktmap.getClass().getSimpleName() + "  ============");
					while(iter.hasNext()){
						entry = (Entry<RegNo, Keeper>)iter.next();
						key = entry.getKey();
						keeper = entry.getValue();
						if (keeper != null) {
							System.out.println(key + ", " + keeper);
						}
					}
					System.out.println("==================================");		
				}
				
				// Methods to add keepers in Tree 
				/**
				 * Methods to add Keepers to  Tree Map
				 * @param registration number
				 * @param Keeper Object 
				 */
				public void AddKeeperTree (RegNo rg, Keeper k) {
					
					ktmap.put(rg,k);
					
					
				}

				
				
				/**DVLA Reminder Letter!
				  Finding  cars that has expired tax in the current month
				 * 
				 * @param  Current Month
				 */
				public void showReminderLetters(int thisMonth) {
					
					for (HashMap.Entry< RegNo, Car> entry: cmap.entrySet()) {
						if (entry.getValue().getTaxExpiresEndMonth().getMonthsValues() == thisMonth){
							for (HashMap.Entry<RegNo,Keeper>entry2 :kp.entrySet()) {
								if(entry2.getKey().getRegNo().equals(entry.getKey().getRegNo())) {
									remLetter.put(entry2.getKey(),entry2.getValue());
								}
							}
							
						}
					}
					
					Iterator<Entry< RegNo, Keeper>> iter = remLetter.entrySet().iterator();;
					RegNo  key;
					Keeper kp;
					Map.Entry<RegNo,Keeper> entry;
					System.out.println("\n========================Reminder Letter==================================");
					while (iter.hasNext()) {
						entry = (Entry<RegNo, Keeper>)iter.next();
						key = entry.getKey();
						kp = entry.getValue();
						if (kp != null) {
							System.out.println(key + ""+ kp);
						}
						
					}
					System.out.println("=========================================================================");
				}
				
				// Finding car that has expired this month
				// sending a warning letter to all keepers that has expired tax this month
				
				/**
				 * Methods to write warning Letter
				 * 
				 * @param Current Month
				 */
				public void showWarnLetter(int thisMonth) {
					for (HashMap.Entry<RegNo, Car> entry: cmap.entrySet()) {
						if(entry.getValue().getTaxExpiresEndMonth().getMonthsValues()<thisMonth) {
							for(HashMap.Entry<RegNo, Keeper> entry2 : kp.entrySet()) {
								if(entry2.getKey().getRegNo().equals(entry.getKey().getRegNo())) {
									warnLetter.put(entry2.getKey(), entry2.getValue());
									
								}
							}
						}
					}
					
					Iterator<Entry <RegNo, Keeper >> iter = warnLetter.entrySet().iterator();;
					RegNo key;
					Keeper kp;
					Map.Entry<RegNo, Keeper> entry;
					System.out.println("========================Warning Letter===================================");
					
					while(iter.hasNext()) {
						entry = (Entry<RegNo, Keeper>)iter.next();
						key = entry.getKey();
						kp = entry.getValue();
						if (kp != null) {
							System.out.println(key + " "+ kp);
						}
					}
					System.out.println("=========================================================================");
					
					
				}
				
				
					/**
					 * Method to serialized Reminder and warning letter
					 * and stored in OneDrive with filename "FrankFile"
					 */
					public void serializingRandW() {
				
						
					
				
				try{	// code to save warning and reminder letter in One drive with filename "FrankFile"
					    
					 
					FileOutputStream fos = new FileOutputStream("C:\\Users\\44794\\OneDrive\\FrankFile.txt");// choose your own path and file.
					ObjectOutputStream oos = new ObjectOutputStream(fos);   
					oos.writeObject(remLetter);
					oos.writeObject(warnLetter);
					oos.close();
					System.out.println("Success!");
			 
				   }catch(Exception ex){
					   ex.printStackTrace();
				   }
				   try {
						FileInputStream fis = new FileInputStream("C:\\Users\\44794\\OneDrive\\FrankFile.txt");// Choose your own path and file.
						ObjectInputStream ois = new ObjectInputStream(fis);
						
						// serialising remainder letter attributes (Object 1)
						@SuppressWarnings("unchecked")
						Map<RegNo,Keeper> f1 = (Map<RegNo, Keeper>) ois.readObject();
						System.out.println(""+ f1);
						
						// Serializing warning letter attributes (Object 2)
						@SuppressWarnings("unchecked")
						Map<RegNo,Keeper> f2 = (Map<RegNo, Keeper>) ois.readObject();
						System.out.println(""+ f2);
						ois.close();
						
						// De-serializing file 
						System.out.println("De-serialized file: " + f1 + f2 );// File overrides toString
					} catch (Exception e) {
						e.printStackTrace(); 
					}
			   }

				
}
