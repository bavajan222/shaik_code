package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Demo3 {
//how to convert array to arraylist
	public static void main(String[] args) {
		
		String arr[]={"shaik","jan","nawan"};
		for(String values:arr) {
			System.out.println(values);
		}
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);
		
	}

}
