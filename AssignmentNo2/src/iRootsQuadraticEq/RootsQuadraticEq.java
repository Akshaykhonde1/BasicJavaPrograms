package iRootsQuadraticEq;

import java.util.Scanner;

public class RootsQuadraticEq {

	/*Roots of a Quadratic Equation
	 * x= -b+-square root b^2-4ac
	 * 
	 */
	public static void main(String args[])
	{
		Scanner abc=new Scanner (System.in);
		System.out.println("Take a");
		double a=abc.nextDouble();
		System.out.println("Take b");
		double b=abc.nextDouble();
		System.out.println("Take c");
		double c=abc.nextDouble();
		
		
		double x1=((-b) + Math.sqrt((b*b)-(4*a*c)))/(2*a) ;
		double x2=((-b) - Math.sqrt((b*b)-(4*a*c)))/(2*a) ;
		
		System.out.println("First root of equation is "+x1);
		System.out.println("Second root of equation is "+x2);
	}
}
