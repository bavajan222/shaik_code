package mkt_day21;

public class Shaik {

	public static void main(String[] args) {
		String str="I am bavajan";
	System.out.println(str.replace('i',' '));//am bavajan
	System.out.println(str.replace('a', 'b'));//ibm bbvbjbn
//in the given string replace all the capital letters.
	System.out.println(str.replaceAll("[A-Z]",""));//am bavajan all the capital letters are removed
	
	System.out.println(str.replaceAll("[a-z]",""));//I
//given string remove all the numbers
	String name="I am bavajan8";
	System.out.println(name.replaceAll("[0-9]"," "));//I am bavajan
	String d="BAVAJAN";
	System.out.println(d.replaceAll("[A-Z]","manish"));//manish shaik
	
  String so="";
  System.out.println(so.isEmpty());//true
	System.out.println(d.isEmpty());//false
	System.out.println(str.lastIndexOf('n'));//11
	
	System.out.println(str.equalsIgnoreCase("I am bavajan"));//true
	System.out.println(str.repeat(2));//I am bavajanI am bavajan
	
	

	
	
	}

}
