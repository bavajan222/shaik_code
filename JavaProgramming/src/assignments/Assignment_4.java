package assignments;

public class Assignment_4 {
	
	public static void add() {
		int a,b,sum;
		a=30;
		b=50;
		sum=a+b;
		System.out.println(sum);
	}
	    static void sub() {
		int a=20,b=30,s=b-a;
		System.out.println("The value of subtraction:" +s);
	}
	    static void multiplication() {
			int a,b;
			a=5;
			b=10;
			System.out.println("multiplication:" +(a*b));
		}
	    static void division(){
			int a,b;
			a=100;
			b=50;
			System.out.println("division:" +(a/b));
		}
	    static void mdivison() {
			int a,b,c;
			a=10;
			b=20;
			c=b%a;
			System.out.println("module division:" +c);
		}
	    void add1() {
	    	System.out.println("this is non static");
	    }
	    void sub1() {
	    	int a1=100;
	    	int a2=200;
	    	System.out.println(a2-a1);
	    }
	    void multiplication1() {
	    	int a1=10;
	    	int a2=20;
	    	System.out.println("multiplication:" +(a1*a2));
	    }
	    void division1() {
	    	int b1=100;
	    	int b2=200;
	    	int div=b2/b1;
	    	System.out.println(div);
	    }
	    void modulodivision1() {
	    	int c1=100;
	    	int c2=200;
	    	int mdiv=c2%c1;
	    	System.out.println(mdiv);
	    }
	    
	public static void main(String[] args) {
		add();
		sub();
		multiplication();
		division();
		mdivison();
		
		Assignment_4 nonstatic=new Assignment_4();
		nonstatic.add1();
		nonstatic.sub1();
		nonstatic.multiplication1();
		nonstatic.division1();
		nonstatic.modulodivision1();
	}}
