package javaday1_project;

public class Operators {

	public static void main(String[] args) {
		//Arithmetic

				int a=20;

				int b=100;

				System.out.println("Addition:"+(a+b));

				System.out.println("Subtraction:"+(a-b));

				System.out.println("Multiplication:"+(a*b));

				System.out.println("Division:"+(a/b));

				System.out.println("Modules:"+(a%b));

				System.out.println("\n");

				

				//Relational

				System.out.println("Equal:"+(a==b));

				System.out.println("Greater than:"+(a>b));

				System.out.println("Less than:"+(a<b));

				System.out.println("Greater than or Equal:"+(a>=b));

				System.out.println(" Less than or Equal:"+(a<=b));

				System.out.println("NotEqual:"+(a!=b)+"/n");

				System.out.println("\n");

				

				//lOGICAL

				boolean x=true;

				boolean y=false;

				System.out.println(x&&y);

				System.out.println(x||y);

				System.out.println(x!=y);

				System.out.println("\n");

				

				

				//Unary

				int e=10;

				//Post Increment 

				System.out.println(e);

				System.out.println(e++);

				System.out.println(e);

				System.out.println("\n");

				//Post Decrement

				System.out.println(e--);

				System.out.println(e);

				System.out.println("\n");



				

				

				//Pre_Inrement

				System.out.println(++e);

				System.out.println("\n");

				

				//Pre_Decrement

				System.out.println(--e);

				System.out.println("\n");

				

				//Assignment

				int s=200;

				System.out.println(s+=400);

				System.out.println(s-=400);

				System.out.println(s*=400);

				System.out.println(s/=400);

				System.out.println(s%=400);

				System.out.println("\n");

				

				int p=10;

				int q=20;

				p=p+q;

				q=p-q;

				p=p-q;

				System.out.println(p);

				System.out.println(q);

				System.out.println("\n");

				

				//Ternary

				int age=18;

				String result;

				result=(age>=18)?"Eligible for vote":"Not Eligible to vote";

				System.out.println(result);

				System.out.println("\n");

				

				//Bitwise

				int m=10;

				int n=20;

				System.out.println(m&n);

				System.out.println(m|n);

				System.out.println(~m);

				
	}

}
