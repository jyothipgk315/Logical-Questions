package logicalQuestions;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// Sum of digits until a single digit
		Scanner s=new Scanner(System.in);
		System.out.println("enter the digit :");
		int n=s.nextInt();
		int sum = 0; 
		  
        // Loop to do sum while 
        // sum is not less than 
        // or equal to 9 
        while (n > 0 || sum > 9)  
        { 
            if (n == 0) { 
                n = sum; 
                sum = 0; 
            } 
            sum += n % 10; 
            n /= 10; 
        } 
System.out.println(sum);
	}

}
