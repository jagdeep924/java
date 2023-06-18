package week6;



public class Programtest {
	
	/*
	 * Student Name: Jagdeep KAUR
	 * Lab Professor:=Sapinderjit kaur
	 * Due Date: 15 june 2023
	 * Description: Lab Exam 1
	 */

	/*
	 * This class has a main method which is used to run basic tests on class
	 * kitchen.
	 */
	//declaring parameter;
	String sinks;
	String material;
	double capacity;

		/* entry point for the application, it instantiates two TunaFish
		 * and uses calls to get and set methods to test.
		 */
		public static void main(String[] args) {
			System.out.println("Testing No Argument Constructor, Get, Set methods:");
			Test obj1 = new Test();
			System.out.println("no parameter");
			System.out.println("sinks: " + obj1.getSinks());
			System.out.println("material: " + obj1.getMaterial());
			System.out.println("capacity: " + obj1.getCapacity());
			System.out.println(); // whitespace

			System.out.println("sinks: R Us, material: Stainless steel " +
			                   "capacity:30.0");
			obj1.setSinks("R Us");
			obj1.setMaterial("Stainless Steel");
			obj1.setCapacity(30.0);
			System.out.println(": " + obj1.getSinks());
			System.out.println("Species: " + obj1.getMaterial());
			System.out.println("Weight: " + obj1.getCapacity());
			System.out.println(); // whitespace
			
			System.out.println("Testing Overloaded Constructor sinks: Ceramic Co, " +
			                   "material: , capacity:22.2");
			Test obj2 = new Test("ceramic co", "material", 22.2);
			System.out.println("sinks: " + obj2.getSinks());
			System.out.println("materials: " + obj2.getMaterial());
			System.out.println("capacity: " + obj2.getCapacity());
			System.out.println(); // whitespace

			System.out.println("Jagdeep kaur");
		}
		
		/* Alternative solution, caution with using static method outside of main
		 
		 public static void main(String[] args) {
			System.out.println("Testing No Argument Constructor, Get, Set methods:");
			TunaFish fish1 = new TunaFish();
			System.out.println("Initial Object State");
			
			testTunaFishGetMethods(fish1); // see method below
			System.out.println(); // whitespace

			System.out.println("Setting genus: Thunnus, species: orientalis, " +
			                   "weight: 130");
			fish1.setGenus("Thunnus");
			fish1.setSpecies("orientalis");
			fish1.setWeight(130);
			
			testTunaFishGetMethods(fish1); // see method below
			System.out.println(); // whitespace
			
			System.out.println("Testing Overloaded Constructor genus: Thunnus, " +
			                   "species: thynnus, weight: 551");
			TunaFish fish2 = new TunaFish("Thunnus", "thynnus", 551);
			
			testTunaFishGetMethods(fish2); // see method below

			System.out.println("Program by Stanley Pieda");


		}
		
		// pass reference to a TunaFish object, then call get methods against
		// the referenced object.
		private static void testTunaFishGetMethods(TunaFish fishy){
		    System.out.println("Genus: " + fishy.getGenus());
			System.out.println("Species: " + fishy.getSpecies());
			System.out.println("Weight: " + fishy.getWeight());
		}
		 */

	}
