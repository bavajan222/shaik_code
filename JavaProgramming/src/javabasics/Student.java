package javabasics;
class Mentor
{
	Mentor()
	{
		System.out.println("Mentor Class to help stduents");
	}
}
public class Student extends Mentor
{
	Student()
	{	//super(); // super calling statement
		System.out.println("Students Class to to seek help");
	}
public static void main(String[] args) 
{
	Student s1=new Student();
}
}
