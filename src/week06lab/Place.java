package week06lab;



public class Place {
	private String mark;
	private int rowNum;
	
	//when using this method, it's either " X " or " 0 "
	//spaces are important
	public void setMark(String xOr0) {
		mark = xOr0;
	}
	public String getMark() {
		return mark;
	}
	public boolean hasMark() {
		if (this.mark != "-" + rowNum + "-") {
			return true;
		} else {
			return false;
		}
	}
	public Place(int rowNum) {
		this.rowNum = rowNum;
		this.mark = "-" + rowNum + "-";
	}
}
