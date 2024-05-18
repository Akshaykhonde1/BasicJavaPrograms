package practiceSession;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=7;
		int r = 0;
		int a;
	
		for(a=2;a<num;a++)
		{
		r=num%a;
		if(r==0)
		   {
			System.out.println("This is not Prime Number");
			break;
		   }
     	}
		if(r!=0)
		{
			System.out.println("This is Prime Number");
		}
	}
}
