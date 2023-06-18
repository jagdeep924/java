package week05;

public class GasStation {
	import java.util.Scanner;

	public   class GasStation {
		private String name;
		private String address;
		private double price;
		Scanner scanner = new Scanner(System.in);

		
		public  GasStation()//no argument
		{
			this.name="";
			this.address="";
			this.price=0.0;		
		}
		
		public GasStation(String name,String address,double price)//multiple argument
		{
			
			this.name=name;
			this.address=address;
			this.price= price;
			
			
		}
		
		

		public String getName() {
			return name;
		}

		public void setName(String name) {
		
			this.name=name;
			
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
		/**
		 * Returns gas station information
		 * @return Concatenated string of gas station's name, address and price (rounded to 1 decimal place)
		 */
		public  String outputReport(){
			 
			  
		
			String report = name +"," +address+"," +String.format("%.1f", price);
			return report;
			
		}
		  
		
	   /**
	    * Gets input from users and assigns values to class variables name, address and price
	    * 
//	    */
		public void initializeFromKeyboard() {
			
			
		
			System.out.print("Enter name: ");
			this.name= this.scanner.nextLine(); //reading input from user
			   
			
			System.out.print("Enter Address: ");
			this.address=this.scanner.nextLine();
			   
			
			System.out.print("Enter Price: ");
			this.price= this.scanner.nextDouble();
			 
			
		}
	   
		
		}
		
			



}
