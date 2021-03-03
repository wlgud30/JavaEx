package com.javaex.practice02;

public class Problem03 {
	public static void main(String[] args) {
		problem03();
	}
	
	//주어진 문자열의 공백을 콤마로 변환하여 출력
	private static void problem03() {
		char c[] = {'T','h','i','s',' ','i','s',' ','p','e','n','c','i','l'};
		char d[] = new char[c.length+1];
		for(char val : c) {
			System.out.print(val);
		}
		System.out.println();
		for(int i = 0 ; i<c.length;i++) {
			if(c[i]==' ') {
				d[i] = ',';
			}else {
				d[i] = c[i];
			}
		}
		for(char val : d) {
			System.out.print(val);
		}
		
	}
}
