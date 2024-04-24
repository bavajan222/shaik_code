package hyr_tutorials_1;

import java.util.Scanner;

public class Assignment_2 {
//print the student results based on the grading system
	//<35 fail,==35 pass,35-70 third class,70-85 second class and >85 first class
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the student marks");
		
		int marks=sc.nextInt();
		if(marks<35) {
			System.out.println("student is failed");
		}
		else if(marks==35) {
			System.out.println("student is just pass");
		}
		else if(marks>35 && marks<70) {
			System.out.println("student is third class");
		}
		else if(marks>=70 && marks<85) {
			System.out.println("student is second class");
		}else {
			
			System.out.println("student is first class");
			sc.close();
		}
	}

}
