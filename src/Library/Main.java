package Library;

import java.util.Scanner;

public class Main {
	
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		
		System.out.println("Welcome to Library Management System!");
		System.out.println("1. Login");
		System.out.println("2. Register");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1:
			login();
			break;
		case 2:
			register();
			break;
		default:
			System.out.println("Invalid Entry!");
		}
		
	}
	
	private static void login() {
		System.out.println("Enter email: ");
		String email = sc.next();
		System.out.println("Enter password: ");
		String password = sc.nextLine();
	}
	
	public static void register() {
		System.out.print("Enter fullname: ");
		String name = sc.nextLine();
		System.out.println("Enter email: ");
		String email = sc.next();
		System.out.println("Enter password: ");
		String password = sc.nextLine();
		
		System.out.println("1. Admin");
		System.out.println("2. Normal User");
		int n = sc.nextInt();
		if (n == 1) {
			User admin = new Admin(name, email, password);
		} else {
			User user = new NormalUser(name, email, password);
		}
	}

}
