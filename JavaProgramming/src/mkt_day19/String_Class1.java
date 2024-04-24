package mkt_day19;

public class String_Class1 {
	
	static void printrevname() {
String name="Bavajan";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			
			char c2=name.charAt(i);
			System.out.println(c2);
		}

		
	}

	public static void main(String[] args)
	{
		
		printrevname();
		
		System.out.println("--------------------------");
		String name="Bavajan";
		
		for(int i=0;i<name.length();i++)
		{
			
			char c1=name.charAt(i);
			System.out.println(c1);
		}

	}

}
