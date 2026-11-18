package com.itvedant.firstproject;
import java.util.Scanner;

public class FlightBooking {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Passanger Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter Age");
		int age = sc.nextInt();
		
		System.out.println("Enter Number of Tickets: ");
		int tickets = sc.nextInt();
		
		System.out.println("Enter Price per Tickets: ");
		double price = sc.nextDouble();
		
		System.out.println("Do you want food? (True/False): ");
		boolean food = sc.nextBoolean();
		
		//Arithmatic operator
		
		double totalFare = tickets*price;
		
	}

}
