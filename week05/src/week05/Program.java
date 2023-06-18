package week05;
import java.util.Scanner;

public class Program{
	public static void main(String[] args)
	{   
		
		
	//Instantiation
		GasStation obj1= new GasStation();
		GasStation obj2= new GasStation();
	    GasStation obj3= new GasStation();
		Scanner scanner=new Scanner(System.in);
		
		
	//Declaring variables
		String name;
	    String address;
		double price ;
	    double average;
	    
	    
	    
		
		System.out.println("Welcome to Gas Station Program version 1 ");
	    System.out.println("Enter data for three gas stations");
		System.out.println();
	
	//Reading data from the user and setting acquired data to the GasStation Class
		
	   System.out.print("Enter name of Gas Station 1: ");
	   name= scanner.nextLine(); //reading input from user
	   obj1.setName(name);
	
	   System.out.print("Enter Address of Gas Station 1: ");
	   address=scanner.nextLine();
	   obj1.setAddress(address);
	
	   System.out.print("Enter Price of Gas Station 1: ");
	   price= scanner.nextDouble();
	   obj1.setPrice(price);
	   scanner.nextLine();//to ignore enter key after price,nextdouble() does not pick up enter key
	   
	 
	   System.out.print("Enter name of Gas Station 2: ");
	   name= scanner.nextLine();
	   obj2.setName(name);
	   
	   System.out.print("Enter Address of Gas Station 2: ");
	   address=scanner.nextLine();
	   obj2.setAddress(address);
	   
	   System.out.print("Enter Price for Gas Station 2: ");
	   price=scanner.nextDouble();
	   obj2.setPrice(price);
	   scanner.nextLine();
	 	
       System.out.print("Enter name of Gas Station 3: ");
	   name= scanner.nextLine();
       obj3.setName(name);
	   
	   System.out.print("Enter Address of Gas Station 3: ");
       address=scanner.nextLine();
	   obj3.setAddress(address);
   
       System.out.print("Enter Price for Gas Station 3: ");
       price=scanner.nextDouble();
       obj3.setPrice(price);
       scanner.nextLine();
	 
	 //close scanner
	   scanner.close();
	   
	   
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
