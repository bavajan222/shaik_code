package javapractice;

public class LargestOf_ThreeNumbers {

	public static void main(String[] args) {
		
		int a=100,b=200,c=300;
		if(a>b && a>c) {
			System.out.println("a is greater");
		}
		else if(b>a && b>c) {
			System.out.println("b is greater");
		}
		else {
			System.out.println("c is greater");
		}
	}

}
