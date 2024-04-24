package mkt_day17;

//1)this calling statement is used to call from one constructor to another constructor with in the class
//2)this calling statement should only be written explicitly
//3)this calling statement should be the first line inside for every constructor
//4)any constructor should never be combination of this calling statement and super calling statement

public class ThisCalling_Statement {

	
	ThisCalling_Statement(int a){
		this(10,20);
		System.out.println("1");
	}
	ThisCalling_Statement(int a,int b){
		
		this("Bavajan");
		System.out.println("2");
	}
	ThisCalling_Statement(String str){
		this(20,20.22);
		System.out.println("3");
	}
	ThisCalling_Statement(int a,double d){
		this('A');
		System.out.println("4");
	}
	ThisCalling_Statement(char c){
		System.out.println("5");
	}
	
	public static void main(String[] args) {
		new ThisCalling_Statement(10);
	}

}
