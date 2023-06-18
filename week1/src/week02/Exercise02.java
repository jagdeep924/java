package week02;

public class Exercise02 {
	
	/*
	 * Student Name: Jagdeep Kaur
	 * Lab Professor: Sapinderjit Kaur Mam
	 * Due Date: 30,May,2023
	 * Description: Program for Math API
	 */

	/*
	 * Class Exercise02 contains only a main method, it performs some
	 * mathematics using methods of class Math and outputs the results.
	 */
	

		/*
		 * The entry point for the application, does some mathematics with class
		 * Math and provides outputs as well as writes authors name on screen.
		 */
	
	//
		public static void main(String[] args) {
			//Declaring variables
			double  powerResult;
			double squareRootResult;
			double roundDownResult;
			double roundUpResult;
			double ceilingResult;
			//using some math API functions
			powerResult = Math.pow(5, 2);
			squareRootResult = Math.sqrt(36);
			roundDownResult = Math.round(6.1);
			roundUpResult = Math.round(9.5);
			ceilingResult = Math.ceil(1.09);
			//Printing output to the console
			System.out.println("power of 5 raised to 2is " + powerResult);
			System.out.println("square root of 36 is " + squareRootResult);
			System.out.println("rounding 6.1 results in " + roundDownResult);
			System.out.println("rounding 9.5 results in " + roundUpResult);
			System.out.println("ceiling of 1.09 is " + ceilingResult);
			System.out.println("PI is " + Math.PI);
			System.out.println("Program by Jagdeep Kaur");

		}

	}



