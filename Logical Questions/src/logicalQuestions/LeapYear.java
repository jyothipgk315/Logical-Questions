package logicalQuestions;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// Leap Year
		Scanner s=new Scanner(System.in);
		System.out.println("enter the year");
		int a=s.nextInt();
		if((a%4==0 && a%100!=0)||(a%400==0)) 
		{
		System.out.println("leap year");	
		}
		else
		{
			System.out.println("not a leap year");
		}


	}

}
