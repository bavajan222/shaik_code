package assignments;

public class Constructor_Overloading {
	
	int x,y;
	double d;
	String str;
	char c;
	
	Constructor_Overloading(){
		 x=10;
		 y=20;	  
	}
    Constructor_Overloading(int a){
		x=a;
	}
	Constructor_Overloading(int a,double b){
		x=a;
		d=b;
	}
    Constructor_Overloading(double b,int a){
    	x=a;
    	d=b;
    }
    Constructor_Overloading(String s){
    	str=s;
    }
    Constructor_Overloading(int a,char ch,String s)
    {
    	x=a;
    	c=ch;
    	str=s;
    }
    	
    	void display() {
    		
    		System.out.println(x);
    		System.out.println(y);
    		System.out.println(d);
    		System.out.println(c);
    		System.out.println(str);	
    	}
    	public static void main(String[] args) {
		
    		Constructor_Overloading co=new Constructor_Overloading();
    		co.display();
    		Constructor_Overloading c1=new Constructor_Overloading(30);
    		System.out.println("----------------------");
    		c1.display();
    		Constructor_Overloading c2=new Constructor_Overloading(30,60.09);
    		System.out.println("----------------------");
    		c2.display();
    		Constructor_Overloading c3=new Constructor_Overloading(20.4,40);
    		System.out.println("----------------------");
    		c3.display();
    		Constructor_Overloading c4=new Constructor_Overloading("Bavajan");
    		System.out.println("----------------------");
    		c4.display();
    		Constructor_Overloading c5=new Constructor_Overloading(100,'A',"Kalesha");
    		System.out.println("----------------------");
    		c5.display();
	}

}
