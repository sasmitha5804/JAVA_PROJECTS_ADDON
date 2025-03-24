package javaday5_project;

import java.io.*;

public class FileDemo {

    public static void main(String[] args) {
        try {
            // Write to the file
            FileWriter w1 = new FileWriter("C:\\Users\\Sashimitha\\Desktop\\example.txt");
            w1.write("Hello, Java I/O!");
            w1.close();
            System.out.println("Data written to the file.");

            // Read from the file
            FileReader r1 = new FileReader("C:\\Users\\Sashimitha\\Desktop\\example.txt");
            int character;
            while ((character = r1.read()) != -1) {
                System.out.print((char) character); 
            }
            r1.close();

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}