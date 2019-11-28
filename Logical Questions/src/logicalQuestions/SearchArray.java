package logicalQuestions;

import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		// Search for a number in an array
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
				System.out.println("the digit in index"+i);
			}
			else
			{
				System.out.println("the digit is not in the array");
			}
		
	}

}
