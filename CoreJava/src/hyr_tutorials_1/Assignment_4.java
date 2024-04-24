package hyr_tutorials_1;

import java.util.Scanner;

public class Assignment_4 {
 //print 1-100 values by using while loop
	public static void main(String[] args) {
			
		//int num=1;
		//while(num<=100) {
		//	 System.out.println(num);
			// num++;
//}}}   or
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the starting number");
		int starting_number=sc.nextInt();
		
		System.out.println("Enter the ending number");
		int Ending_number=sc.nextInt();
		int num=starting_number;
		while(num<=Ending_number) {
			
			System.out.println(num);
			num++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}