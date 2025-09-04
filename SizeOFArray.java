package com.codegnan.controlstatements;
import java.util.Scanner;
public class SizeOFArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int size=scanner.nextInt();
		int[]numbers=new int[size];
		System.out.println("enter elements of the array");
		for(int i=0;i<size;i++) {
			System.out.println("element at index:"+i+":");
			numbers[i]=scanner.nextInt();
		}
			System.out.println("element at array:");
			for(int i=0;i<numbers.length;i++) {
			System.out.println("element at index:"+i+":"+numbers[i]);
			
		}

	}

	}
	
