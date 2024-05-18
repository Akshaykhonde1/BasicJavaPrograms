package uReverseNumber;

import java.util.Scanner;

public class ForLoop {

	// reverse the number
	
	public static void main(String args[])
	{
		Scanner abc=new Scanner (System.in);
		System.out.println("Enter value");
		int num=abc.nextInt();
		int remainder;
		int reverse =0;
		
		for(;num!=0;)
		{
			remainder= num % 10;
			num = num / 10;
			reverse = reverse * 10 + remainder;
		}
		System.out.println("Reverse number is "+reverse);
	}
}
