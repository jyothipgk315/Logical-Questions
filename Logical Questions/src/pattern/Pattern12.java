package pattern;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 input =5
		 
* 0 0 0 * 
0 * 0 * 0 
0 0 * 0 0 
0 * 0 * 0 
* 0 0 0 * 

		 */
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				
				if(i==j||i+j==n-1)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("0 ");
				}
			}
			System.out.println();
		}
	}

}
