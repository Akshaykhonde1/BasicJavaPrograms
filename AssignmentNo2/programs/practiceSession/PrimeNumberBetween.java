package practiceSession;

public class PrimeNumberBetween {

	public static void main(String[] args) {
		
		int i;
		int j;
		int s=0;
		System.out.println("2 is prime number ");
		for(i=2;i<=20;i++)
		{			
			for(j=2;j<i;j++)
			{
				s=i%j;
				if(s==0)
				{
					System.out.println(i+" is not prime number");
					break;
				}
			}
			if(s!=0)
			{
				System.out.println(j+" is prime number");
			}
			
		}

	}

}
