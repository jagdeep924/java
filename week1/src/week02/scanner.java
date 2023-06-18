package week02;

import java.util.Scanner;

public class scanner {
	public static void main(String[] args)
{
		String name;
		int infav;
		double doublefav;
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		
		name=input.nextLine();
		System.out.println("please enter your favorite integer value");
		int intfav = input.nextInt();
		System.out.println("please enter your favorite decimal value");
		doublefav=input.nextDouble();
		System.out.println("Welcome"+name);
		System.out.println("your favorite integer is ="+intfav);
		System.out.println("your favorite decimal is ="+doublefav);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int num1,num2;
Scanner sc= new Scanner(System.in);

System.out.println("please enter first num");
num1= sc.nextInt();

System.out.println("please enter second num");
num2=sc.nextInt();


int sum=num1+num2;
System.out.println("Sum is"+sum);*/

 }
}
