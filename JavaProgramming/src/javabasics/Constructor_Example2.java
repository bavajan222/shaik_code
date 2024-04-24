package javabasics;

public class Constructor_Example2 {

	
	public static void add() {
		int a,b;
		a=100;
		b=200;
		System.out.println("sum of ab:" +(a+b));
	}
	 void multiplication() {
		int a,b;
		a=10;
		b=20;
		System.out.println(" multiplication of ab:" +(a*b));
	}
	 public Constructor_Example2(){
		 
		 System.out.println("This is my constructor");
	 }
	
	
	public static void main(String[] args) {
		
		add();
		Constructor_Example2 cd=new Constructor_Example2();//1st syntax of creating an object
		cd.multiplication();
		
		new Constructor_Example2();//2nd syntax of creating an object
		
	}

}

	 
	 
	 
 