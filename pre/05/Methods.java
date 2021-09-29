// Chapter 6 Think Java

public class Methods{

// Exercise 2
  public static boolean isDivisible(int n, int m){
    boolean answer = (n % m == 0);
    return answer;
    }

// Exercise 3
  public static boolean isTriangle(int a, int b, int c){
    boolean answer;
    if (a + b < c ){
      answer = false;
    } else if (b + c < a){
      answer = false;
    } else if (a + c < b){
      answer = false;
    } else{
      answer = true;
    }
    return answer;
  }

// Exercise 8
// Kept getting error messages
/*  public static int ack(int m, int n){
    if (m == 0)
      return n + 1;

    boolean test1 = m > 0 and n == 0;
    if (test1);
      ack(m-1, 1);

    boolean test2 = m > 0 and n > 0;
    if (test2);
      ack(m-1, A(m, n-1));
  } */

  public static void main(String[] args){
    System.out.println("isDivisible Test:");
    System.out.print("Should return true: ");
    System.out.println(isDivisible(8, 4));
    System.out.print("Should return false: ");
    System.out.println(isDivisible(8, 3));

    System.out.println(" ");
    System.out.println("isTriangle Test:");
    System.out.print("Should return false:");
    System.out.println(isTriangle(1, 1, 3));
    System.out.print("Should return true: ");
    System.out.println(isTriangle(3, 4, 5));

/*    System.out.println(" ");
    System.out.println("ack Test:");
    System.out.print("Should return 5:");
    System.out.println(ack(1, 3));  */
  }
}
