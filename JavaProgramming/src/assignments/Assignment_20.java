package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment_20 {
//Q2)Create a Array of length 5 & int datatype & Store value in it using scanner class
	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");

		 for(int i=0;i<a.length;i++) {
			 
			a [i] = sc.nextInt();
		 }
			System.out.println(Arrays.toString(a));
		 }
	}


