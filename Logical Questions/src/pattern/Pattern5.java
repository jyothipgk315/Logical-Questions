package pattern;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
	/*
	 
A
AB
ABC
ABCD

	 
	 */
		Scanner s= new Scanner (System.in);
		int number=s.nextInt();
		for(int i=0;i<number;i++)  //allocates rows
		{
			for(int j=0;j<=i;j++)   //allocate column
			{
			System.out.printf("%c",j+65);	// print the letter
			}
			System.out.println();       // for next Line
			
		}

	}

}
