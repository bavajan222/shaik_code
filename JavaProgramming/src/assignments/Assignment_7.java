package assignments;

import java.util.Scanner;
//" Execute the Scanner Class with all the methods using a Global Variable"

public class Assignment_7 {
	
	static Scanner sc=new Scanner(System.in);
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	public void sub(int a,int b)
	{
		System.out.println("The subtraction of a and b is:"+(a-b));
	}
	public void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public void division(int a,int b)
	{
		System.out.println(a/b);
	}
	public void modulodiv(int a,int b)
	{
		System.out.println(a%b);
	}
	public static void main(String[] args) {
		
		System.out.println("Enter a value");
		int num1=sc.nextInt();
		System.out.println("Enter b value");
		int num2=sc.nextInt();
		
		Assignment_7 obj=new Assignment_7();
		obj.add(num1, num2);
		obj.sub(num1, num2);
		obj.mul(num1, num2);
		obj.division(num1, num2);
		obj.modulodiv(num1, num2);
	}
	

}
