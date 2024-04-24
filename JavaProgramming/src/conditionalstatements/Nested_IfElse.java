package conditionalstatements;
public class Nested_IfElse 
{
public static void main(String[] args) 
{
	int age=10;
	double salary=10000;
	if(age>18)//false
	{
					if(salary>11000)//false
					{
						System.out.println("1");
					}
					else
					{
						System.out.println("2");
					}
	}
	else
	{
		System.out.println("3");
	}
	
	
	
}
}
