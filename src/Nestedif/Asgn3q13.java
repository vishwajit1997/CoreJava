package Nestedif;

import java.util.Scanner;

public class Asgn3q13 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Value");
int i=sc.nextInt();
if (i>0) {
	System.out.println("positive number");
	if(i%2==0) {
		System.out.println("Even Number");
	}else {
		System.out.println("odd number");
	}
}else {
	System.out.println("negative number ");
}
	}

}
