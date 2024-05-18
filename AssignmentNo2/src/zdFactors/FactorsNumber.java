package zdFactors;

import java.util.Scanner;

public class FactorsNumber {

	//Display Factors of a Number
	
	public static void main(String args[])
	{
		Scanner abc=new Scanner (System.in);
		System.out.println("Enter Number");
		int a=abc.nextInt();
		int fact;
		
		System.out.println("Factor of "+a);
		
		for(fact=1;fact<=a;fact++)  //(initialize; condition: increment/decrement)
		{
			if(a%fact==0)
			{
			System.out.print(fact+" ");
			
			}
		}
	  }
	}
