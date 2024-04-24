package hyr_tutorials_1;

import java.util.Scanner;

public class Assignment_1 {
 //1)verify any given number is even or odd
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		
		int number=sc.nextInt();
		if(number%2==0) {
			System.out.println("The given number is even");
		}
		else {
			System.out.println("the given number is odd");
		
		sc.close();
	}}

}
