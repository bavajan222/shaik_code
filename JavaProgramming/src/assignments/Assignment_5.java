package assignments;

import javabasics.SIB_IIB_Constructor;

public class Assignment_5 {
		
		//SIB
		static {
			
		    System.out.println("Iam a Static initilization block");
		}
		{ //IIB
			System.out.println("Iam a Instance initilization block");
		}
		Assignment_5()//CONSTRUCTOR
		{
			System.out.println("Iam a constructor");
		}
		public static void main(String[] args) {
			
			System.out.println("Iam your main method");
			Assignment_5 S=new Assignment_5();
			Assignment_5 S1=new Assignment_5();
	}


	}


