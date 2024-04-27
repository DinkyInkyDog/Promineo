package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Week04ListsWork {

	public static void main(String[] args) {
		if (!isCommandValid(args)) {
			return;
		}
		final String clArgs = args[0];
		switch(clArgs) {
		case "1" :
			listQuestion();
			break;
		case "2" :
			listQuestion11();
			break;
		case "3" :
			
		
		}
		
		
	
		
		
		
		
	}
	
	public static void listQuestion11() {
		List<String> words = new ArrayList<String>();
		String word1, word2, word3, word4, word5;
		word1 = "Java";
		word2 = "JavaScript";
		word3 = "MySQL";
		word4 = "HTML";
		word5 = "SpringBoot";
		words.add(word5);
		words.add(word4);
		words.add(word3);
		words.add(word2);
		words.add(word1);
		
		
		 List<String> newList = new ArrayList<String>();
		    for (int i = 0; i < words.size(); i++) {
		        if (i % 2 == 0) {
		            newList.add(words.get(i).toString());
		        }
		    }
		    
			System.out.println("The old List is: " + words);
			System.out.println("The new List is: " + newList); 
		    
	}
	
	public static void listQuestion() {
		int indexVal = 6;
		List<String> productList = new ArrayList<>(); 
		
		productList.add("Macbook");
		productList.add("HP Notebook");
		productList.add("iPhone 14");
		productList.add("Acer Aspire");
		productList.add("Windows Surface");
		productList.add("Galaxy S23");
	/***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/
	    
	    // WRITE YOUR CODE HERE
		if (indexVal >= 0 && indexVal < productList.size()) {
		    System.out.println(productList.get(indexVal));
		} else {
		    System.out.println("No product can be found with that product number.");
		}
	}

	public static boolean isCommandValid(String[] clArgs) {
		boolean isValid = true;
		if (clArgs.length == 0) {
			isValid = false;
		} else {
			isValid = true;
		}
		return isValid;
	}
}
