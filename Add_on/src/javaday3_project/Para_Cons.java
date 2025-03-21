package javaday3_project;

class Bike{
	int count;
	String bikename;
	Bike(int count,String bikename){
		this.count=count;
		this.bikename=bikename;
	}
	void display() {
		System.out.println("The Bike count is : "+count);
		System.out.println("The Bike Name is : "+bikename);
	}
}
public class Para_Cons {

	public static void main(String[] args) {
		Bike b = new Bike(2,"MT");//Parameterized  Constructor
		b.display();
	}

}
