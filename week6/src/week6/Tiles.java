package week6;
import java.util.Scanner;
public class Tiles {
	
	/*
	 * Created by:Jagdeep Kaur
	 * Professor name: Sapinderjit Kaur
	 * Student id:041113379
	 * Created on:16 June,2023
	 * Calculating the Floor Area,Tile area and total required tiles
	 */
	
	
	//declaring variables
	 private double floorLength;
	 private double floorWidth;
	 private double tileLength;
	private double tileWidth;
	private double floorArea;
	private double tileArea;
	private double report;
	
	
	
	
	public Tiles()//no argument
	{
	}
	public Tiles(double floorLength, double floorWidth,double tileLength,double tileWidth,double
			floorArea, double tileArea,double Numoftiles)//passing argument(overloaded constructor)
	{
		this.floorLength=floorLength;
		this.floorWidth=floorWidth;
		this.tileLength=tileLength;
		this.tileWidth=tileWidth;
		this.floorArea=floorArea;
		this.tileArea=tileArea;
		
		
		
	}
	/**
	 * 
	 * @return area of floor, area of tile and total required tiles
	 */
	
	// Generating getter setter for declared variables
	public double getFloorLength() {
		return floorLength;
	}
	public void setFloorLength(double floorLength) {
		this.floorLength = floorLength;
	}
	public double getFloorWidth() {
		return floorWidth;
	}
	public void setFloorWidth(double floorWidth) {
		this.floorWidth = floorWidth;
	}
	public double getTileLength() {
		return tileLength;
	}
	public void setTileLength(double tileLength) {
		this.tileLength = tileLength;
	}
	public double getTileWidth() {
		return tileWidth;
	}
	public void setTileWidth(double tileWidth) {
		this.tileWidth = tileWidth;
	}
	public double getFloorArea() {
		return floorArea;
	}
	public void setFloorArea(double floorArea) {
		this.floorArea = floorArea;
	}
	
	public double getTileArea() {
		return tileArea;
	}
	public void setTileArea(double tileArea) {
		this.tileArea = tileArea;
	}
	
	public double floorArea()
	{
	return floorLength*floorWidth;
	 }
	public double tileArea()
	 {
	return tileLength*tileWidth;
	 }
	
	//Printing input to console
	public void Input()
	{Scanner scanner= new Scanner (System.in);
	System.out.println("Enter floorlength");
	floorLength=scanner.nextDouble();
	System.out.println("Enter floorwidth");
	floorWidth=scanner.nextDouble();
	System.out.println("Enter tile length");
	tileLength=scanner.nextDouble();
	System.out.println("Enter tile width");
	tileWidth=scanner.nextDouble();
	
	}
	

	//Creating outputReport
	public void outputReport()
	{
		System.out.println("floorlength:"+floorLength);
		System.out.println("floorWidth"+floorWidth);
		System.out.println("tileLength"+tileLength);
		System.out.println("tileWidth"+tileWidth);
		System.out.println("Area of floor"+Math.ceil(floorLength*floorWidth));
		System.out.println("Area of tile"+Math.ceil(tileLength*tileWidth));
		System.out.println("Total tiles needed:"+(Math.ceil((floorLength*floorWidth/tileLength*tileWidth))));
					
		
		
	}
	
	
}
