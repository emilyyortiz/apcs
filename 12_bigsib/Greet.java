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
- How do I get other greetings to display?
- Were we allowed to edit the given Greet.java code?

*/

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

  } //end main()
} //end Greet

