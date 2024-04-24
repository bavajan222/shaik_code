package hyr_tutorials;

import java.util.Iterator;
import java.util.Scanner;

//write a java program to count the total number of occurences of a given character in a string
//Hello worlds --l--op=3
public class Problem3 {
//edina oka character enni times print ayindo kanukkovali
	public static void main(String[] args) {
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input string");
		String input=sc.nextLine();
		System.out.println("Enter the target character");
		char targetchar=sc.next().charAt(0);
		
		System.out.println("the input string is:"+input);
		System.out.println("the target character  is:"+targetchar);
		int count=0;
		for(int i=0;i<input.length();i++) {
			
			if(input.charAt(i)==targetchar)
			
				count++;
			}
			System.out.println(count);
			sc.close(); */
		//or
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input string");
		String input=sc.nextLine();
		System.out.println("Enter the target character");
		char targetchar=sc.next().charAt(0);
		
		System.out.println("the input string is:"+input);
		System.out.println("the target character  is:"+targetchar);
		
		char[] characters=input.toCharArray();
		int count=0;
		for(int i=0;i<characters.length;i++) {
			
			if(characters[i]==targetchar)
			
				count++;
			}
			System.out.println(count);
			sc.close(); 
		}
	
	
}
