package mkt_day19;

public class String_Class {

	public static void main(String[] args) {
		
		String s="Bavajan";
		System.out.println(s.length());//7
		System.out.println(s.toUpperCase());//BAVAJAN
        System.out.println(s.toLowerCase());//bavajan
        System.out.println(s.charAt(2));//v
        System.out.println(s.indexOf('j'));//4
        
        System.out.println(s.equals("Bavajan"));//true
	}

}
