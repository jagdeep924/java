package week05;

/* Creates three instances of GasStation class with user input
 * Created By: Jagdeep Kaur
 * Created On: 13 june,2023
 */

public class Program2 {

	public static void main(String args[]) {
		GasStation obj1 = new GasStation();
		GasStation obj2 = new GasStation();
		GasStation obj3 = new GasStation();
		
		
		//Declaring variables
			//String name;
		    //String address="";
		    //double price = 0.0;
		    double average;
		    
		    
		    
			
			System.out.println("Welcome to Gas Station Program version 3 ");
		    System.out.println("Enter data for three gas stations");
			System.out.println();
		
		obj1.initializeFromKeyboard();
		obj2.initializeFromKeyboard();
		obj3.initializeFromKeyboard();
		
		
		//Printing output back to the user
		   
	    System.out.println( obj1.outputReport());
		System.out.println( obj2.outputReport());
		System.out.println( obj3.outputReport());
	   
	  //Finding average
	 
	   average =(obj1.getPrice()+obj2.getPrice()+obj3.getPrice())/3.0;
	   System.out.println("Average is : " + String.format("%.2f",average));
	 
	   
	  System.out.println();
		  
	  System.out.println("Program by Jagdeep Kaur");
		
	}
}
