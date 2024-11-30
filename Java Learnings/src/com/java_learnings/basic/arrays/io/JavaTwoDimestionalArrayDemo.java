package com.java_learnings.basic.arrays.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaTwoDimestionalArrayDemo {

	public static void main(String[] args) {

//		int A[][] = new int[5][5];
//
//		A[0] = new int[5];
//		A[1] = new int[3];
//		A[3] = new int[2];
//		for(int x[]: A) {
//			for(int j : x) {
//				System.out.println(j+" ");
//			}
//			System.out.println("");
//		}
		
//		int A[][] = {{3,5,8},{1,4,7},{2,6,9}};
//		int B[][] = {{1,5,9},{1,9,3},{8,3,1}};
//		
//		int C[][] = new int[3][3];
//		
//		for(int x=0;x<A.length;x++) {
//			for(int y=0;y<A[x].length;y++) {
//				
//				C[x][y] = A[x][y] * B[x][y];
//
//			}
//		}
//		for(int Z[]: C) {
//			for(int p : Z) {
//				System.out.print(p+" ");
//			}
//			System.out.println("");
//		}
//		
		
		String arr[] = {"Java", "Python", "Pascal","JavaScript","Ada","Basic"};
		
		java.util.Arrays.sort(arr);
		
		for(String s : arr) {
			System.out.println(s);
		}
		
	}
}
