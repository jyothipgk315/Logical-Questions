package series;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		// 121,225,361,529
		Scanner s=new Scanner (System.in);
		int n1=11;
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println(n1*n1);
		n1=n1+4;
		}

	}

}
