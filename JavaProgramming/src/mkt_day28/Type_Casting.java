package mkt_day28;

public abstract class Type_Casting {
//lets convert ur weight which is 83 into double data type
	public static void main(String[] args) {
		double weight=83;//implicit widining
		System.out.println(weight);

		double weight1=(double) 83;//explicit widining
		System.out.println(weight1);
	
		int weight2=(int) 84.65;//narrowing explicit
		System.out.println(weight2);
		
	}

}
