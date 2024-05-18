package practiceSession;

public class PalindromeNumberCheck {

	public static void main(String[] args) {
		
		int num=123212;
		int num_o=num;
		
		int remainder;
		int reverse=0;
		
		
		while(num>0)
		{
			remainder=num%10;
			num=num/10;
			reverse=reverse*10+remainder;
		}
		num=num_o;
		if(num==reverse)
		{
			System.out.println("This is palindrome Number ");
		}
		else
		{
			System.out.println("This is Not palindrome Number ");
		}		
	}

}
