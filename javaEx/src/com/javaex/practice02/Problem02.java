package com.javaex.practice02;

import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		problem02();
		
	}
	
	private static void problem02() {
		Scanner sc = new Scanner(System.in);
		double arr[] = new double[5];
		for(int i = 0 ; i<5;i++	) {
			arr[i] = sc.nextDouble();
		}
		sc.close();
		double sum =0;
		
		for(double val : arr) {
			sum += val;
		}
		String result = "평균은" +sum/arr.length+"입니다";
		
		System.out.println(result);
	}
}
