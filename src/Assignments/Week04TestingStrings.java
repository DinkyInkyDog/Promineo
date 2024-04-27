package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Week04TestingStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Bobby Brown";
		System.out.println(name);
		name = "Sue Brown";
		System.out.println(name);
		
		
		//Time to mess with string builders
		String firstName = "Bob";
		String lastName = "Brown";
		String middleInitial = "B";
		String space = " ";

		System.out.println(firstName);
		System.out.println(lastName);

		StringBuilder sb = new StringBuilder();

		// use append() to dynamically create a String using StringBuilder 
		sb.append(firstName);
		sb.append(space);
		sb.append(lastName);
		System.out.println(sb.toString());

		// Add a middle Initial
		sb.insert(firstName.length()+1, middleInitial + space);
		System.out.println(sb.toString());
		String newMiddleName = "R";
		
		//Bob b Brown
		//012345678901
		sb.replace(4, 5, newMiddleName);
		System.out.println(sb.toString());
		
		// You can't make a list with ints because they are not a class.
		//List<int> = new ArrayList<int>();
		
		 List<Integer> list = new ArrayList<Integer>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        System.out.println(list);
	        
	    //You have to import a special thing. 
	}

}
