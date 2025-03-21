package javaday1_project;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        int sum = num * (num + 1) / 2;
        System.out.println("Sum of series 1 to " + num + " is: " + sum);
    }
}
