package logicalQuestions;

import java.util.Scanner;

public class CharacterIsVowelOrConsonent {

	public static void main(String[] args) {
		// Character Is Vowel Or Consonent
		Scanner s=new Scanner (System.in);
		System.out.println("Character");
		char c=s.next().charAt(0);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("vowel");
		}
		else
		{
			System.out.println("consonent");
		}
		
	}

}
