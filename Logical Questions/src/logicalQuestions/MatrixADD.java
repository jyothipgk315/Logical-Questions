package logicalQuestions;

import java.util.Scanner;

public class MatrixADD {

	public static void main(String[] args) {
		// metrix Add
	Scanner s=new Scanner (System.in);	
	int n=s.nextInt();
	int a[][]=new int[n][n];
	int b[][]=new int[n][n];
	int c[][]=new int[n][n];
	System.out.println("Matrix 1");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			
		a[i][j]=s.nextInt();
		}
	}
	System.out.println("Matrix 2");
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			
		b[i][j]=s.nextInt();
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			
		c[i][j]=a[i][j]+b[i][j];
		}
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			
		System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	}

}
