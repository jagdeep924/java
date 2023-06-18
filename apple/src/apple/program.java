package apple;

public class program {
	public static void main (String[] args)
	{
		Apple ap=new Apple("Red",100,3);
		int total=ap.calculateTotal();
		System.out.println("The total value is"+total);
	}
	

}
