/* Emily Ortiz, Jason
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-06 (due date)

DISCO
- static allows a variable to be used between methods

QCC
- Spent over 30 min on the assignment
- Need to review this assignment and see the solution
- What is an instance variable?
- How do I get other greetings to display? (e.g. line 22)
- Were we allowed to edit the given Greet.java code?

*/

public class BigSib{
	public static void main(String[] args){
		setHelloMsg("Salutations");
		System.out.println( greet("Dr. Spaceman") );
		// Doesn't print "Salutations Dr. Spaceman when Greet.java is run"
	}
	static String HelloMsg;

	public static String setHelloMsg(String message){
		HelloMsg = message;
		return HelloMsg;
  }
	public static String greet(String name) {
		return(HelloMsg + " " + name);
	}


}
