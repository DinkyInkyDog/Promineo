package week06lab;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private String name;
	private String mark;
	private int instanceCount = 0;
	List<Integer> markLocations = new ArrayList<Integer>();
	
	public Player ( String name) {
		instanceCount++;
		this.name = name;
		if (instanceCount % 2 == 0) {
			mark = "X";
		} else {  
			mark = "0";
		}
	
	
	}
	
	public void playMark(int location) {
		markLocations.add(location);
	}

}
