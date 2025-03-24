package javaday5_project;
import java.io.*;
public class BufferWriterExample {

	public static void main(String[] args) {
		try {
			 BufferedWriter writer = new BufferedWriter( new FileWriter("C:\\Users\\Sashimitha\\Desktop\\example.txt"));
	         writer.write("Java file handling example.");
	         writer.newLine();
	         writer .write("BufferedWriter makes writing more efficient.");
	         writer.close();
	         System.out.println("Data written to file succesfully");
		}catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

	}

}
