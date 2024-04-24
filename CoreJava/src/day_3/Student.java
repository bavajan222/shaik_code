package day_3;

public class Student {
	
	int sid;
	String name;
	char grade;
	
	public void m1() {
		
	System.out.println(sid+" "+name+" "+grade);	
	}
	void m2(int id,String n,char g) {
		
		sid=id;
		name=n;
		grade=g;
	}
	
 Student(int id,String n,char g) {
		
		sid=id;
		name=n;
		grade=g;
	}
}
