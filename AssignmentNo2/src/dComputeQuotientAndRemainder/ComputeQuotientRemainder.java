package dComputeQuotientAndRemainder;

import java.util.Scanner;

public class ComputeQuotientRemainder {
	
/*a=divident,b=divisor,a/b=quotient,a%2=remainder
 */
	
	static int a;
	static int b;
	static int d;
	public static void main(String args[])
	{
		
		Scanner abc=new Scanner (System.in);
		System.out.println("Take divident");
		a=abc.nextInt();
		System.out.println("Take divisor");
		b=abc.nextInt();
		System.out.println("quotient is");
		System.out.println(a/b);
		System.out.println("Remainder is");
		System.out.println(a%b);
		
	}
}