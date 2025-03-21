package javaday3_project;
class Book{
	int bookId;
	String title;
	String author;
	double price;
	Book(int bookId,String title,String author,double price){
		this.bookId=bookId;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	void displayDetails() {
		System.out.println("BookIDk: "+bookId);
		System.out.println("Title: "+title);
		System.out.println("Author:"+author);
		System.out.println("Price: "+price);
		
	}
}
public class task1 {
  public static void main(String[]args) {
	  Book b=new Book(12,"C","Balagurusamy",400);
	  Book b1=new Book(13,"C++","Balagurusamy",500);
	  Book b2=new Book(14,"Java","JamesGosling",600);
	  b.displayDetails();
	  System.out.println();
	  b1.displayDetails();
	  System.out.println();
	  b2.displayDetails();
	  
	  
  }
}
