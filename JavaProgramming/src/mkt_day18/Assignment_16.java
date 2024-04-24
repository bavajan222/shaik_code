package mkt_day18;
//Create Multi level Inheritance using 2 Abstract classes and 1 concrete class 
//by creating 2 AbsMethods in Absclass1,creating 2 AbsMethods, 
//1 ConcreteMethod in Abssclass2, and 2 Concrete methods in Child class(Concrete class)

abstract class Parent_One{
	
	abstract void add();
	abstract void sub();
	
	
	static void division() {
		System.out.println(20/10);
	}
}
abstract class Parent_Two extends Parent_One {
	
	void modulodiv() {
		System.out.println(20%10);
	}
		abstract void mul2();
		abstract void add3();
	
}
public class Assignment_16 extends Parent_Two {
	
	
	static void add2() {
		System.out.println(20+30);
	}
	
	void sub2() {
		System.out.println(50-30);
	}
	public static void main(String[] args) 
	{	
		Assignment_16 obj=new Assignment_16();
		obj.add();
		obj.sub();
		division();
		obj.modulodiv();
		obj.mul2();
		obj.add3();
		add2();
		obj.sub2();
		
	}
	
	void add() {
		System.out.println("10");	
	}

	void sub() {
		System.out.println("20");
	}

	
	void mul2() {
		System.out.println(5*2);
		
	}


	void add3() {
		System.out.println(20);
		
	}

}
