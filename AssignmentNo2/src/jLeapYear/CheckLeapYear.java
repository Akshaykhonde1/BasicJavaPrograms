package jLeapYear;

import java.util.Scanner;

public class CheckLeapYear {

	public static void main(String args[])
	{
		Scanner abc=new Scanner (System.in);
		System.out.println("Take year");
		int a=abc.nextInt();
		if(a%4==0)
		{
			System.out.println(a+" is Leap Year");
		}
		else
		{
			System.out.println(a+" is not Leap Year");
		}
	}
}
