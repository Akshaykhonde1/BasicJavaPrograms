package aPrintInteger;

public class PrintInteger {

	public static void integer() //static method
	{
		int a;
		for(a=1;a<=25;a++)    //forward
		{
			System.out.print(a);
			System.out.print(" ");
		}
		System.out.println(" ");
		
		for(a=25;a>=1;a--)   //Reverse
		{
			System.out.print(a);
			System.out.print(" ");
		}	
	}
	public static void main(String args[]) //main method
	{
		integer();
	}
}

