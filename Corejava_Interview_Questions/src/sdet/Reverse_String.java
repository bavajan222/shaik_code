package sdet;

public class Reverse_String {

	public static void main(String[] args) {
		
		String s="mam";
		String rev="";
		int len=s.length();
		
		for(int i=len-1;i>=0;i--) {
			
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equals(rev)) {
			
			System.out.println("palindrome");
			
		}else
			System.out.println("not palindrome");
		}

}
