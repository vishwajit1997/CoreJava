package variables;

public class Variables {
int b=20; //instance variables
static int c= 30; //static variable
	public static void main(String[] args) {
		int a=10; //local variable
		
		System.out.println(a);
		
		Variables v= new Variables(); //object create
		System.out.println(v.b);

		System.out.println(c);
		
	}

}
