package logicalQuestions;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number:");
		int a=s.nextInt();
		int c=a;
		int d=a;
		int j=0;
			double m=0;
		while(a!=0) {
			
			j=j+1;
			a=a/10;
		}
while(d!=0) {
	int y=d%10;

	m=m+Math.pow(y,j);
	
	
	d=d/10;
}
 


if(m==c) {
	System.out.println("armstrong");
}
else {
	System.out.println("not armstrong");
}

	}

}
