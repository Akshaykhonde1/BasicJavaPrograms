package zbArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber {

	/* Armstrong Number-
	 *    An armstrong number is defined as the sum of cubes of individual 
	 *    digits of given number that results in the the same number.
	 *    				>> 153 = 1^3 + 5^3 + 3^3
	 *    				>> 1634= 1^4 + 6^4 + 3^4 + 4^4
	 *    			
	 *    
	 * no. is 1,2,3,4,5,6,7,8,9,,153,370,371,407,1634,8208,9474,54748..
	 */
	
	public static void main(String args[])
	{
		Scanner abc=new Scanner (System.in);
		System.out.println("Enter Number");
		int num=abc.nextInt();
	    int o_num = num;
		int temp;
		double sum=0;
		int count=0;
		
		while(num>0)    // here we count the no. of digits
		{
			temp = num%10;
			num = num/10 ;
			count++;
 		}
		
		num=o_num; temp=0;
		
		while(num>0)  // here, value = remainder^power 
					  //		sum = value + sum
		{
			temp = num%10 ;           
			double value=Math.pow(temp,count);
			sum = value + sum;
			num= num/10;
		}
		System.out.println(sum);
		
		if(o_num==sum)
		{
			System.out.println("This is Armstrong Number");
		}
		else
		{
			System.out.println("This is not Armstrong Number");
		}
	}
}
