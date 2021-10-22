public class Coin{

	private double value;
	private String upFace;
	private String name;
	private int flipCtr;
	private int headsCtr;
	private int tailsCtr;
	private double bias;
	
	public Coin(){
		value = 0.01;
		upFace = "heads";
	}
	
	public Coin (String s){
		name = s;
	}
	
	public Coin (String s, String nowFace) {
		name = s;
		upFace = nowFace;
	}

/*
	public String getUpFace() {
		
	}

  public int getFlipCtr() {

  }

  public double getValue() {

  }

  public int getHeadsCtr() {

  }

  public int getTailsCtr() {

  }

*/


	private double assignValue(String s){
		if (s == "penny"){
			value = 0.01;
		} else if (s == "nickel"){
			value = 0.05;
		} else if (s == "dime") {
			value = 0.1;
		} else if (s == "quarter") {
			value = 0.25;
		} else if (s == "half dollar") {
			value = 0.5;
		} else if (s == "dollar") {
			value = 1.0;
		} else {
			System.out.println("Incorrect coin type.");
		}
		return value;
	}
	
	public void reset (String s, double d) {
		
	}
	
	public String flip() {
		
	}
	
	public boolean equals(Coin other) {
		
	}
	
	public String toString() {
		
	}

}
