package pattern;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) {
		/*
		 
		 
* *
** **
*** ***
**** ****


		 */
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				
				if(i==j)
				{
				System.out.print(" ");	
				}
				else if(j<=i)
				{
					System.out.print("*");
				}
			}
				for( int j=1;j<=n;j++)
				{
					 if(j<=i)
					{
						System.out.print("*");
					}
				}
			
			System.out.println();
	}

}
}
