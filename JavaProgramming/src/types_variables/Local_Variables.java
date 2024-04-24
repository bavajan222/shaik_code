package types_variables;

public class Local_Variables {

	
	 int z=100;
	 int b=90;
	 static int a=500;
	 void add() {
		 int b=20;
		 int c=30;
	 }
	 static void sub() {
		 int b=20;
		 int c=30;
		 System.out.println(b);
	 }
	 static void mul() {
		
		 System.out.println(a);
	 }
	 
	 
	public static void main(String[] args) {
		sub();
		mul();
		System.out.println(a);
		
		
		
	}

}
