package mkt_day27;


class Login{
	
	private String email_id="bavajanshaik78@gmail.com";
	
	
	public String getEmail_id() {
		
		return email_id;
	}
	
	private String password="password.com";
    public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private int age=29;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail_id(String email_id) {
    	this.email_id=email_id;
    	
		
	}
}

public class Encapsulation_Concept {

	public static void main(String[] args) {
		Login obj=new Login();
		obj.setEmail_id("bavajan.b@tcs.com");
		System.out.println(obj.getEmail_id());
		obj.setPassword("nshbgcf@456");
		System.out.println(obj.getPassword());
		
		obj.setAge(19);
		System.out.println(obj.getAge());
	}

}
