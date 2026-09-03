package Nestedif;

import java.util.Scanner;

public class Asgn3q14new {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter value");
int Marks=sc.nextInt();
if (Marks>=80) {
	System.out.println("Eligible");
	if(Marks>=75) {
		System.out.println("Eligible due to maths score");
	}else
		System.out.println("Not eligible due to maths score");
}else {
	System.out.println("not eligible");
}
	}

}
