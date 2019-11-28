package logicalQuestions;


import java.util.Arrays;
import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// Smallest number from the given numbers
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		int small =a[0];
		System.out.println("small :"+small);
	}

}
