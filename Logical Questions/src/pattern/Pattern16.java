package pattern;

import java.util.Scanner;

public class Pattern16 {
public static void main(String[] args) {
	/*
 input =4
 input=csk
csk
ccsskk
cccssskkk
ccccsssskkkk
	
	 */
	Scanner s=new Scanner (System.in);
		int n=s.nextInt();  // enter the count
		String str=s.next(); // enter the String
		for(int i=0;i<n;i++)    //row
		{
			for(int j=0;j<str.length();j++)  //column
			{
				char c=str.charAt(j);
				for(int k=0;k<n;k++) //for the triangle
				{
				if(k<=i)
				{
					System.out.print(c); //print each character as triangle
				}
				}
			}
			System.out.println();
		}

	}

}
