package mkt_day20;

import java.util.Date;

public class String_Functions1 {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1.getTime());//machine time
		Date d2=new Date(d1.getTime());//human time
		System.out.println(d2);
		String currenttime=d2.toString();
		Date futuretime=new Date(d1.getTime()+(1000*60*60*24*1));
		System.out.println(futuretime);//future time
		String month=(String) currenttime.subSequence(4, 7);
		System.out.println(month);
	}

}
