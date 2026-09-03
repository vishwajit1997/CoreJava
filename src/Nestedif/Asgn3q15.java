package Nestedif;

import java.util.Scanner;

public class Asgn3q15 {

	public static void main(String[] args) {
		
		int age=19;
				boolean hascard=true;
		if (age>=18) {
			System.out.println("Your age is " + age);
			if(hascard==true) {
				System.out.println("Entry allowed");
			}else {
				System.out.println("Entry denied beacause of age");
			}
		}
	}

}
