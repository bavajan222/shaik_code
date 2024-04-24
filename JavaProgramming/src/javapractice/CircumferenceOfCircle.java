package javapractice;

import java.util.Scanner;

public class CircumferenceOfCircle {
	
	final static double pi=3.13;
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the r value");
		int r=sc.nextInt();
		
		double coc=2*pi*r;
		System.out.println("CircumferenceOfCircle is:"  +coc);
		
	}

}
