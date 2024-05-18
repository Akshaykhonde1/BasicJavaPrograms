package practiceSession;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num= 12345;
		int remainder;
		int reverse=0;
		
		while(num>0)
		{
			remainder = num%10;            // 3   2   1
			num=num/10;				       // 12  1   0
			reverse=reverse*10+remainder;  // 3   32  321
		}
		System.out.println("reverse number of 12345 = "+reverse);
	}

}
