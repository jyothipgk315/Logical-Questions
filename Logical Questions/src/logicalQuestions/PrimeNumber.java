package logicalQuestions;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System.in);
		int n=s.nextInt();
		int f=0;
for(int i=2;i<=n/2;i++)
{
	if(n%i==0)
	{
		f=1;
		break;
	}
}
if(f==0)
{
	System.out.println("prime");
}
else
{
	System.out.println("not a prime number");
}
	}

}
