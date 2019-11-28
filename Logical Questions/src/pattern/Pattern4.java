package pattern;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		/*
		 
A
BB
CCC
DDDD

		 
		 */
		Scanner s= new Scanner (System.in);
		int number=s.nextInt();
		for(int i=0;i<=number;i++)  //allocates rows
		{
			for(int j=0;j<=i;j++)   //allocate column
			{
			System.out.printf("%c",i+65);	// print the letter
			}
			System.out.println();       // for next Line
			
		}

	}

}
