public class Time{
  public static void main(String[] args){
    int hour = 22;
    int minute = 41;
    int second = 46;
    int secSinceMidnight = ((hour * 60) + minute) * 60 + second;
    int secRemaining = 24 * 60 * 60 - secSinceMidnight;
    double percentPassed = secSinceMidnight * 100 / 86400 ;
    System.out.println("");
    System.out.print("Numer of seconds since midnight: ");
    System.out.println(secSinceMidnight);
    System.out.print("Number of seconds remaining in the day: ");
    System.out.println(secRemaining);
    System.out.print("Percentage of the day that has passed: ");
    System.out.print(percentPassed);
    /* percentPassed is rounding weird, idk how to fix */
    System.out.println("%");
    System.out.println(" ");

    hour = 23;
    minute = 02;
    second = 15;
    int timeNow = ((hour * 60) + minute) * 60 + second;

    System.out.print("How long I've been working on this exercise: ");
    System.out.print(timeNow - secSinceMidnight);
    System.out.println(" seconds");
    System.out.println("AKA too long...");
  }
}
