package mkt_day17;

//1.Method_Overriding:developing a method in the parent class with the same name and signature same as child class 
//but with different implementation is called as Method_Overriding
//2.we can only override the non static method
class Parent_Class{
	void add() {
		System.out.println("adding 3 numbers");
	}
}
strictfp public class Method_Overriding extends Parent_Class{
	void add() {
		super.add();
		System.out.println("adding two numbers");
		super.add();
	}
public static void main(String[] args) {
	
	Method_Overriding obj=new Method_Overriding();
	obj.add();
}}
//1)super keyword in java can only be use in case of Method_Overriding to call
//the parent class method together with the child class method
//2)super keyword can be first or any line inside the method
//3)super keyword  should be only be use in the context of non static.


//facts of final keyword
//1)any variable is final we cannt change
//2)any  method can be final we can't overriden 
//3)any  class can be final we can't be inheritence





