public class Rational{
  private int numerator;
  private int denominator;

  public Rational(){
    numerator = 0;
    denominator = 1;
  }

  public Rational(int a, int b){
    numerator = a;
    if (b == 0){
      denominator = 1;
      System.out.println("Denominator can't be 0. Denominator set to 1.");
    }else{
      denominator = b;
    }
  }

  public String toString(){
    return numerator + "/" + denominator;
  }

  private float floatValue(){
    return (float)numerator/ (float) denominator;
  }

  private void multiply(Rational a){
    numerator = numerator * a.numerator;
    denominator = denominator * a.denominator;
  }

  private void divide(Rational a){
    numerator = numerator * a.denominator;
    denominator = denominator * a.numerator;
  }


}
