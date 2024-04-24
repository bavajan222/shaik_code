package javabasics;

public class Method_Overloading {
	
	
	void add() {
		System.out.println("addition");
	}
	void add(int a) 
	{
		System.out.println(a+4);
	}
	void add(int a,double d ) 
	{
		System.out.println(a+d);
	}
	void add(double d,int a) 
    {
		System.out.println(a+d);
	}
    static void add(String s,int a,double b) {
    	System.out.println(s);
    	System.out.println(a);
    	System.out.println(b);
    }
	public static void main(String[] args) {
		Method_Overloading mo=new Method_Overloading();
		mo.add();
		mo.add(20);
		mo.add(20, 30.33);
		mo.add(30.29, 10);
		add("shaik",20,20.0);
		
		
	}
}
