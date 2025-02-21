package static_nonstatic;

public class Student {
	String firstName; //instance
	String lastName; //instance
	
	static String collegeName; //static
	
	public  String getFirstName() {
		
		System.out.println(collegeName);
		
		return firstName;
		
		
	}
	
	public String getLastName() {//instance
		System.out.println(firstName);
		System.out.println(lastName);
		
		return lastName;
	}
	
	public static String getCollegeName() {//static
		
		return collegeName;
	}

}

