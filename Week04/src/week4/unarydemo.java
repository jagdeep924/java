package week4;

public class unarydemo {
	public static void main(String[] args)
	{
		/*int X=5;
		int y=10;
		int answer= X++ + ++y;
		System.out.println(" The value answer is"+answer);*/
		int X=10;
		int Y=20;
		System.out.println("before swaping");
		System.out.println("X="+X);
		System.out.println("y="+Y);
		
		int temp= X;
		X=Y;
		Y= temp;
		System.out.println("After swaping");
		System.out.println("X="+X);
		System.out.println("Y="+Y);
		
		
		
	}

}
