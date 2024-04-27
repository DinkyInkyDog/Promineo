package Assignments;

public class Week02ItsAllAboutTheBase {

	public static void main(String[] args) {
		/*
		 * Given variables power, base, and result, use a for loop to raise the base to
		 * the power of power (i.e. base^power). The loop should run from 1 to the
		 * number stored in power In the loop body, result should be multiplied by the
		 * base every time the loop iterates and that value stored in result, like this:
		 * result *= base or result = result * base Print the value of result to the
		 * console
		 */
		int base = 4;
		int power = 2;
		int result = 1;
		
		for (int i = 1; i <= power; i++) {
			result *= base;
        }
        System.out.println(result);
	}

}
