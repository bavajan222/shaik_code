 package javabasics;


//SIB(Static initilization block)--->when ever u have SIB present in the program SIB will be first
//order of excecution and Main method will be excecuted later
public class SIB_Class {

	
	static 
	{
		System.out.println("SIB1");
	}

	static 
	{
		System.out.println("SIB2");
	}

	static 
	{
		System.out.println("SIB3");
	}
	
	
	public static void main(String[] args) {
		
     System.out.println("Main method");
		
	}

}
