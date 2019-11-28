package pattern;

import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		// 
		/*
		 input =5
     1 
    2 1 
   3 2 1 
  4 3 2 1 
 5 4 3 2 1 
		 
		 
		 */
		
		
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=0;j--)
			{
				System.out.printf("%d ",j+1);
			}
			System.out.println();
		}

	}

}
