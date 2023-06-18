package week4;

public class GroceryApplication extends Fooditem {
	public static void main(String[] args) {
		
		
		Fooditem fooditem= new Fooditem();//instance 1
		
		/*declaring variable
		 * string item
		 * string store
		 * double price
		 * string report
		 */
		//using  set for instance 1
		//System.out.println("Instance 1");
		fooditem.setItem("Milk");
		fooditem.setStore("No Frills");
		fooditem.setPrice(2.87);
		//using get method of instance 1
	System.out.println(fooditem.getItem());
    System.out.println(fooditem.getStore());
    System.out.println(fooditem.getPrice());

		//System.out.println("Instance 2");
		
		Fooditem fooditem1= new Fooditem("Tea","walmart",2.98);// creating instance without any arguements of Fooditem class


		System.out.println(fooditem1.createReport());
		
	//report for no argument instance
	 System.out.println(fooditem.createReport());
		
		
		
	}



	
		
		
	}


