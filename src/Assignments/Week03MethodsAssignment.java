package Assignments;

public class Week03MethodsAssignment {

	static int sumOfDigits(int digits) {
	    
	    // WRITE YOUR CODE HERE
        String strDigits;
        strDigits = Integer.toString(digits);
        int sumAll = 0;
        for (int i = 0; i < strDigits.length(); i++) {
            char ch = strDigits.charAt(i);
            int intValue = ch - '0';
            sumAll += intValue;
        }
        return sumAll;
}
	
	public static void main(String[] args) {
		int number = 245;
		System.out.println(sumOfDigits(number));

	}

}
