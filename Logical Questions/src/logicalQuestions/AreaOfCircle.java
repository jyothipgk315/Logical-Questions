package logicalQuestions;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// Area of the circle  ##a=pi*r*r
		Scanner s=new Scanner (System.in);
		System.out.println(" Enter the Radius :");
		int r=s.nextInt();
		System.out.println("area :"+(Math.PI*r*r));
	}

}
