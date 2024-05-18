package practiceSession;

public class StringReverseCheck {

	public static void main(String[] args) {
		
		//--------------------Reverse charector----------------
		
		String s="Hello world";
		
		int l = s.length();
		
		System.out.println(l);
		
		for(int i=l-1;i>=0;i--)   
		{
			System.out.print(s.charAt(i));
		}
		
		//--------------------Reverse Words----------------
		
		String s1 = "I am the Best";
		String[] part = s1.split(" ");
		
		for(int i=part.length-1;i>=0;i--)
		{
			System.out.print(part[i]+" ");
		}
	}

}
