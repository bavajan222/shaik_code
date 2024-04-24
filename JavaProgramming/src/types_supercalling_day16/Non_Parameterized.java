package types_supercalling_day16;

class GrandParent{
	
	GrandParent(){
		System.out.println("3");
	}	
}
class Parent extends GrandParent {
	
	Parent(){
		
		System.out.println("2");
	}
}
class child extends Parent{
	child(){
		System.out.println("1");
	}
}
public class Non_Parameterized {

	public static void main(String[] args) {
		
		child obj=new child();
	}
}
