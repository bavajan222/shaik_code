package javabasics;
import java.util.Scanner;
public class Scanner_Classexample1 {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
				
		System.out.println("Enter the first number");
		int firstnumber=sc.nextInt();
		System.out.println("Enter the second number");
		int secondnumber=sc.nextInt();
		int sum=firstnumber+secondnumber;
		System.out.println("the sum of a and b is:"   +sum);
		
	}

	 
}
