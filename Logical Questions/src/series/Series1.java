package series;

import java.util.Scanner;

public class Series1 {

	public static void main(String[] args) {
		// 0, 2, 8, 14, 24, 34,
		Scanner s=new Scanner (System.in); 
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.print(i*i-1+", ");
			}
			else
			{
				System.out.print(i*i-2+", ");
			}
		}

	}

}
