package javapractice;

public class SmallestOf_ThreeNumbers {

	public static void main(String[] args) {
		
		int x=80;
		int y=30;
		int z=40;
		
		if(x<y && x<z) {
			System.out.println("x is smaller");
		}
		else if(y<x && y<z) {
			System.out.println("y is smaller");
		}
		else {
			System.out.println("z is smaller");
		}
	}

}
