package week06lab;

import java.util.ArrayList;
import java.util.List;

public class Board {
	
	private String line = "+---+---+---+";
	List<Place> rows = new ArrayList<Place>();
	private String winningMark;
	//When doing this one you have to start at 0
	private void printRow(int row1, int row2, int row3) {
		System.out.print("|");
		System.out.print(rows.get(row1).getMark() + "|" + rows.get(row2).getMark() + "|" + rows.get(row3).getMark());
		System.out.println("|");
		
	}
	
	public void display() {
		System.out.println(line);
		printRow(0, 1, 2);
		System.out.println(line);
		printRow(3, 4, 5);
		System.out.println(line);
		printRow(6, 7, 8);
		System.out.println(line);
		
	}
	
	public void markBoard(int rowNum, String player) {
		rows.get(rowNum).setMark(player);
	}
	public Board() {
		for (int i = 0; i <= 8; i++) {
			Place newRow = new Place(i);
			rows.add(newRow);
		}
	}
	public void winner(String player1, String player2) {
		String win;
		if (winningMark == player1) {
			win = "Player 1";
			System.out.printf("%s is the winner!!", win);
		}else if (winningMark == player2) {
			win = "Player 2";
			System.out.printf("%s is the winner!!", win);
		} else {
			System.out.println("The battle is still on.");
		}
		
	}
	
	public void checkForWin() {
		if (this.checkRow(0, 1, 2) == true || this.checkRow(0, 3, 6) == true || this.checkRow(0, 4, 8) == true) {
			this.winningMark = this.rows.get(0).getMark();
			System.out.println("We have a winner!");
		} else if (this.checkRow(1, 4, 7) == true || this.checkRow(3, 4, 5) == true) {
			this.winningMark = this.rows.get(4).getMark();
			System.out.println("We have a winner!");
		}else if (this.checkRow(8, 5, 2) == true || this.checkRow(8, 7, 6) == true) {
			this.winningMark = this.rows.get(8).getMark();
			System.out.println("We have a winner!");
		} else {
			System.out.println("The battle is still on.");
		}
	}
	public boolean checkRow(int one, int two, int three) {
		if (rows.get(one).hasMark() == true && rows.get(two).hasMark() == true && rows.get(three).hasMark() == true) {
			if (rows.get(one).getMark() == rows.get(two).getMark() && rows.get(one).getMark() == rows.get(three).getMark()) {
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
	}
}

