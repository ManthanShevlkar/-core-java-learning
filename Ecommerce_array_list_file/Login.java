package Ecommerce_array_list_file;

import java.util.Scanner;

public class Login {
	public static void login() {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("\t\t     Login     \n");
	
	System.out.println("Enter Username : ");
	String userName = scan.next();
	
	System.out.println("Enter Password : ");
	String password = scan.next();
	
	if(userName.equals("Manthan")) {
		
		if(password.equals("manthan@0000")) {
			
			System.out.println("Login Successfull\n");
			return;		
	}
	}
	System.out.println("Login fail.....");
	System.exit(0);
}
}