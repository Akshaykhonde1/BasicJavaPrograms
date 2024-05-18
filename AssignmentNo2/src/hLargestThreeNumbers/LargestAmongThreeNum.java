package hLargestThreeNumbers;

import java.util.Scanner;

public class LargestAmongThreeNum {

	public static void main(String args[])
	{
		Scanner abc=new Scanner (System.in);
		System.out.println("Largest Numbers");
		System.out.println("Take No. 1");
		double a=abc.nextDouble();
		System.out.println("Take No. 2");
		double b=abc.nextDouble();
		System.out.println("Take No. 3");
		double c=abc.nextDouble();
		
		double x=Math.max(a, b);
		double y=Math.max(a, c);
		double z=Math.max(c, b);
	
		if((x>y)||(x>z))
		{
			System.out.println(x+" is greater than other two numbers");
		}
		else if((y>x)||(y>z))
		{
			System.out.println(y+" is greater than other two numbers");
		}
		else
		{
			System.out.println(z+" is greater than other two numbers");
		}
	}
}
