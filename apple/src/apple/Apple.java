package apple;

public class Apple {
	String variety;//name of apple variety
	int price;//cents
	int quantity;//count of apples
	public Apple()
	{
	}
	public Apple(String value1, int value2,int value3)
	{
		variety=value1;
		price= value2;
		quantity= value3;
		
	}
	public String getVaritey(String value) {
		return variety;
	}
	
	public void getVariety(String value)
	{
		variety=value;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int value)
	{
		 this.price=value;
	}
	 public int calculateTotal()
	 {
	return price*quantity;
	 }
}
