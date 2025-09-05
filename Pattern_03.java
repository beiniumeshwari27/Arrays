package com.codegnan.controlstatements;

public class Pattern_03 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=0;j<6-i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
