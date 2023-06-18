package week4;
import java.util.Scanner;

public class typecastdemo {
	public static void main(String[] args)
	{
	/*double myvalue;
	int myint=5;
	myvalue=myint;
	System.out.println("The value double variable=" +myvalue);
	System.out.println("The integer value is" +myint);*/
		//int myvalue=(int) 2.5;
		//System.out.println("the value after conversion="+myvalue);
		
		 int principle;
		 double rate;
		 int time;
		 
		 Scanner scan =new Scanner (System.in);
		 System.out.println("please enter principle amount" );
		 principle=scan.nextInt();
		 System.out.println("please enter the rate of interest");
		 rate=scan.nextDouble();
		 System.out.println("please enter the time");
		 time=scan.nextInt();
		 double si=(principle*rate*time)/100;
		 System.out.println("the simple interest is"+si);
				 
		 
		 
	
	}

}
