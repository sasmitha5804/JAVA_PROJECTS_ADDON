package javaday4_project;

class bike{
	void Duke() {
		System.out.println("Its is DUKE Bike.");
	}
}
class splender extends bike{
	void Duke() {
		System.out.println("Its is DUKE Bike.");
}
}
public class Task2 {
   public static void main(String[] args) {
		
    bike b= new bike();
    splender s=new splender();
    b.Duke();
    s.Duke();
	}
}


