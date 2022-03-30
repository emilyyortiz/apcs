/*
Team Pink Lemonade (Ariella Katz, Jacob Ng, Emily Ortiz, Tom, Preguac, Applesauce)
APCS pd6
HW85: Leon Leonwood Stack
2022-03-30
time spent: _ hours
*/

import java.util.ArrayList;

public class ALStack implements Stack{

  ArrayList<Object> _stack;

  public ALStack(){
    _stack = new ArrayList<Object>();
  }

  //Return true if this stack is empty, otherwise false.
  public boolean isEmpty(){
    return _stack.size() == 0;
  }

  //Return top element of stack without popping it.
  public Object peekTop(){
    return _stack.get(_stack.size() - 1);
  }

  //Pop and return top element of stack.
  public Object pop(){
    Object temp = peekTop();
    _stack.remove(_stack.size() - 1);
    return temp;
  }

  //Push an element onto top of this stack.
  public void push( Object x ){
    _stack.add(_stack.size(), x);
  }

  public String toString(){
    return _stack.toString();
  }
}
