package mkt_day23;

import java.util.Arrays;

public class Check_String_Alpha {

	public static void main(String[] args) {
		
		
		int count_of_alpha=0;
		boolean output;
		String name="afdfgh";
		char[] a1=name.toCharArray();
		System.out.println(Arrays.toString(a1));
		
		for(int i=0;i<name.length();i++) {
			
			output=Character.isAlphabetic(a1[i]);
			
			if(output==true) {
				count_of_alpha++;
			}}
			System.out.println(count_of_alpha);
			if(name.length()==count_of_alpha) 
			{
				System.out.println("the given string is consists of alpha");
			}else 
			{
				
				System.out.println("the given string not consists of only alpha");
			}
		}
	
	}



