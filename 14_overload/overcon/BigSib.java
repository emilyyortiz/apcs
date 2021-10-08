/*
TNPG: ziggy's fishball amoebaly rangers (Emily Ortiz - Applesauce, Ziying Jian - Scruffy, Nina Jiang - Miss Alpaca, Faiza Huda - Truthful Tom)
APCS
HW 14 -- Customize Your Creation
2021-10-7

DISCOS
- The default constructor can be overwritten
- Default constructor doesn't take a parameter
- Ovrloaded constructor takes in a parameter

QCC
- What is the purpose of a default constructor vs. overloaded constructor?
- When would one be used over the other?

*/

public class BigSib{
  public BigSib(){
    HelloMsg = "Word up";
}

	public BigSib (String message){
    HelloMsg = message;
  }

	String HelloMsg;

	public String greet(String name) {
		return(HelloMsg + " " + name);
	}
}
