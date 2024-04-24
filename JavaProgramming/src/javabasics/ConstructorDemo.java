package javabasics;

public class ConstructorDemo {
	
	
	ConstructorDemo(){
		System.out.println("This is my constructor");
	}
	public static void main(String[] args) {
		
		ConstructorDemo cd=new ConstructorDemo();//1st syntax of creating an object
		new ConstructorDemo();//2nd syntax of creating an object
		
	}

}
