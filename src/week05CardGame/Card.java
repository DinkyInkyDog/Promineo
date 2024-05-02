package week05CardGame;

public class Card {
	private String name;
	private String suit;
	private int value;
	
	public void describe() {
		System.out.println(name + "of" + suit);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
