package Ifelseif;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter first number :");
		int A=sc.nextInt();
		
		System.out.println("Enter second number :");
		int B=sc.nextInt();
		
		System.out.println("Enter Third number :");
		int C=sc.nextInt();
		
		if (A>B && A>C) {
			System.out.println(A+"is largest" );
		}else if (B>A && B>C) {
			System.out.println(B+"is largest");
		} else if (C>A && C>B) {
			System.out.println(C+"is largest");
		}
	}

}
