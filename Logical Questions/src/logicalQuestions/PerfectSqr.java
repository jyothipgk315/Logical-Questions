package logicalQuestions;

import java.util.Scanner;

public class PerfectSqr {

	public static void main(String[] args) {
		// Perfect squre
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		float f=(float)Math.sqrt(n);
		int m=(int)f;
		if(m==f)
		{
			System.out.println("perfect");
		}
		else
		{
			System.out.println("not");
		}
	}

}
