package logicalQuestions;

import java.util.Scanner;

public class DeleteVow {

	public static void main(String[] args) {
		// Delete the vowels in the string
		Scanner s=new Scanner (System.in);
		String str=s.nextLine();
		System.out.println(str.replaceAll("[aeiou]",""));
		
		

	}

}
