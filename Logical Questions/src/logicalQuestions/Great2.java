package logicalQuestions;

import java.util.Scanner;

public class Great2 {

	public static void main(String[] args) {
		//  Second Greatest among three numbers
				Scanner s=new Scanner(System.in);
				int num1=s.nextInt();
				int num2=s.nextInt();
				int num3=s.nextInt();
				int l=0;
				if(num2<num1&&num1<num3||num2>num1&&num1>num3)
				{
					l=num1;
				}
				else if(num1<num2&&num2<num3||num1>num2&&num2>num3)
				{
					l=num2;
					
				}
				else if(num1<num3&&num3<num3||num1>num3&&num3>num3)
				{
					l=num3;
					
				}
				
			 System.out.println(l);
				
			}

		}

