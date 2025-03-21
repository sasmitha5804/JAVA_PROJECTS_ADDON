package javaday4_project;

class overload{
	void talk() {
		System.out.println("Hello");
	}
	void talk(String name) {
		System.out.println("Hello"+name);
	}
}
public class task1 {

	public static void main(String[] args) {
		overload o=new overload();
		o.talk("Sasmitha");
	}
}
