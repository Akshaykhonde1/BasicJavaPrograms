package mSumNatural;

import java.util.Scanner;

public class SumOfNatural {

	//Calculate the Sum of Natural Numbers
	/*
	 * x=(n(n+1))/2   n=total number
	 */
	public static void main(String args[])
	{
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter n");
		int n=abc.nextInt();
		int x=n*(n+1);             //n(n+1)
		System.out.println("sum of natural number 1 to "+n+" is "+x/2);   //n(n+1)/2
	}
}
