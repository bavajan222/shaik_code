package mkt_dat22;
//in a given string check which is numeric value
public class Arrays_Concept {

	public static void main(String[] args)
	{
		
		 String s="1Bavajan";
		 char[] a=s.toCharArray();
		 
		for(int i=0;i<s.length();i++)
		{

		 boolean answer=Character.isDigit(a[i]);
		 System.out.println(answer);
	
		if(answer==true) 
		{
		System.out.println("numeric is present at index:"+i);		

		}
	}}}

