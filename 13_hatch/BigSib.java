/* Emily Ortiz
APCS
HW13 -- Where do BigSibs Come From?
2021-10-07 (due date)

DISCO
- () needed after class in a constructor
e.g. public BigSib () {}

QCC
- Could I print other greetings using the same instance variable?

*/

public class BigSib{
	public BigSib (){
    HelloMsg = "Word up";
  }

	String HelloMsg;

	public String greet(String name) {
		return(HelloMsg + " " + name);
	}
}
