
package pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int number=s.nextInt();
		for(int i=number;i>=0;i--)  //allocates rows
		{
			for(int j=i;j>=0;j--)   //allocate column
			{
			System.out.print("*"+" ");	// print the *
			}
			System.out.println();       // for next Line
		}

	}

}
