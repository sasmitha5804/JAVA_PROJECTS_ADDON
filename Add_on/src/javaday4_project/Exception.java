package javaday4_project;

public class Exception {

	public static void main(String[] args) {
		try {
			int num =10/0;
			
		} catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero:"+e.getMessage());
		}finally {
			System.out.println("Exception completed");
		}

	}

}
