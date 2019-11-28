package pattern;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		
		/*
		 input 5 
		 
*****&*****
****&*&****
***&***&***
**&*****&**
*&*******&*

		 */
		
		
		
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=2*n;j++)
			{
				if(i+j==n||j-i==n)
				{
					System.out.print("&");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}

}
