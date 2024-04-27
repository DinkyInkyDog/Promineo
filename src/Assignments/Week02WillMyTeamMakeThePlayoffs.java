package Assignments;

public class Week02WillMyTeamMakeThePlayoffs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isFall = true;
		int losses = 6;
		int wins = 4;
		//My code wasn't not working. It just wasn't giving an output because none of the conditions
		//were being met.
		
		if (isFall && wins > losses) {
		    System.out.println("It's looking good for your team to make the playoffs.");
		}	else if (!isFall && wins > losses) {
		    System.out.println("Your favorite team has promise, but it's too early to tell.");
		} else if (losses > wins) {
		    System.out.println("It's not looking too good.");
		}
	}

}
