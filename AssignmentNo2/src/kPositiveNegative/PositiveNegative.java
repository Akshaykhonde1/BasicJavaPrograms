package kPositiveNegative;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String args[])
	{
	//Check Whether a Number is Positive or Negative
		
	Scanner abc=new Scanner (System.in);
	System.out.println("Take Number");
	
	long a=abc.nextLong();
	if(a<0)
	{
		System.out.println("This is Negative Number");
	}
	else
	{
		System.out.println("This is Positive Number");
	}
	
	}
}
