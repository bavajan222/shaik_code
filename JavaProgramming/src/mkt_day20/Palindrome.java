package mkt_day20;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a string");
	    String str=sc.next();
	    String org_str=str;
	    String rev="";
	    
	    for(int i=str.length()-1;i>=0;i--) {
	    	
	    	rev=rev+str.charAt(i);
	    }
	    	if(org_str.equals(rev)) {
	    		System.out.println("String is palindrome");
	    	}
	    	else {
	    	System.out.println("string is not palindrome");
	    	}}}
