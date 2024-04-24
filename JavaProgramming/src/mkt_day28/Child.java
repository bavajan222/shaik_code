package mkt_day28;

class GrandParent{
	
	void add() {
		
	}
}
class Parent extends GrandParent{
	
	void sub() {
		
	}}

public class Child extends Parent {

void mul() {
		
}
	

	public static void main(String[] args) {
		
		Parent p1=new Child(); //upcasting
		p1.add();
		p1.sub();
	
		Child c1=(Child)p1;//down casting implicitly
		c1.add();
		c1.sub();
		c1.mul();
	}

}
