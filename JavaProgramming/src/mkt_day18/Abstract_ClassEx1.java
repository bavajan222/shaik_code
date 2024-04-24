package mkt_day18;

abstract class Facebook_Class{
	
	void add()  //concrete method1
	{
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void subtract() //concrete method1
	{
		
		System.out.println(Math.subtractExact(10,20));
	}
	abstract void multiple();//abstract method1
	abstract void division();//abstract method2
}

public class Abstract_ClassEx1 extends Facebook_Class
{
   void modulas() {
	   System.out.println("this is modulas method");
   }
	public static void main(String[] args) {
		Abstract_ClassEx1 obj=new Abstract_ClassEx1();
		obj.add();
		obj.multiple();
		obj.division();
		obj.modulas();
		subtract();

	}

	
	void multiple() {
		
		 System.out.println("this is multiple method");
	}

	void division() {
		 System.out.println("this is division method");
		
	}

}
