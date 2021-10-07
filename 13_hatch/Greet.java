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

public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    //richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);

  } //end main()
} //end Greet
