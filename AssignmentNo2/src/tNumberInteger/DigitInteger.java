package tNumberInteger;

import java.util.Scanner;

public class DigitInteger {

	//Count Number of Digits in an Integer

	public static void main(String args[])
	{
		Scanner abc=new Scanner (System.in);
		System.out.println("Enter Number");
		long num=abc.nextLong();
		
		long remainder;
		long count=0;
		
		while(num>0)
		{
			remainder = num%10 ;    // e.g. 123 >> 123%10 >> 3  2 1
			num = num/10 ;			//          >> 123/10 >> 12 1 0
			count++ ;		
		}
		System.out.println("Number of Digits in an Integer is "+count);
	}

}
