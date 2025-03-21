package javaday4_project;

class example{
	void greet(){
		System.out.println("Hello");
	}
}
class greet extends example{
	void greet(String name){
		System.out.println("Hello"+name);
	}
}
public class Task4 {

	public static void main(String[] args) {
		greet g =new greet();
		g.greet();
		g.greet("Sasmitha");

	}

}
