package pattern;

import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
/*
 
 
h 
h e 
h e l 
h e l l 
h e l l o 

 */
		
		
		Scanner s= new Scanner (System.in);
		String Str=s.nextLine();  //enter the String
		int len=Str.length();      //find the length
		char c[]=Str.toCharArray();
		for(int i=0;i<len;i++)      //for row
		{
			for(int j=0;j<=i;j++)    //for column
			{
				System.out.printf("%c ",c[j]);  //print the character
			}
			System.out.println();       //next line
		}  

	}

}
