package week05CardGame;

public class Card {
	private String name;
	private String suit;
	private int value;
	
	public Card(String name, String suit) {
		this.name = name;
		this.suit = suit;
		switch(name.toLowerCase()) {
		case "one":
			this.value = 1;
		case "two" :
			this.value = 2;
		case "three" :
			this.value = 3;
		case "four" :
			this.value = 4;
		case "five" :
			this.value = 5;
		case "six" :
			this.value = 6;
		case "seven":
			this.value = 7;
		case "eight":
			this.value = 8;
		case "nine":
			this.value = 9;
		case "ten":
			this.value = 10;
		case "jack":
			this.value = 11;
		case "queen":
			this.value = 12;
		case "king":
			this.value = 13;
		case "ace":
			this.value = 14;
		}
	}
	
	public void describe() {
		System.out.println(name + " of " + suit);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
