package javabasics;

//IIB(instance initilization block)---if i want to excecute iib need to create object an class
//if i create single object we will access 5 iibs
public class IIB_Class {
	{
		System.out.println("1 IIB");
	}
	{
		System.out.println("2 IIB");
	}
	{
		System.out.println("3 IIB");
	}
	{
		System.out.println("4 IIB");
	}
	{
		System.out.println("5 IIB");
	}
	

	public static void main(String[] args) {
		IIB_Class v=new IIB_Class();
		//IIB_Class vq=new IIB_Class();  if i create another object also we will get 10 iib as output
		System.out.println("Main method");
		
	}

}
