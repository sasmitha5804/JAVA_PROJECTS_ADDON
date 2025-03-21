package javaday4_project;

class candy{
	void taste() {
		System.out.println("tastes  chocolately");
		
	}
}
class chocolate extends candy{
	void taste() {
		System.out.println("tastes sweet");
		super.taste();
		
	}
}
public class Task3 {

	public static void main(String[] args) {
		candy c =new chocolate();
		c.taste();
		

	}

}
