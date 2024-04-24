package mkt_dat22;

import java.util.Arrays;

public class TwoArrays_Equal_Not {

	public static void main(String[] args) {
		int num[]=new int[3];
		int num1[]=new int[3];
        num[0]=20;
        num[1]=30;
        num[2]=40;
        num1[0]=20;
        num1[1]=399;
        num1[2]=40;
        
        boolean b= Arrays.equals(num, num1);
        System.out.println(b);
        
	}

}
