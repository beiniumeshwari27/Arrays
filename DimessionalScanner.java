package com.codegnan.controlstatements;
import java.util.Scanner;
public class DimessionalScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows=scanner.nextInt();
		System.out.println("Enter number of colums");
		int colums=scanner.nextInt();
		int[][]matrix=new int[rows][colums];
		System.out.println("Enter elements of the array from end user");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<colums;j++) {
				System.out.println("enter element at row"+(i)+",colums"+(j)+":");
				matrix[i][j]=scanner.nextInt();
				
			}
			System.out.println("element in 2d array");
			for(int[]row:matrix) {
				for(int num:row) {
					System.out.print(num+"");
					
				}
				System.out.println();
			}
		}

	}

}
