/*
TNPG: Perfect Purple Petunias
John Gupta-She + Po, Lauren Lee + Bo, Emily Ortiz + Applesauce
HW 34 -- A Pirate's Life for Me
2021-11-12
time spent:
*/

public class Loopier{
  private static int[] popArray(int[] a){
    for (i = 0; i < a.length; a++){
      a[i] = 2;
    }
    return a;
  }

  private static String strArray(int[] a){
    String output = "{" + a[0];
    for (int i = 1; i < a.length; a++){
      output += ", " + a[i];
    }
    output += "}";
    return output;
  }

  public static void main (String args[]){
  }
}
