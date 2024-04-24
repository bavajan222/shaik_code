package mkt_day21;

import java.util.Arrays;

public class String_Arrays {
	//Array:array is a collection of elements with same data types(Homogeneous data)
	//we can store multiple values into a single variable
	//fixed size

	public static void main(String[] args) {
		/*int a[]=new int[5];
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;*/
		
		//approch 2
		int a[]= {100,200,300,400,500};
		
		//a[5]=600;
		//System.out.println(a[5]);//java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(a.length);//5-length/size of an array
		
	    System.out.println(a[2]);//300--get a single value from array
	    //get all the values from array
	    System.out.println(Arrays.toString(a));//[100, 200, 300, 400, 500]
	    
	    
	    //read the data from array using for loop
	    for(int i=0;i<a.length;i++) {
	    	System.out.println(a[i]);
	    }    //or
	    
	    //read the data from array using enhanced loop
	    for(int x:a) {
	    	System.out.println(x);
	    }
	    
	    
	    
	}

}
