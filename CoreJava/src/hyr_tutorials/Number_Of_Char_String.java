package hyr_tutorials;

import java.util.Scanner;

public class Number_Of_Char_String {
   //1) write a java program to count the number of character in a string
	//input:java is super  output:13
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the input string");
		String input=sc.nextLine();
		System.out.println("input is"+input);
		System.out.println("the output is"+input.length());
		sc.close();
	}
	

}
