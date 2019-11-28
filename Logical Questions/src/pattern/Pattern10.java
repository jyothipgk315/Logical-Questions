package pattern;

import java.util.Scanner;

public class Pattern10 {
	/*
	  
01111
20222
33033
44404
55550
 
	 */

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j)
				{
					System.out.print("0");
				}
				else
					
				{
				System.out.print(i);
				}
			}
			System.out.println();
		}
		
		
		
		
	}
}