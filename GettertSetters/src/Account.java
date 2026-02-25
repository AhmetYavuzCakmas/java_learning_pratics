import java.awt.Adjustable;

public class Account {
 
	String name;
	int age;
	
	public static void main(String[] args) {
		Account a = new Account();
/*		
		a.sayBirthday("cem");
*/
		
		a.setName("pablo");
		a.SetAge(45);
		System.out.println(a.getName());
		System.out.println(a.getAge());
		
		a.printDetails();
		
		
		
		
	}
/*
	public static void sayBirthday(String name) {
		System.out.println("happy birthday "+name);
	}
*/ 

	
	public void printDetails() {
		System.out.println(getName()+", "+getAge());
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}
