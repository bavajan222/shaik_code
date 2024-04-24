package types_inheritence_day15;


//1)super calling statement is used to call the parent class constructor from the child call constructor
//2)super calling statement is always be the first line in your constructor.
//3)super calling statement are two types.
//3.1->parameterized
   //3.1.a-->only explicitly
//3.2->non-parameterized
   //3.2.a -->Implicitly-dont write it
   //3.2.b-->Explicitly-forcefully
class Mentor{
	Mentor()
	{
	System.out.println("Mentor class to help students");
}
	}


public class Student_Super extends Mentor {
	Student_Super()
	{
		//super();
		System.out.println("Student_Super class to seek help");
	}
	public static void main(String[] args) {
		Student_Super obj=new Student_Super();
		
	}

}
