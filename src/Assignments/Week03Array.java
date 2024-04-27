package Assignments;

public class Week03Array {

static void newArray(String word1, String word2, String word3, String[] arr) {
		
		// WRITE YOUR CODE HERE
			String[] newWords = {word1, word2, word3};
			String[] newArr = new String[arr.length + 3];
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			for (int i = arr.length; i < newArr.length; i++) {
				newArr[i] = newWords[count];
				count++;
			}
			
			//now print out the new array
			for (String word : newArr) {
			    System.out.println(word);
				}
			}
		


static void changeTwo(int a, int b, int[] arr) {
/****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/

        // WRITE YOUR CODE HERE
        //int lastNum = arr.get(arr.size() -1);
        arr[0] = a;
        arr[arr.length - 1] = b;
        System.out.println(a);
        System.out.println(b);
        //It only wasn't working because I didn't have it print the 
        //answers.
         
         
         
        
/****** DO NOT CHANGE THE CODE BELOW THIS LINE ******/ 	
	}


static void charArray(String userWord) {
    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/

        // WRITE YOUR CODE HERE FOR
        int wordLength = userWord.length();
        char[] eachLetter = new char[wordLength];
	
	    for (int i = 0; i < userWord.length(); i++) {
	        eachLetter[i] = userWord.charAt(i);
	    }
	
		for (char letter : eachLetter){
		    System.out.println(letter);
		}





    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/ 	
	}

static void reverseArray(int a, int b, int c, int d, int e) {
	
	int[] arr = {a, b, c, d, e};

/****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/

// WRITE YOUR CODE HERE
    for (int number : arr){
        System.out.println(number);
    }
	int count = 0;
	int[] newArr = new int[arr.length];
	
	for(int number: arr) {
	    System.out.println(number);
	}
	
	for(int i = arr.length -1; i >= 0; i--) {
	    newArr[count] = arr[i];
	    count++;
	}
	
	
	for(int num: newArr) {
	    System.out.println(num);
	}
	

	
/****** DO NOT CHANGE THE CODE BELOW THIS LINE ******/
}


static void multidimensional(int a, int b) {
    /****** DO NOT CHANGE THE CODE ABOVE THIS LINE ******/
    
	    // Check for error -- invalid parameters with an if/else
	    if (a < 2 || b < 2) {
	        System.out.println("Both numbers need to be greater than 2.");
	    } else {
	
	
		    // If both parameters are > 2
		    // Declare a multidimensional array something like this:
		    //          int[][] arr = new int[param1][param2];
		    int[][] multiArray = new int[a][b];
		    
		    
		
		    // Create two loops to populate your new multidimensional array
		    // Note:  you will need a new index in each for-loop. 
		    //          one index will be used for the first for-loop's index (0 to param1 - 1)
		    //          the second index will be used for the second for-loop's index (0 to param2 - 1)		
		    
		    for (int i = 0; i < multiArray.length; i++) {
		    	
		    	for(int count = 0; count < multiArray[i].length; count++) {
		    		multiArray[i][count] = count;
		    	}
		    }
		  
	   
		
		    // After you have populated your multidimensional array, 
		    // Print out the value of arr[firstPosition][lastPosition]
		    for (int[] part : multiArray) {
		    	for (int item : part) {
		    	System.out.println(item);
		    	}
		    }
		    
	    }   
		
	}

public static void main(String[] args) {
	int[] arr = {4, 7, 10, 45};
	int a = 1;
	int b = 5;
	changeTwo(a, b, arr);

	
	String userWord = "Hello";
	charArray(userWord);
	
	int num1, num2, num3, num4, num5, num6;
	num1 = 1;
	num2 = 3;
	num3 = 5;
	num4 = 7;
	num5 = 10;
	num6 = 13;
	int[] arrayInt = {num1, num2, num3, num4, num5, num6};
	
    System.out.println(arrayInt[0]);
	System.out.println(arrayInt[arrayInt.length -1]);
	
	String[] arrg = {"Word4", "Word5", "Word6"};
	String word1 = "Hey";
	String word2 = "That's cool";
	String word3 = "Whatever";
	newArray(word1, word2, word3, arrg);
	
	
	int aa, bb, cc, dd, ee;
	aa = 50;
	bb = 0;
	cc = 39;
	dd = 6;
	ee = 25;
	reverseArray(aa, bb, cc, dd, ee);
	
	
	
	int userGivenA = 10;
	int userGivenB = 15;
	multidimensional (userGivenA, userGivenB);
}


}