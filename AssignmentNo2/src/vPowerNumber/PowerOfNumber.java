package vPowerNumber;

import java.util.Scanner;

public class PowerOfNumber {

	//Calculate the Power of a Number
	//a=base, b=power
	
	public static void main(String args[])
	{
		
	Scanner abc=new Scanner (System.in);
	System.out.println("Enter base value ");
	int a=abc.nextInt();
	System.out.println("Enter power ");
	int b=abc.nextInt();
	
	double x=Math.pow(a, b);
	System.out.print(a+"^"+b+" is = ");
	System.out.print(x);
	}
}
