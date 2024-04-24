package types_inheritence_day15;

class Parent1{
	Parent1(int a)
	{
			System.out.println("1");
		}
	}
	 
public class Super_Example1 extends Parent1 {
	Super_Example1()
	{
		super(10);
		System.out.println("2");
		
		
	}

			
	public static void main(String[] args) {
		Super_Example1 obj=new Super_Example1();
        
	}

}
