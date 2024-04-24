package types_supercalling_day16;
//ThisKeyword is used to assign the value of a local variable to global variable
//ThisKeyword is only used is non static context
public class ThisKeyword {

	String name;
	int age;
	double sal;
	void student_details(String name,int age,double sal) {
		
	//	System.out.println("my name is:" +name+ " and age is:"+age+ "salary is:" +sal);
		this.name=name;
		this.age=age;
		this.sal=sal;
	}
	public static void main(String[] args) {
		ThisKeyword obj=new ThisKeyword();
		obj.student_details("shaik", 30, 20.22);
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.sal);
	}

}
