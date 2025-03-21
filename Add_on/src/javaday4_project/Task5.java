package javaday4_project;


class Dog{
	void breed() {
		System.out.println("I have the best dog");
		
	}
}
class pet extends Dog{
	void breed() {
		System.out.println("I have the best pet");
		super.breed();
		
	}
}
public class Task5 {

	public static void main(String[] args) {
		Dog d =new pet();
		d.breed();
		

	}
}

