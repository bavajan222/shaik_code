package mkt_day23;

import java.util.Arrays;

//create a array and print them in reverse order
public class Problem4 {
	public static void main(String[] args) {
		
	
	
	int num[]=new int[5];
	int number[]=new int[5];
	int k=number.length-1;
	number[0]=20;
	number[1]=30;
	number[2]=40;
	number[3]=50;
	number[4]=60;
	for(int i=0;i<number.length;i++) 
	{
		num[k]=number[i];
		k--;
	}
	System.out.println("The first array is--->"+Arrays.toString(number));
	System.out.println("The copied array is--->"+Arrays.toString(num));	


}

}
