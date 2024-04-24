package types_supercalling_day16;


class One{
	
	One(int a,double d){
		System.out.println("3");
	}	
}
class Two extends One {
	
	Two(){
		super(10,20.22);
		System.out.println("2");
	}
}
class Three extends Two{
	Three(){
		System.out.println("1");
	}
}
public class Parameterized {

	public static void main(String[] args) {
		
		Three obj=new Three();
	}

}
