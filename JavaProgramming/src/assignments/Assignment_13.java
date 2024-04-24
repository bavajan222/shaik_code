package assignments;

import java.util.Scanner;

public class Assignment_13 {
	//Area of Circle with human input at the Run time for 10 times
    
	private final static double pi=3.13;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=10;i++) {
			System.out.println("iteration: "+i);
			int r=sc.nextInt();
			double Aoc=r*r*pi;
			System.out.println("Aoc---->:" +Aoc);
			
		}
		
		
	}

}
