package hyr_tutorials;

import java.util.Scanner;
//4.write a java program reverse a string   input:shaik
public class Reverse_String {

	public static void main(String[] args) {
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the input string");
		String input=sc.nextLine();
		System.out.println("input is"+input);
		System.out.println("the output is"+input.length());
		String rev="";
		for(int i=input.length()-1;i>=0;i--) {
			
			rev=rev+input.charAt(i);
		}
			System.out.println("the rev string is: "+rev);*/
			
		//using string concatenation operator
			String str="Alakam Ganga";
			String rev=" ";
			
			int len=str.length();
			for(int i=len-1;i>=0;i--) {
				
				rev=rev+str.charAt(i);
			}
				System.out.println(rev);
			}
		
	

}
