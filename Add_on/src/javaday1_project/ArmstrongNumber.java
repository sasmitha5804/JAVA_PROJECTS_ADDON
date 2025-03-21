package javaday1_project;

	import java.util.Scanner;

	public class ArmstrongNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        scanner.close();
	        
	        int sum = 0, temp = num;
	        while (temp > 0) {
	            int digit = temp % 10;
	            sum += digit * digit * digit;
	            temp /= 10;
	        }
	        
	        System.out.println(num + (sum == num ? " is " : " is not ") + "an Armstrong number.");
	    }
	}


