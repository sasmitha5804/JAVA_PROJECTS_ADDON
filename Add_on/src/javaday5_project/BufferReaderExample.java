package javaday5_project;
import java.io.*;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) {
		 try {
	            // Write to the file
	            BufferedReader r1 = new BufferedReader( new FileReader("C:\\Users\\Sashimitha\\Desktop\\example.txt"));
	            String line;
	            System.out.println("reading file line by line:");
	            while((line=r1.readLine())!=null) {
	            	System.out.println(line);
	            }
		 }catch (IOException e) {
	            System.out.println("Error reading file: " + e.getMessage());
	        }

	}

}
