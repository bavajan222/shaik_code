package Day_2;

public class StringCocatenation {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		String x="Hello";
		String y="Selenium";
		System.out.println(a+b);//30
		System.out.println(x+y);//HelloSelenium
		System.out.println(a+x);//10Hello
		System.out.println(a+b+x+y);//30HelloSelenium
		System.out.println(x+y+a+b);//HelloSelenium1020
        System.out.println(x+y+(a+b));//HelloSelenium30
        System.out.println(a+b+x+y+a+b);//30HelloSelenium1020
        System.out.println(a+b+x+y+(a+b));//30HelloSelenium30
        double c=20.21;
        double d=30.33;
        System.out.println(x+y+c+d);//HelloSelenium20.2130.33
        System.out.println(x+y+a+b+c+d);//HelloSelenium102020.2130.33
        char g='m';
        char p='n';
        
        String l="testing";
        String u="automation";
        System.out.println(l+u);//testingautomation
        System.out.println(l+u+g+p);//testingautomationmn
        
        char t1='a';//97
        char t2='b';//98
        System.out.println(t1+t2);//195
        
        char t3='z';//122
        System.out.println(t1+t2+t3);//317
        System.out.println(t1);//a
        
        // any maathematical operaion that time will get Ascii values
       // The range of ASCII values for uppercase letters A-Z is 65-90, 
       // and the range for lowercase letters a-z is 97-122. 
        //** a-z--->97-122
        //**A-Z---->65-90
        //** 0-9-->48-57
        
        System.out.println(t2-t1);//1
        System.out.println('a'+'b');//195
        System.out.println("a+b");//a+b
        
        System.out.println((byte)'a');//will get Ascii values-97
        System.out.println((byte)'z');
        System.out.println((int)'B');
        
        int s1=100;
        int s2=200;
        System.out.println("The value of s1 is:" +s1);
        System.out.println("The value of s2 is:" +s2);
        System.out.println("The sum of s1 and s2:" +(s1+s2));
        
		
		
	}

}
