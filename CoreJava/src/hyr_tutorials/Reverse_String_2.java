package hyr_tutorials;

public class Reverse_String_2 {
 //using character array
	public static void main(String[] args) {
		String str="shaik";
		int len=str.length();
		
		String rev="";
		char a[]=str.toCharArray();
		for(int i=len-1;i>=0;i--) 
		{
			rev=rev+a[i];
		}
		System.out.println(rev);
	

}}
