package com.codegnan.controlstatements;
import java.util.Scanner;
public class AverageOfArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n =scanner.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / n;
        System.out.println("Average of array elements: " + average);

        scanner.close();
    }
}	        
	        

