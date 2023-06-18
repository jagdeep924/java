package week6;

public class Test {
	/*
	 * Student Name: Jagdeep Kaur
	 * Lab Professor: Sapinderjit Kaur
	 * Due Date: 15 June,2023
	 * Description: Lab Exam 1
	 */

	/*
	 * This class has a main method which is used to run basic tests on class
	 * program:Kitchen
	 */
	
	//declaring variable
	String sinks;
	String material;
	double capacity;
	String report;
	
	
	
	
	public Test()//no argument

	{
			
	}
	public Test(String sinks, String material, double capacity)//multiple argument
	{
		//Sinks R Us”, material: “stainless steel”, and capacity 30.0
		
		
		
		this.sinks =sinks;
	    this.material=material;
		this.capacity=capacity;
	
		}
	public String getSinks() {
		return sinks;
	}
	public void setSinks(String sinks) {
		this.sinks = sinks;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
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

}
