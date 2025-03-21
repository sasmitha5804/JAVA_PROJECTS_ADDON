package javaday3_project;
class Animal{
	void sound() {
		System.out.println("Animals make sounds");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Dog barks");
	}
}
//Multilevel Inheritance
class puppy extends Dog{
	void weep() {
		System.out.println("Puppy Weeps");
	}
	}



public class SingleInher {

	public static void main(String[] args) {
		puppy p1=new puppy();
		p1.sound();
		p1.bark();
		p1.weep();
	}

}
