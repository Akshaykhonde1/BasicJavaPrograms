package cMultiplytwoFloatingPointNo;

import java.util.Scanner;

public class MultiplytwoFloatingPointNo {

	public static void main(String args[])
	{
		
		Scanner abc=new Scanner (System.in);
		System.out.println("Multiply two Floating Point No.");
		System.out.println(" ");
		System.out.println("Take First No.");
		double a=abc.nextDouble();
		
		System.out.println("Take Second No.");
		double b=abc.nextDouble();
		
		System.out.println("Multiply two Floating Point No. is");
		System.out.println(a*b);
	}	
}
