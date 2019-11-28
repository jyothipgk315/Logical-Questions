package pattern;

import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		char c='c',w='w',k='k';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0)
				{
					System.out.print(c);
				}
				else if(i==n-1)
				{
					System.out.print(k);
				}
				else if(j==0||j==n-1)
				{
				System.out.print(w);	
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
