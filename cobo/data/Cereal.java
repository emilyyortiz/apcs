public class Cereal{
  private String _type;
  private String _name;
  private double _calories;
  private double _protein;
  private double _fat;
  private double _sodium;
  private double _fiber;
  private double _carbs;
  private double _sugar;
  private double _potassium;
  private double _vitamins;
  private double _shelf;
  private double _weight;
  private double _cups;
  private double _rating;

  public Cereal(String name,
    String type,
    double calories,
    double protein,
    double fat,
    double sodium,
    double fiber,
    double carbs,
    double sugar,
    double potassium,
    double vitamins,
    double shelf,
    double weight,
    double cups,
    double rating) {

    _name = name;
    _type = type;
    _calories = calories;
    _protein = protein;
    _fat = fat;
    _sodium = sodium;
    _fiber = fiber;
    _carbs = carbs;
    _sugar = sugar;
    _potassium = potassium;
    _vitamins = vitamins;
    _shelf = shelf;
    _weight = weight;
    _cups = cups;
    _rating = rating;

  } // end constructor

  private String getName(){return _name;}
  private String getType(){return _type;}
  private double getCalories(){return _calories;}
  private double getProtein(){return _protein;}
  private double getFat(){return _fat;}
  private double getSodium(){return _sodium;}
  private double getFiber(){return _fiber;}
  private double getCarbs(){return _carbs;}
  private double getSugar(){return _sugar;}
  private double getPotassium(){return _potassium;}
  private double getVitamins(){return _vitamins;}
  private double getShelf(){return _shelf;}
  private double getWeight(){return _weight;}
  private double getCups(){return _cups;}
  private double getRating(){return _rating;}

  public String toString(){
    String retStr = "";
    retStr += "Name: " + _name + "\n";
    retStr += "Type: " + _type + "\n";
    retStr += "Calories: " + _calories + "\n";
    retStr += "Protein: " + _protein + "\n";
    retStr += "Fat: " + _fat + "\n";
    retStr += "Sodium: " + _sodium + "\n";
    retStr += "Fiber: " + _fiber + "\n";
    retStr += "Carbohydrates: " + _carbs + "\n";
    retStr += "Sugar: " + _sugar + "\n";
    retStr += "Potassium: " + _potassium + "\n";
    retStr += "Vitamins: " + _vitamins + "\n";
    retStr += "Shelf: " + _shelf + "\n";
    retStr += "Weight: " + _weight + "\n";
    retStr += "Cups: " + _cups + "\n";
    retStr +=  "Rating: " + _rating;
    return retStr;
  }

  public static void main(String[] args){
    Cereal one = new Cereal("100% Bran", "C", 70.0, 4.0, 1.0, 130.0, 10.0, 5.0, 6.0, 280.0, 25.0, 3.0, 1.0, 0.33, 68.403);
    System.out.println(one.toString());
  }
} // end Cereal class
