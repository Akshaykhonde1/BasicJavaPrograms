package eSwapTwoNumbers;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String args[])
	{
		double a;
		double b;
		double s;
		Scanner abc=new Scanner(System.in);
		System.out.println("Swap Two Numbers");	
		System.out.println(" ");
		System.out.println("Take a ");
		a=abc.nextDouble();
		System.out.println("Take b ");
		b=abc.nextDouble();
		System.out.println("No. of a and b is ="+a+" , "+b);
		s=a;
		a=b;
		b=s;
		System.out.println("Swap the no. a and b is ="+a+" , "+b);
		
	}
}
