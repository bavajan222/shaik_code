package day1_operators;

public class Logical_Operators {

	public static void main(String[] args) {
		
		//works between two or more boolean values----->returns true/false
		/*
		boolean x=true;
		boolean y=false;
		System.out.println(x&&y);//false
		System.out.println(x||y);//true
		System.out.println(!x); //false
		System.out.println(!y);//true
		
		boolean b1=10>20;
		boolean b2=20>10;
		System.out.println(b1&&b2);//false
		System.out.println(b1||b2);//true*/
		
		//and opertor -->&&
	/*	int age=20;
		int sal=20000;
		
		if(age>18 && sal==10000) {
			
			System.out.println("r u taking about ram");
		}
		else if(age>18 && sal==20000) {
			System.out.println("r u taking about sita");
		}
		else {
			System.out.println("i got it its laxman");
		} 
		*/
		//or operator
		int age=10;
		int sal=10000;
		if(age>10) {
			System.out.println("1");
		}
		if(!(age>10||sal==10000)) {
			System.out.println("2");
		}
		
		else {
			System.out.println("false");
		}
	}

}
