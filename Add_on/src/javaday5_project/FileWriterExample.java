package javaday5_project;
import java.io.*;
public class FileWriterExample {

	public static void main(String[] args) {
		 try {
	            // Write to the file
	            FileWriter w1 = new FileWriter("C:\\Users\\Sashimitha\\Desktop\\example.txt");
	            w1.write("Hello All");
	            w1.close();
	            System.out.println("Data written to the file.");
		 }catch (IOException e) {
	            System.out.println("An error occurred: " + e.getMessage());
	        }

	}

}
