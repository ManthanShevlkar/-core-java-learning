package static_nonstatic;

public class Learn extends Student {
	public static void main(String[] args) {
		
		
		Student std = new Student();
		System.out.println(std.firstName);
		Student std1 = new Student();
		System.out.println(std1.firstName);
		
		
		
		System.out.println(Student.collegeName);
		
		
		System.out.println(collegeName);
		
	}
	
	
	public void timepass() {
		System.out.println(firstName);
		System.out.println(lastName);
	}

}
