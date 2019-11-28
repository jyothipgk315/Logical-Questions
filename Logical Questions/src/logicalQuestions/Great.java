package logicalQuestions;

import java.util.Scanner;

public class Great {

	public static void main(String[] args) {
		// Greatest among three numbers
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		int num3=s.nextInt();
		int l=0;
		if(l<num1)
		{
			l=num1;
		}
		if(l<num2)
		{
			l=num2;
		}
		if(l<num3)
		{
			l=num3;
		}
		System.out.println(l);
	}

}
