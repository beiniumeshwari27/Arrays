package com.codegnan.controlstatements;
import java.util.Scanner;
public class Twodimessional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[][]numbers= {{1,2,3,},{5,30,6},{7,8}};
         System.out.println("Elements of 2D Array ");
         for(int i=0;i<numbers.length;i++) {
        	 for(int j=0;j<numbers[i].length;j++) {
        		 System.out.println(numbers[i][j]+"");
        		 
        	 }
        	 System.out.println();
         }
         System.out.println("print array elements in enhanved for loop");
         for(int[]row:numbers) {
        	 for(int num:row) {
        		 System.out.println(num +"");
        		 
        	 }
        	 System.out.println();
         }
	}

}
