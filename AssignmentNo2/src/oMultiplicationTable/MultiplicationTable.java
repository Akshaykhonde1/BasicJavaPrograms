package oMultiplicationTable;

import java.util.Scanner;

public class MultiplicationTable {
	
	//Generate Multiplication Table.

	public static void main(String[] args) {
		
		Scanner abc=new Scanner (System.in);
		System.out.println("Enter number");   
		int a=abc.nextInt();     //a enter
		
		int n=1;
		while(n<=10)
		{
			System.out.println(a*(n++));
		}
	}
}
