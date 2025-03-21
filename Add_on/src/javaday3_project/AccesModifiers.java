package javaday3_project;
class Student1{
	public String name="Ram";
	private int age=19;
	protected String grade="A";
	String School="ABC School";
	
	public void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Grade : "+grade);
		System.out.println("School : "+School);
	}
}
public class AccesModifiers {

	public static void main(String[] args) {
		Student1 s=new Student1();
		s.display();
		System.out.println("Name : "+s.name);
		System.out.println("School : "+s.School);
		
		//System.out.println("Grade : "+grade);
		//System.out.println("School : "+School);
	}

}
