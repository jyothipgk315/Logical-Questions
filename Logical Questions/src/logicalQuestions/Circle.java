package logicalQuestions;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// Circumference of a circle #c=2*pi*r
		Scanner s=new Scanner (System.in);
		System.out.println("Enter the radius");
		int r=s.nextInt();
		double pi=3.141;
System.out.println("Circumference of a circle :"+2*pi*r);
	}

}
