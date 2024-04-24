package mkt_day23;

public class Avg_Value {

	public static void main(String[] args) {
	
		
		int num[]=new int[5];
		num[0]=20;
		num[1]=30;
		num[2]=40;
		num[3]=50;
		num[4]=60;
		int sum=0;
		for(int i=0;i<num.length;i++) {
			
			sum=sum+ num[i];
		}
System.out.println(sum);
 double avg=sum/num.length;
 System.out.println(avg);
	}

}
