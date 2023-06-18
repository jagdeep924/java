package week05;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args)
	{ 
		//Instantiation
				Scanner scanner=new Scanner(System.in);
				
				
			//Declaring variables
				STring name;
			   String address="";
			   double price = 0.0;
			    double average;
			    
			    
			    
				
				System.out.println("Welcome to Gas Station Program version 2 ");
			    System.out.println("Enter data for three gas stations");
				System.out.println();
			
			//Reading data from the user and setting acquired data to the GasStation Class
				
			   System.out.print("Enter name of Gas Station 1: ");
			   name= scanner.nextLine(); //reading input from user
			   
			
			   System.out.print("Enter Address of Gas Station 1: ");
			   address=scanner.nextLine();
			   
			
			   System.out.print("Enter Price of Gas Station 1: ");
			   price= scanner.nextDouble();
			   scanner.nextLine();
			   
			   GasStation obj1 = new GasStation(name, address, price);		//uses overloaded constructor
			 
			   System.out.print("Enter name of Gas Station 2: ");
			   name= scanner.nextLine();
			   
			   
			   System.out.print("Enter Address of Gas Station 2: ");
			   address=scanner.nextLine();
			   
			   
			   System.out.print("Enter Price for Gas Station 2: ");
			   price=scanner.nextDouble();
			   scanner.nextLine();
			   
			   GasStation obj2 = new GasStation(name, address, price);  //uses overloaded constructor
			 	
			   System.out.print("Enter name of Gas Station 3: ");
			   name= scanner.nextLine();
			   
			   
			   System.out.print("Enter Address of Gas Station 3: ");
			   address=scanner.nextLine();
			   
			   
			   System.out.print("Enter Price for Gas Station 3: ");
			   price=scanner.nextDouble();
			   scanner.nextLine();
			   
			   GasStation obj3 = new GasStation(name, address, price); //uses overloaded constructor
			 
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
