package mkt_dat22;

public class CountOf_Digit {

	public static void main(String[] args) {
         boolean answer;
         int count_num_digit=0;
		 String s="Bavajan9";
		 char[] a=s.toCharArray();
		 
		for(int i=0;i<s.length();i++)
		{

		 answer=Character.isDigit(a[i]);
		 System.out.println(answer);
	
		if(answer==true) 
		{
			count_num_digit++;
		}}
		System.out.println("The count of number of numeric in the given string is-->"+count_num_digit);
	}}

