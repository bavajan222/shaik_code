package types_inheritence_day15;

//types of inheritence: on the basis of class there are three types of inheritence in java
//1)single level inheritence:Inheriting the properties from one class into another class

class Parent_Class{
	static void mul() {
		System.out.println("multiplication");
	}
	 void division() {
		System.out.println("this is division");
	}
}
public class Inheritence extends Parent_Class {

	static void add() {
		System.out.println("adding");
	}
	  void sub() {
		System.out.println("subtracting");
	}

	  
	  
	public static void main(String[] args) {
		add();
		mul();
		Inheritence obj=new Inheritence();
		obj.sub();
		obj.division();
	}}

