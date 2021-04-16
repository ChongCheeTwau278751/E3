package Exe3;

import java.util.Scanner;

public class Boat {
	
	String type;
	String size;
	String brand;
	String application;
	int price;

	Scanner in = new Scanner(System.in);
	
	//Default constructor
	Boat() {
		System.out.print("Enter the type of boat: ");
		this.type = in.nextLine();
		System.out.print("Enter the size of boat: ");
		this.size = in.nextLine();
		System.out.print("Enter the brand of boat: ");
		this.brand = in.nextLine();
		System.out.print("Enter the application of boat: ");
		this.application = in.nextLine();
		System.out.print("Enter the starting price of boat: ");
		this.price = in.nextInt();
		
		
	}
	
	//Parameterized constructor
	Boat(String type, String size, String brand, String application, int price){
		this.type = type;
		this.size = size;
		this.brand = brand;
		this.application = application;
		this.price = price;
	}
}
