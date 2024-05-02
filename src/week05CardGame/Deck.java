package week05CardGame;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;


public class Deck {
	List<Card> cards = new ArrayList<Card>();
	List<String> suitNames = new ArrayList<String>();
	String h = "Hearts";
	String c = "Clubs";
	String s = "Spades";
	String d = "Diamonds";
	
	public int pickACard(int min, int max) {
	    Random random = new Random();
	    return random.nextInt(max - min) + min;
	}
	public Deck() {
		suitNames.add(h);
	    suitNames.add(c);
	    suitNames.add(s);
	    suitNames.add(d);
	    
	    for (int i = 0; i < 4; i++) {
	    	Card c1 = new Card("One", suitNames.get(i).toString());
	    	cards.add(c1);
	    	Card c2 = new Card("Two", suitNames.get(i).toString());
	    	cards.add(c2);
	    	Card c3 = new Card("Three", suitNames.get(i).toString());
	    	cards.add(c3);
	    	Card c4 = new Card("Four", suitNames.get(i).toString());
	    	cards.add(c4);
	    	Card c5 = new Card("Five", suitNames.get(i).toString());
	    	cards.add(c5);
	    	Card c6 = new Card("Six", suitNames.get(i).toString());
	    	cards.add(c6);
	    	Card c7 = new Card("Seven", suitNames.get(i).toString());
	    	cards.add(c7);
	    	Card c8 = new Card("Eight", suitNames.get(i).toString());
	    	cards.add(c8);
	    	Card c9 = new Card("Nine", suitNames.get(i).toString());
	    	cards.add(c9);
	    	Card c10 = new Card("Ten", suitNames.get(i).toString());
	    	cards.add(c10);
	    	Card c11 = new Card("Jack", suitNames.get(i).toString());
	    	cards.add(c11);
	    	Card c12 = new Card("Queen", suitNames.get(i).toString());
	    	cards.add(c12);
	    	Card c13 = new Card("King", suitNames.get(i).toString());
	    	cards.add(c13);
	    	Card c14 = new Card("Ace", suitNames.get(i).toString());
	    	cards.add(c14);
	    	
	    }
	}

	public void describe() {
		for (Card card : cards) {
			card.describe();
		}
	}
	
	public void shuffle() {
		List<Card> tempDeck = new ArrayList<Card>();
		
		for (int i = cards.size(); i > 1; i--) {
			int activeCard = pickACard(0, i - 1);
			tempDeck.add(cards.get(activeCard));
			cards.remove(activeCard);
		}
		for (Card card : tempDeck) {
			cards.add(card);
		}
			
			
		
	}

	public Card drawSingleCard() {
		Card pulledCard = cards.get(0);
		cards.remove(0);
		return pulledCard;
	}
	
}
