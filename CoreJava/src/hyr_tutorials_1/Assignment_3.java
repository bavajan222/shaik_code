package hyr_tutorials_1;

import java.util.Scanner;

public class Assignment_3 {
//print the statement based on day name
	//Monday-fri-->its a  week day
	//sat and sun-->its	a weekend	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the day name");
		
		  String dayname=sc.next();
		if(dayname.equals("mon")||
				dayname.equals("tue")||
				dayname.equals("wed")||
				dayname.equals("thu")||
				dayname.equals("fri"))
		{
			System.out.println("its a week day");
		}else if(dayname.equals("sat")||(dayname.equals("sun")))
		{
			System.out.println("its a weekend");
		}
		
		
		
	}

}
