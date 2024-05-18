package practiceSession;

public class AmstrongNumber {

	//153=1^3+5^3+3^3
	
	public static void main(String[] args) {
		
		int num=153;
		int num_o=num;
		int remainder;
		int count = 0;
		double sum=0;
		
		while(num>0)
		{
			remainder = num%10;  // 3    5  1
			num=num/10;          // 15   1  0
			count++;	
		}
		System.out.println(count);    //count
		
		num=num_o;
		while(num>0)
		{
			remainder=num%10;                           //3        5         1
			double value = Math.pow(remainder, count);  //3^3    5^3         1^3
			sum = sum + value;                          // 27    125+27      152+1
			num=num/10;                                 // 15      1         0
		}
		
		num=num_o;
		if(num==sum)
		{
			System.out.println("This is Armstrong Number");
		}
		else
		{
			System.out.println("This is Not Armstrong Number");
		}

	}

}
