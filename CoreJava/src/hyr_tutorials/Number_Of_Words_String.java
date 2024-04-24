package hyr_tutorials;

import java.util.Scanner;

public class Number_Of_Words_String {
//write a java program to count the number of words in a string
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input string");
		String input=sc.nextLine();
		System.out.println("the input is: "+input);
        String[] words=input.split(" ");
        System.out.println("the output is: "+words.length);
	}

}
