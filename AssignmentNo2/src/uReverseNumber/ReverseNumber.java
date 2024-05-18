package uReverseNumber;

import java.util.Scanner;

public class ReverseNumber {

	//Reverse a Number e.g. 1234 >> 4321
	
	public static void main(String args[])
	{
		Scanner abc=new Scanner(System.in);
		System.out.println("Enter Number");
		
	int a=abc.nextInt();
	int remainder;
	int temp=0;
	while(a>0)
	{
		remainder= a % 10;            // 123 % 10 = 3
		a = a/10;			          // 123 / 10 = 12
		temp = temp*10 + remainder;   // 0*10 + 3
	}
		System.out.println("Reverse no.is "+temp);
   }
}