package sAlphabets;

public class Alphabets {

	//Display Alphabets (A to Z) using loop
	
	public static void main(String[] args) 
	{
		char c;
		for(c='A';c<='Z';c++)
		{
			System.out.print(c);
			System.out.print(" ");
		}
		System.out.println(" ");
		
		for(c='a';c<='z';c++)
		{
			System.out.print(c);
			System.out.print(" ");
		}
	}
}