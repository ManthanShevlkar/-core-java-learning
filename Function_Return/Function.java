
package Function_Return;

public class Function {

	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.Name = "Manthan";
		s1.address = "Jalna";
		s1.age = 18;
		s1.mobile = "7385368623";
		
		String last = s1.forLastName("Shevlkar");
		System.out.println(s1.Name+" "+last);
		
		String countryCode = s1.Code("+91");
		System.out.println("Calling on.. "+countryCode+s1.mobile);
	}
}