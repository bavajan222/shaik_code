package mkt_dat22;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1="horse"
				;
		String s2="shore";
		
		char[]c1=s1.toCharArray();
		char[]c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(Arrays.toString(c1));
        System.out.println(Arrays.toString(c2));
        
        boolean b=Arrays.equals(c1, c2);
        if(b==true) {
        	System.out.println("anagram");
        }
        else {
        	System.out.println("not anagram");
        }
	}

}
