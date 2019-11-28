package series;

import java.util.Scanner;

public class Series4 {

	public static void main(String[] args) {
		/*
		  0,0,2,1,4,2,6,3,8,4,10,5,12,6,14,7,16,8
		  
		  input =5
		  output=4
		  
		 */
		Scanner s= new Scanner (System.in);
		int z=0,x=0,k=0;
			int n= s.nextInt();
			int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			
			if(i%2==0)
			{
				a[i]=x;
				x=x+2;
			}
			else
			{
				a[i]=z;
				z++;
			}
			
		}
		for(int i=0;i<n;i++)
		{
			k=a[n-1];		
		}
		System.out.println(k);
	}

}
