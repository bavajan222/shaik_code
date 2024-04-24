package mkt_day23;

import java.util.Arrays;

public class Check_StringConsists_digit {

	public static void main(String[] args) {
		
		int count_of_numeric=0;
		boolean output;
		String name="jan";
		char[] a1=name.toCharArray();
		System.out.println(Arrays.toString(a1));
		
		for(int i=0;i<name.length();i++) {
			
			output=Character.isDigit(a1[i]);
			
			if(output==true) {
				count_of_numeric++;
			}}
			System.out.println(count_of_numeric);
			if(name.length()==count_of_numeric) {
				System.out.println("the given string is consists of digits");
			}else {
				
				System.out.println("the given string not consists of  digits");
			}
		}
	}


