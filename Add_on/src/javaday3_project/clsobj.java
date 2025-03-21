package javaday3_project;
import java.util.*;
class calculator{
	int inp1,inp2,total;
	void add() {
		total=inp1+inp2;
		System.out.println("Total: "+total);
	}
}
public class clsobj {

	public static void main(String[] args) {
		calculator obj= new calculator();
     obj.inp1=100;
     obj.inp2=200;
     obj.add();
	}

}
