package assignments;

import java.util.Scanner;

//Switch case with the help of scanner class
public class SwitchCase_Statement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter week number");
		int week_no=sc.nextInt();
		switch(week_no) 
		{
		case 1:System.out.println("Mon");break;
		case 2:System.out.println("tue");break;
		case 3:System.out.println("Wed");break;
		case 4:System.out.println("Thu");break;
		case 5:System.out.println("Fri");break;
		case 6:System.out.println("Sat");break;
		case 7:System.out.println("Sun");break;
		default:System.out.println("Invalid week number");
	
		
	}}}
