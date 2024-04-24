package javabasics;

public class Non_Static {
	
	
	public void m1() {
		System.out.println("5");
	}
	public void m2() {
		System.out.println("10");
	}

	public static void main(String[] args) {
		
		Non_Static a=new Non_Static();//1st syntax of creating an object
		a.m1();
        new Non_Static().m2();//2nd syntax of creating an object

	}

}
