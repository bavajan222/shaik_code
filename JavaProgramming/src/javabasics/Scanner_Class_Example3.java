package javabasics;

import java.util.Scanner;

public class Scanner_Class_Example3 {
	
	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	public static void sub(int a, int b) {
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		add(20,10);
				
	}

}
