package week4;

public class Fooditem {
	private String item;
 private 	String  store;
	 private double price;
	String report;

	public Fooditem()//no argument
	{
	}
	public Fooditem(String name, String store, double price)//multiple argument
	{
		this.item=name;
		this.store=store;
		this.price=price;
		}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getStore() {
		return store;
	}
	public void setStore(String store) {
		this.store = store;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String createReport() {  
		String report = item +"," +store+","+ "$" +price;
				return report;
				
				
						
						
						
	}
		//System.out.println("Name of product");
		//System.out.println(items);
		//return null;
		
	
		
		
	//}
	
	


}

