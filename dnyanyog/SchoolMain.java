package org.dnyanyog;

public class SchoolMain {
	public static void main(String[] args) {
		Student std =new Student();
		
		std.setFirstName("Manthan");
		std.setLastName("Shevlkar");
		std.setEmail("ManthanShevlkar@gmail.com");
		std.setMobile("7385368623");
		
		std.getAdress().setStreet1("Gopikishan rode");
		std.getAdress().setCity("Jalna");
		std.getAdress().setState("Mahahrashtra");
		std.getAdress().setCountry("India");
		
		System.out.println(std);
	}

}
