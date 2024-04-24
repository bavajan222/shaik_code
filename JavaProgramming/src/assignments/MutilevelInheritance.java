package assignments;

//To create 5 classes for Multilevel Inheritance
class A{
	int a;
	void m1() 
	{
		System.out.println(a);
	}}
class B extends  A{
	int b;
	void m2()
	{
		System.out.println(b);
	}}
class C extends  B{
	int c;
	void m3()
	{
		System.out.println(c);
	}}
class D extends  C{
	int d;
	void m4()
	{
		System.out.println(d);
	}}
class E extends  D{
	int e;
	void m5()
	{
		System.out.println(e);
	}}
public class MutilevelInheritance {		
	public static void main(String[] args) {
		E obj=new E();
		obj.a=10;
		obj.b=20;
		obj.c=30;
		obj.d=50;
		obj.e=60;
		obj.m1();
		obj.m2();
		obj.m3();
		obj.m4();
		obj.m5();
	}}

	

		
