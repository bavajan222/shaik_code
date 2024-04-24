package mkt_day18;

//1.abstract method:only declaration but not implementation.
//2.abstract method ends with ";"semicolon not curly braces.
//3.child classes are responsible to provide implementation.
//4.if class contains at least one abstract method compulsory we have to declare class as abstract.


//Abstract class:partially implemented class
//1.it may contain abstract methods or it contains method implemented but not complete implemented
//2.for abstract class not possible to create object.

abstract class Google_Code{

	abstract void login();
	abstract void registeration();
}
public class Abstract_Class extends Google_Code {

	public static void main(String[] args) {
		Abstract_Class obj=new Abstract_Class();
		obj.login();
		obj.registeration();
	}
	
	void login() {
	System.out.println("Login logic");	
	}

	
	void registeration() {
		
		System.out.println("registartion logic");	
	}

}
