package gVowelConsonant;

import java.util.Scanner;

public class AlphabetVowelConsonant {

	public static void main(String args[])
	{	
		Scanner abc=new Scanner (System.in);
		System.out.println("Enter Alphabet");
		
		char ch=abc.next().charAt(0);
	
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			System.out.println(ch +" Alphabet is Vowel");
		}
		else
		{
			System.out.println(ch+" Alphabet is Consonant");
		}
	}
}
