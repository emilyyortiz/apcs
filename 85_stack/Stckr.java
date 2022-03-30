/*
Team Pink Lemonade (Ariella Katz, Jacob Ng, Emily Ortiz, Tom, Preguac, Applesauce)
APCS pd6
HW85: Leon Leonwood Stack
2022-03-30
time spent: _ hours
*/

/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

import java.util.ArrayList;

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    Stack<Object> cakes = new ALStack();
    cakes.push("a");
    cakes.push("b");
    cakes.push("c");
    cakes.push(1);
    System.out.println(cakes);
    System.out.println(cakes.peekTop());
    cakes.pop();
    System.out.println(cakes);
    //Stack<Z> cakes = new LLStack<Z>();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //...

  }//end main

}//end class