package assignments;

public class Assignment_21_1 {

	public static void main(String[] args) {
		
		String str="@va##@msi";
		int count=0;
		
	
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
			if((str.charAt(i)>=65 &&  str.charAt(i)<=90)|| (str.charAt(i)>=97 && str.charAt(i)<=122) || (str.charAt(i)>=48 && str.charAt(i)<=57)) {
				continue;
			}
			else {
				count++;
			}
		}
		
		
		System.out.println(count);
		
		
	}

}
