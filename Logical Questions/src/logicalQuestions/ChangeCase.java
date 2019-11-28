package logicalQuestions;

import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {
		// Change the case of the given alphabet
		Scanner s=new Scanner (System.in);
		
		System.out.println("Enter the String :");
		String str=s.next();
		int len=str.length();
		for(int i=0;i<len;i++)
		{
			Character c=str.charAt(i);
		
			if(Character.isLowerCase(c))
			{
				System.out.println(str.toUpperCase());
				break;
			}
	         else
	         {
	            System.out.println(str.toLowerCase());
	            break;
	         }
		
	}
	}

}
