package assignments;

import java.util.Scanner;

public class Assignment_22 {
	
	//Q2)If the number divisible by 3 print frog ,If the number divisible by 5 print cat
	//If the number divisible by both 3&5 then print frog & cat

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
		int num=sc.nextInt();
	if(num%3==0) {
		System.out.println("frog");
	}
	else if(num%5==0) {
		System.out.println("cat");
	}
	else if(num%3==0 && num%5==0){
		
		System.out.println("frog and cat");
	}
	else {
		System.out.println("entered invalid number");
	}
	}

}
