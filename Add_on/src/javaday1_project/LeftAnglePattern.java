package javaday1_project;

	import java.util.Scanner;

	public class LeftAnglePattern {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();
	        scanner.close();
	        
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print("  ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	}

