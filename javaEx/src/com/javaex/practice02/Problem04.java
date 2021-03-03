package com.javaex.practice02;

public class Problem04 {
	public static void main(String[] args) {
		problem04();
	}
	//배열을 사용하여 1~45중 랜덤하게 6개의 숫자를 뽑으시오 중복체크해야함
	
	private static void problem04() {
		int[] arr = new int[6];
		for (int i = 0; i < 6; i++) {
			int ran = (int) (Math.random() * 45) + 1;
			arr[i] = ran;
			for(int j = 0 ; j<arr.length;j++) {
				if(i!=0&&arr[i]==arr[j]&&i!=j) {
					--i;
				}
			}
		}
		for(int val :arr) {
			System.out.print(val+"\t");
		}
	}
}
