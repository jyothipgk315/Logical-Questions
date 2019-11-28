package pattern;

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for (int j=0;j<=n;j++)
             {
				if(i+j==n+1||i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
             }
System.out.println();
		}

	}

}
