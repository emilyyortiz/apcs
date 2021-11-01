/*
Return true if the string "cat" and "dog" appear the same number of times in the given string.
*/

public class catDog{

public static boolean catDog(String str){
        int catCtr = 0;
	int dogCtr = 0;
        String phrase = str;

        for (int i = 0; i < phrase.length() - 2; i++) {
                if (phrase.substring(i, i+3).equals("cat")){
                        catCtr += 1;
                }
        }

        for (int i = 0; i < phrase.length() - 2; i++) {
                if (phrase.substring(i, i+3).equals("dog")){
                        dogCtr += 1;
                }
        }
	
	return (catCtr ==  dogCtr);

}

public static void main (String args[]){
	System.out.println(catDog("catdog"));
	System.out.println(catDog("catcat"));
	System.out.println(catDog("1cat1cadodog"));
}

}

