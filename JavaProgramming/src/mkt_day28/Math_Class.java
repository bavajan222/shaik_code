package mkt_day28;

public class Math_Class {

	public static void main(String[] args) {
		double pivalue=Math.PI;
		System.out.println(pivalue);//3.14
		System.out.println(Math.addExact(10, 20));//30
		System.out.println(Math.subtractExact(50, 10));//40
		System.out.println(Math.multiplyExact(5, 2));//10
		System.out.println(Math.max(10, 100));//100
		System.out.println(Math.max(8.99, 12.44));//12.44
		System.out.println(Math.min(100,600));//100
		System.out.println(Math.min(763.33, 71.44));//71.44
		
		//System.out.println(Math.random());//generates double data type values(always give u the inique value)
		
		for(int i=0;i<=10;i++) {
			System.out.println(Math.random());
		}
		
		
		

	}

}
