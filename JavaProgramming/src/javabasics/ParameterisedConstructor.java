package javabasics;
//if constructor taking any parameter is called ParameterisedConstructor
public class ParameterisedConstructor {
	
	
	int x,y;
	String s;
	
	ParameterisedConstructor(int a,int b,String str){
		
		x=a;
		y=b;
		s=str;	
	}
	
	ParameterisedConstructor(int a,int b){
		
		x=a;
		y=b;	
	}
	
	ParameterisedConstructor(int a){
		
		x=a;	
	}
	
	ParameterisedConstructor(){
			
	}
	
	void diaplay() {
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	
	public static void main(String[] args)
	{
		ParameterisedConstructor pc=new ParameterisedConstructor(10,20,"Bavajan");
		pc.diaplay();
		ParameterisedConstructor pc1=new ParameterisedConstructor(10,28);
		pc1.diaplay();
		ParameterisedConstructor pc2=new ParameterisedConstructor(10);
		pc2.diaplay();
		ParameterisedConstructor pc3=new ParameterisedConstructor();
		pc3.diaplay();
	}
}
