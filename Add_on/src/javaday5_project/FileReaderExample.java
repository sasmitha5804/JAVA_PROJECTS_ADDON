package javaday5_project;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		try {
			FileReader r1 = new FileReader("C:\\Users\\Sashimitha\\Desktop\\example.txt");
            int character;
            System.out.println("File Contents");
            while ((character = r1.read()) != -1) {
                System.out.print((char) character); 
            }
            r1.close();
		}catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

	}

}
