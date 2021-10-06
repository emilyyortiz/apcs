/* Emily Ortiz, Jason
APCS
HW12 -- On Elder Individuality and the Elimination of Radio Fuzz
2021-10-06 (due date)

DISCO

QCC
- Spent over 30 min on the assignment
- What is an instance variable?
- How do I use a variable between methods?

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
