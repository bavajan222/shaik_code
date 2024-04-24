package javabasics;

public class HowtoCallStatic_MainMethod {
	
	static void add() {
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
     static void sub() {
		int a,b,s;
		 a=10;
		 b=20;
		 s=b-a;
		System.out.println(s);
	}
     static void multiplication() {
 		int a=10,b=20,m=a*b;
 		System.out.println(m);
 	}
     static void div() {
  		int a,b,d;
  		 a=10;
  		 b=20;
  		 b=40;
  		 d=b/a;
  		System.out.println(d);
  	}
     static void modulodiv() {
   		int a,b,md;
   		 a=10;
   		 b=20;
   		 md=b%a;
   		System.out.println(md);
   	}
    
    public void sum() {
    	System.out.println(10+20);
    }
    
    public int sum(int a) {
    	return a+10;
    }
	public static void main(String[] args) {
		
		add();
		sub();
		multiplication();
		div();
		modulodiv();	
	}}
