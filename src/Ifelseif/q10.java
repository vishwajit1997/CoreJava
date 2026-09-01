package Ifelseif;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
System.out.println("Enter value:");
int temp=sc.nextInt();
if (temp>=30) {
	System.out.println("Hot");
} else if (temp>=20){
	System.out.println("Warm");
} else if (temp>=10) {
	System.out.println("Cold");
}else {
	System.out.println("very cold");
	
}

	}

}
