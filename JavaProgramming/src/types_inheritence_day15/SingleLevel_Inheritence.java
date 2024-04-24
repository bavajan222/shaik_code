package types_inheritence_day15;
//Inheriting the properties(Variables & methods)from one class to another class
//1.we can inherit only static and non static methods
//2.constructors cannot be inherited in java

class parentClass{
	static void parent(){
		System.out.println("hey iam a parent class method");
	}
}



public class SingleLevel_Inheritence extends parentClass {
	static void child() {
		System.out.println("Hey iam a child class method");
	}
	
	
	public static void main(String[] args) {
		child();
		parent();
		
		
		
		
	}

}
