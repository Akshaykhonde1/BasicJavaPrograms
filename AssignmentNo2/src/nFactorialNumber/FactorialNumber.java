package nFactorialNumber;

import java.util.Scanner;

public class FactorialNumber {
 //Find Factorial of a Number
	
	public static void main (String args[])
	{
		Scanner abc=new Scanner (System.in);
		System.out.println("Enter Number");
		int a=abc.nextInt();    //a is
		int temp=1;
		int num;
		
				
		for(num=1;num<=a;num++)
		{
			temp=num*temp;
		}
		System.out.println("Factirial of "+a+" is "+temp);
	}
}
