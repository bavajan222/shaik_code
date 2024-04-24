package mkt_day23;

import java.util.Arrays;

public class Problem3 {

	//write a java program to copy an array by iterating the array
	//can u check two are equal to each other or not
	public static void main(String[] args) {
		
		
		int num[]=new int[5];
		int number[]=new int[5];
		number[0]=20;
		number[1]=30;
		number[2]=40;
		number[3]=50;
		number[4]=60;
		for(int i=0;i<number.length;i++) {
			num[i]=number[i];
		}
		System.out.println("The first array is--->"+Arrays.toString(number));
		System.out.println("The copied array is--->"+Arrays.toString(num));		

        boolean b= Arrays.equals(num, number);
        System.out.println(b);
	}

}
