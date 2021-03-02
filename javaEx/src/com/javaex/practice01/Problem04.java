package com.javaex.practice01;

public class Problem04 {
	public static void main(String[] args) {
		problem04();
	}
	
	private static void problem04() {
		for(int i = 1 ; i<=10;i++) {
			for(int j = 0 ; j<=9;j++) {
				System.out.print(i+j+"\t");
			}
			System.out.println();
		}
	}
}
