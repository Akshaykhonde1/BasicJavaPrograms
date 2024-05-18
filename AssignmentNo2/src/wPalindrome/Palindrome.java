package wPalindrome;

import java.util.Scanner;

public class Palindrome {
	
	/*Check Palindrome 
	 * Palindrome number is a number that remains the same,
	 * when its digid are reversed. (e.g. 1001 >> 1001)
	 * 
	 */
	
	public static void main(String args[])
	{
		Scanner abc=new Scanner (System.in);
		System.out.println("Enter Number");
		int num = abc.nextInt();
		int num1=num;
		int remainder;
		int reverse=0;
		while(num>0)
		{
			remainder = num % 10 ;
			num = num / 10 ;
			reverse = reverse * 10 + remainder ;		
		}
	//	System.out.println("Reverse number is "+reverse);
		
		if(num1==reverse)
		{
			System.out.println(num1+" is palindrome number");
		}
		else
		{
			System.out.println(num1+" is not palindrome number");
		}
	}
}
