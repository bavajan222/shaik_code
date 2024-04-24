package mkt_day20;

public class String_Class_Methods {

	public static void main(String[] args) {
		String s="I am student";
		
		boolean answer1=s.contains("shaik");
		System.out.println(answer1);//false
		System.out.println(s.substring(5));//student
		System.out.println(s.substring(5, 10));//stude
		
		System.out.println(s.concat(" shaik"));
	}

}
