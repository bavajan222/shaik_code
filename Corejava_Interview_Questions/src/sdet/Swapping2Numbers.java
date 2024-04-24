package sdet;

public class Swapping2Numbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		//logic1 using third variable
		System.out.println("Before swapping a and b values are" +a+" "+b);
	/*	int t=a;
		a=b;
		b=t;
		System.out.println("After swapping the values are--->"+a+" "+b);*/
        //logic 2 using + and - operator without using third variable
		
		a=a+b; //30
		b=a-b;//10
		a=a-b;//20
		
		System.out.println(+a+" "+b);
		
	}

}
