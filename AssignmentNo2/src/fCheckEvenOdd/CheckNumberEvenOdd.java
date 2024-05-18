package fCheckEvenOdd;

import java.util.Scanner;

public class CheckNumberEvenOdd {

	public static void main(String args[])
	{
		Scanner abc=new Scanner (System.in);
		System.out.println("Check Whether a Number is Even or Odd");
		System.out.println(" ");
		System.out.println("Take Number ");
		double a=abc.nextDouble();
		if(a%2==0)
		{
			System.out.println("It is Even Number ");
		}
		else
		{
			System.out.println("It is Odd Number ");
		}
	}
}
