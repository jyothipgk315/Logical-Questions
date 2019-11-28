package pattern;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// 
		/*
		 input =5;
1    1
12   21
123  321
1234 4321
1234554321 
		 */
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int j,i;
		for( i=0;i<=n;i++)
		{
			for( j=1;j<=n;j++)
			{
				if(j<=i)
				{
					System.out.print(j);
				}
				else
				{
					System.out.print(" ");
				}
			}
				for(j=n;j>=1;j--)
				{
				if(j<=i)
				{
					System.out.print(j);
				}
				}
			
			System.out.println();
		}
	}

}
