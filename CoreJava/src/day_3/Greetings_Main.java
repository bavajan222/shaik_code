package day_3;

public class Greetings_Main {

	public static void main(String[] args) {

		Greetings.greetings1();
		Greetings obj=new Greetings();
		String s=obj.greetings2();
		System.out.println(s);
		
		obj.greetings3("Shaik");
		
		String var=obj.greetings4("Bavajan");
		System.out.println(var);
	}

}
