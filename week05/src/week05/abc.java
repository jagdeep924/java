package week05;
import java.util.Scanner;
public class abc {

	public static void main(String[] args) {
		 //declaring variable
		double lengthTile;
		double widthTile;
		double lengthRoom;
		double widthRoom;
		double areaTile;
		double areaRoom;
		
			
			
		/*created by:Jagdeep Kaur
		 * created on:14 June,2023
		 * Topic:Calculating total number of tiles required in a room
		  
		 */
			
		

		Scanner scanner = new Scanner(System.in);
		  
		    
		        

		        
		        System.out.print("Enter the length of the floor tile in cm: ");
		         lengthTile = scanner.nextDouble();

		        System.out.print("Enter the width of the floor tile in cm: ");
		        widthTile = scanner.nextDouble();

		        System.out.print("Enter the length of the room in cm: ");
		        lengthRoom = scanner.nextDouble();

		        System.out.print("Enter the width of the room in cm: ");
		        widthRoom = scanner.nextDouble();
		

		        //  area of one tile in square cm
		         areaTile = lengthTile * widthTile;

		        // area of the room in square cm
		         areaRoom = lengthRoom * widthRoom;

		        // Calculate the number of tiles needed, rounding up to the nearest whole number
		        double numTiles = (double) Math.round(areaRoom / areaTile);

		        // Display the results
		        System.out.println("Area of one tile: " + areaTile + " square cm");
		        System.out.println("Area of the floor: " + areaRoom + " square cm");
		        System.out.println("Number of tiles needed: " + numTiles);

		        // Closing scanner
		
		scanner.close();
		}
		

	}


