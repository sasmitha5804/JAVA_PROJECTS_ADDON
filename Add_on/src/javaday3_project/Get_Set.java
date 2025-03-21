package javaday3_project;
class Data1{
	private String name;
	//Getter Method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name !=null && !name.isEmpty()) {
			this.name=name;
		}
		else {
			System.out.println("Invalid name");
		}
	}
	
}
public class Get_Set {

	public static void main(String[] args) {
		 Data1 s1=new Data1();
		 s1.setName("sasmitha");
		 System.out.println("Student Name: "+s1.getName());
	}
	

}
