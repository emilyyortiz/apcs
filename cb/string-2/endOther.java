/*
Given two strings,
return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences
(in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.
*/

public class endOther{

public static boolean endOther(String a, String b) {	
	int lenA = a.length();
	int lenB = b.length();
	
	boolean output = true;

	if (lenA >= lenB){        
		int startA = lenA - lenB;
		String endA = a.substring(startA);
		output = endA.toLowerCase().equals(b.toLowerCase());
	}

	if (lenA < lenB){
		int startB = lenB - lenA;
		String endB = b.substring(startB);
		output = endB.toLowerCase().equals(a.toLowerCase());
	}
	
	return output;
}


public static void main (String args[]){
	System.out.println(endOther("Hiabc", "abc"));
	System.out.println(endOther("AbC", "HiaBc"));
	System.out.println(endOther("abc", "abXabc"));
}

}
