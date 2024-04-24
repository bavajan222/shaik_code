package mkt_dat22;

public class CountOfAlphabet {

	public static void main(String[] args) {
		boolean answer;
        int count_Of_alpha=0;
		 String s="Bavajan9";
		 char[] a=s.toCharArray();
		 
		for(int i=0;i<s.length();i++)
		{

		 answer=Character.isAlphabetic(a[i]);
		 System.out.println(answer);
	
		if(answer==true) 
		{
			count_Of_alpha++;
		}}
		System.out.println("The count of number of alphabet in the given string is-->"+count_Of_alpha);
	
	}

}
