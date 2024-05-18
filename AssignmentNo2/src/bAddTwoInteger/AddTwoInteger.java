package bAddTwoInteger;
public class AddTwoInteger {

	public void addition()  //non static method
	{
		int add1=Math.addExact(10,20);
		int add2=Math.addExact(20,20);
		int add3=Math.addExact(30,20);
		
		System.out.println(add1);
		System.out.println(add2);
		System.out.println(add3);
	}
	public static void main(String args[]) // main method
	{
		AddTwoInteger obj=new AddTwoInteger();
		obj.addition();
	}
}
