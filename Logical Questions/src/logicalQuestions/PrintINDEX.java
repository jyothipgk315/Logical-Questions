package logicalQuestions;

import java.util.Scanner;

public class PrintINDEX {

	public static void main(String[] args) {
		// Print their index else print -1.
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the number to be searched :");
		int q=s.nextInt();
		int j ,i,f=0;
		for( i=0;i<n;i++)
		{
			if(a[i]==q)
			{
				 j=i;
				 f=1;
				 break;
				
				
			}
			else
			{
				f=0;
				
			}
		}
			if(f!=0)
			{
				System.out.println(" index"+i);
			}
			else
			{
				System.out.println("-1");
			}
	}

}
