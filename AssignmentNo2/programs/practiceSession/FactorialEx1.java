package practiceSession;

public class FactorialEx1 {

	
	
	public static void main(String args[])
	{
		int num=5;
		int i;
		int temp=1;
		
		
		for(i=1;i<=num;i++)   //  1  2  3   4   5
		{
			temp=temp*i;      // 1  2  6  24  120
		}
		System.out.println("Factorial of 5 = "+ temp);
	}
}
