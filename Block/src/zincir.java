class Student{
	
	String name;
	int grade;
	int age;
	
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	
	public Student setGrade(int grade) {
		this.grade = grade;
		return this;
	}
	
	public Student setAge(int age) {
		this.age = age;
		return this;
	}
	
}



public class zincir {

	public static void main(String[] args) {
		Student s = new Student();
		
		s.setGrade(78).setAge(4).setName("mete");
		
		System.out.println(s.grade);
		System.out.println(s.age);
		System.out.println(s.name);

	}

}
