package week06lab;

public class Board {
	private Player p1;
	private Player p2;
	private String line = "+---+---+---+";
	
	
	public void display() {
		System.out.print(line);
		
	}
}

//+---+---+---+	
//|---|---|---|
//+---+---+---+	   a win	+---+---+---+		+---+---+---+		+---+---+---+
//| 4 | 5 | 6 |	-- look-->	|---|---|---|	&	| | | | | | |   & 	|   | X |   |
//+---+---+---+	 at these	+---+---+---+		+---+---+---+		+---+---+---+
//				| 7 | 8 | 9 |	8 patterns	|---|---|---|		| | | | | | |		| / |   | \ |
//+---+---+---+		        +---+---+---+