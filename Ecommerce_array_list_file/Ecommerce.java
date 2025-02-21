package Ecommerce_array_list_file;

import java.util.Scanner;
public class Ecommerce {

	public static void main(String[] args) throws Exception {
		System.out.println("\tWelcome E-Comerce\n");
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("1. User Management");
		System.out.println("2. Product Management");
		System.out.println("3. Exit");
		
		int check = scan.nextInt();
		
		if(check == 1) {
			UserManagement.userMan();
		}
		else if(check == 2) {
			ProductManagement.productMan();
		}
		else if(check == 3) {
			System.out.println("Exiting Application..\n");
			System.out.println("Thank you.\n");
			return;
		}
		}
	}

}