package mkt_day20;

import java.util.Date;

public class String_FunctionsEx {

	public static void main(String[] args) {
		
   Date d1=new Date();
   System.out.println(d1.getTime());
   Date d2=new Date(d1.getTime());
   System.out.println(d2);
   String currenttime=d2.toString();
   Date d3=new Date(d1.getTime()+(1000*60*60*10*24));
   String futuretime=d3.toString();
   System.out.println(futuretime);
   
   String month=futuretime.substring(4, 7);
   System.out.println(month);
  String date= futuretime.substring(8, 10);
  System.out.println(date);
  
  String year= futuretime.substring(24);
  System.out.println(year);
  
  
  System.out.println(date.concat(" ").concat(month).concat(" ").concat(year));
	}

}
