package javabasics;

//if construtor is not taking any parameters is called default constructor

public class DefaultConstructor {
	
	int x,y;
	String s;
	
	  DefaultConstructor()
	{
	    x=100;
		y=200;
		s="shaik";
	}
	 void display() 
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
    public static void main(String[] args)
    {
	
    	DefaultConstructor dc=new DefaultConstructor();
    	dc.display(); 
    	
    	
    	
	}
	
	
	
}
