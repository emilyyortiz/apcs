import java.util.Scanner;

public class CtoF{
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);

    System.out.println(" ");
    System.out.print("Input Celsius Temperature: ");
    double line = in.nextDouble();

    double C = line;
    double F = C * (9.0 / 5.0) + 32;
    System.out.printf("%.1f C = %.1f F", C, F);
  }
}
