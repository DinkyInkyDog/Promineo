//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package Labs;

public class week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		
		int seatsAvailable = 27;
		System.out.println(seatsAvailable);
		// 2. Create a variable to hold the cost of groceries at checkout
		double purchaseCheckout = 250.69;
		System.out.println(purchaseCheckout);
		// 3. Create a variable to hold a person's middle initial
		char middleInit = 'A';
	
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean outsideHot = true;
		
		// 5. Create a variable to hold a customer's first name

		String firstName = "Abby";
		// 6. Create a variable to hold a street address
		String address = "2932 Trappers Cove Trail";

		// 7. Print all variables to the console
		System.out.println(middleInit);
		System.out.println(outsideHot);
		System.out.println(firstName);
		System.out.println(address);
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
	
		int newSeatsAvailable = seatsAvailable - 2;
		System.out.println(newSeatsAvailable);
		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		costOfGroceries = costOfGroceries + 2.15;

		purchaseCheckout += 2.15;
		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		
		middleInit = 'L';
		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		outsideHot = false;

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String fullName = firstName + " " + middleInit + " " + "Rose";

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable

		System.out.println(String.format("The customer's name is %s. They live at %s.", fullName, address));
		
	}
}