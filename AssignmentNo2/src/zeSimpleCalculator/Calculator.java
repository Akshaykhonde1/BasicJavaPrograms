package zeSimpleCalculator;

import java.util.Scanner;

public class Calculator {

	//Make a Simple Calculator Using switch...case
	
	public static void main(String args[])
	{
		Scanner abc=new Scanner (System.in);
		System.out.println("1=Addition, 2=Subtraction, 3=Multiplication, 4=Division ");
		System.out.println("");
		System.out.println("Select above option");
		int x=abc.nextInt();
	    int y=x;  //initialize
	    
	    System.out.println("Enter 1 st value");
		int a=abc.nextInt();
		System.out.println("Enter 2 nd value");
		int b=abc.nextInt();
		double d = a*(3.142 / 180) ;   // radian =degree*pie/180
		
		switch(y)
		{
		case 1: System.out.println("Addition "+(a+b));
		break;
		case 2: System.out.println("Subtraction "+(a-b));
		break;
		case 3: System.out.println("Multiplication "+(a*b));
		break;
		case 4: System.out.println("Divison "+(a/b));
		break;
	//	case 5: System.out.println("sin(degree) "+a+" is "+Math.sin(d));  
	//	break;
	//	case 6: System.out.println("cos(degree) "+a+" is "+Math.cos(d));  
	//	break;
		}
	}
}
