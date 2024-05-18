package lAlphabetOrNot;

import java.util.Scanner;

public class AlphabetOrNot {

	//Check Whether a Character is Alphabet or Not
	
	public static void main(String ags[])
	{
	Scanner abc=new Scanner(System.in);
	System.out.println("Enter Character ");
	char ch=abc.next().charAt(0);
	
	char ch1='a';
	char ch26='z';
	if((ch>=ch1)&&(ch<=ch26))
	{
		System.out.println(ch+ " is an alphabet");
	}
	else
	{
		System.out.println(ch+ " is not alphabet");
	}
	}	
}

