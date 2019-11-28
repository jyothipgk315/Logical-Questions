package logicalQuestions;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a=n;

int r=0;
while(n!=0)
{
	int f=1;
	int d=n%10;
	for(int i=1;i<=d;i++)
	{
		f=f*i;
		
	}
	r=r+f;
	 n=n/10;
	 
}
if(r==a)
{
	System.out.println("Strong");
}
else
{
	System.out.println("not Strong");
}
	}

}
