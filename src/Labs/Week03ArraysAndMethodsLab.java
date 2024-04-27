//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject: Arrays & Methods
// Java Week 03 Lab
//
package Labs;

public class Week03ArraysAndMethodsLab {

	public static void main(String[] args) {
			
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
			int[] arr01 = {1, 5, 2, 8, 13, 6};
		
		// 2. Print out the first element in the array
			System.out.println(arr01[0]);
		
		// 3. Print out the last element in the array without using the number 5
			System.out.println(arr01[arr01.length -1]);
		
		// 4. Print out the element in the array at position 6, what happens?
			//it says index out of bounds or something
			//System.out.println(arr01[6]);
		//Index 6 out of bounds for length 6
			
		// 5. Print out the element in the array at position -1, what happens?
			//System.out.println(arr01[-1]);
			//Index -1 out of bounds for length 6
			
		// 6. Write a traditional for loop that prints out each element in the array
			System.out.println("Printed Array from Loop --");
			for (int i = 0; i < arr01.length; i++) {
				System.out.print(arr01[i] + ",");
			}
			System.out.println(" ");
		// 7. Write an enhanced for loop that prints out each element in the array
			System.out.println("Enhanced loop print---");
			for (int num : arr01) {
				System.out.print(num + ",");
			}
		System.out.println("  ");
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
			int sum = 0;
			for (int number : arr01) {
				sum += number;
			}
			
			System.out.println("The sum of the Array numbers is " + sum);
		// 9. Create a new variable called average and assign the average value of the array to it
			int average = sum / arr01.length;
			System.out.println("And the Average amount in the array is " + average);
		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
			for (int numb : arr01) {
				if (numb % 2 != 0) {
					System.out.println(numb);
				}
			}
		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
			String[] names = {"Sam", "Sally", "Thomas", "Robert"};
		
		// 12. Calculate the sum of all the letters in the new array
			int[] nameLengths = new int[names.length];
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
				System.out.println(nameLengths[i]);
			}

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
			
		printGreeting();
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.

		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		
		
	}
	

	
	// Method 13:
public static void printGreeting() {
	System.out.println("Hey there.");
}

	// Method 14:

	
	// Method 15:

	
	// Method 16:

	
	// Method 17:

	
	// Method 18:

	
	// Method 19:

	
	// Method 20:
	
	
	// Method 21:
	

}