package Nestedif;

import java.util.Scanner;

public class Asgn3q16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter username: ");
		String username=sc.next();
		if (username.equals("admin")) {
			System.out.println("Enter Password");
			String password=sc.next();
			if (password.equals("1234")){
				System.out.println("login successful");
			}else {
				System.out.println("invalid credentials");
			}
		}else {
			System.out.println("invalid username");
		}
	}

}
