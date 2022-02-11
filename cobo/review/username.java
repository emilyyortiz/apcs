// HEADING
// ACTIVITY 5

public class username{
  static String alphabet = "abcdefghijklmnopqrstuvwxyz";

  public static String usermaker(String input){
    String output = "";
    int i = 0;
    input.toLowerCase();
    System.out.println(input);
    while (i < input.length()){
        if (alphabet.indexOf(input.charAt(i)) < 0){
          if ((input.charAt(i)) == " "){
            output += "_";
          }
          i++;
        } else {
          output += input.charAt(i);
          i++;
        }
    }

  }

  public static void main (String[] args){
      System.out.println(usermaker("I love Piazza!"));
  }
// "I love piazza!"
// "i_love_piazza!"
}
