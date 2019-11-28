package logicalQuestions;

import java.util.Scanner;

public class Hypotonies {

	public static void main(String[] args) {
		// Hypotenuse of right-angled triangle
		Scanner s=new Scanner (System.in);
		System.out.println("enter the 2 sides of triangle");
	int  side1=s.nextInt();
	int  side2=s.nextInt();
	
	double h = Math.sqrt((side1 * side1) + (side2 * side2));
	System.out.println(h);

}
}
