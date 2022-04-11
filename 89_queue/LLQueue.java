/*
Team Pink Lemonade (Ariella Katz, Jacob Ng, Emily Ortiz, Tom, Preguac, Applesauce)
APCS pd6
HW89:
2022-04-11
time spent:  hours
*/

import java.util.LinkedList;

public class LLQueue<T> implements Queue<T>{

  LinkedList<T> _queue;
  int _size;
  int _front;
  int _end;

  public LLQueue<T>(){
    _queue = new LinkedList<T>();
    _size = 0;
    _front = 0;
    _end = 0;
  }

  public void enqueue(){
    // addLast
  }

  public T dequeue(){
    //remove( index 0)
  }

  public T peekFront(){
    //getFirst()
  }

  public boolean isEmpty(){
    // size == 0
  }
}
