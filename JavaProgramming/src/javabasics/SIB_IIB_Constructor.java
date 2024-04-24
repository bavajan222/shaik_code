package javabasics;

public class SIB_IIB_Constructor {

	
	//SIB
	static {
		
	    System.out.println("Iam a Static initilization block");
	}
	{ //IIB
		System.out.println("Iam a Instance initilization block");
	}
	SIB_IIB_Constructor()//CONSTRUCTOR
	{
		System.out.println("Iam a constructor");
	}
	public static void main(String[] args) {
		
		System.out.println("Iam your main method");
		SIB_IIB_Constructor S=new SIB_IIB_Constructor();
		SIB_IIB_Constructor S1=new SIB_IIB_Constructor();
}}
