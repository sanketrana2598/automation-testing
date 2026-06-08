package moduleone2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String a1 = "cat";
		String a2 = "act";
		
		char [] b1 = a1.toCharArray();
		char [] b2 = a2.toCharArray();
		
	Arrays.sort(b1);
	Arrays.sort(b2);
	
System.out.println(b1);
System.out.println(b2);

if (Arrays.equals(b1, b2) == true)
		{System.out.println("Its an anagram");}
else{  System.out.println("not an anagram");}

	}

}
