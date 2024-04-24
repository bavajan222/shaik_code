package mkt_dat22;

public class CountOfSpace {

	public static void main(String[] args) {
		boolean answer;
        int count_Of_space=0;
		 String s="Bavaj an9";
		 char[] a=s.toCharArray();
		 
		for(int i=0;i<s.length();i++)
		{

		 answer=Character.isSpaceChar(a[i]);
		 System.out.println(answer);
	
		if(answer==true) 
		{
			count_Of_space++;
		}}
		System.out.println("The count of number of spaces in the given string is-->"+count_Of_space);
	
	
	}

}
