package com.javaex.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//배열을 조작하는데 도움을주는 클래스

public class ArraysEx {
	public static void main(String[] args) {
		//arrayCopyEx();
		//basicSortAsc();
		//basicSortDesc();
		//customClassSort();
		//basicSearch();
		customClassSearch();
	}
	//사용자 정의 클래스의 검색
	private static void customClassSearch() {
		Member [] members = {
				new Member("홍길동"),
				new Member("장길산"),
				new Member("전우치")
		};
		Arrays.sort(members); 			//Comparable 인터페이스 구현
		System.out.println(Arrays.toString(members));
		int idx = Arrays.binarySearch(members, new Member("홍길동"),new Comparator<Member>() {

			@Override
			public int compare(Member o1, Member o2) {
				
				return o1.name.compareTo(o2.name);
			}
			
		});
		System.out.println(idx);
	}
	
	
	private static void basicSearch() {
		//java 의 기본 검색 방식은 binarySearch
		//검색 이전에 반드시 정렬이 되어 있어야한다.
		int[] nums = {5,8,1,3,6,9,10,5,8,2};
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		int index = Arrays.binarySearch(nums, 9);
		System.out.println("9의 인덱스 : "+ index);
		
		String[] words = {"Java","C","C++","Python","Linux"};
		System.out.println("원본 : "+Arrays.toString(words));
		Arrays.sort(words);
		index = Arrays.binarySearch(words, "Java");
		System.out.println("Java 의 인덱스 : "+index);
		
	}
	//사용자 정의 클래스 정렬
	
	private static void customClassSort() {
		Member [] members = {
				new Member("홍길동"),
				new Member("장길산"),
				new Member("전우치")
		};
		System.out.println("원본 배열 : "+ Arrays.toString(members));
		Arrays.sort(members); // 사용자 정의 클래스를 비교(소트 등)
		System.out.println("원본 배열 : "+ Arrays.toString(members));
		Arrays.sort(members,Collections.reverseOrder());
		System.out.println("원본 배열 : "+ Arrays.toString(members));
	}
	
	//기본 자료형의 오름차순 정렬
	private static void basicSortAsc() {		//ascending(오름차순)
		int [] scores = {80,50,30,90,75,88,77};
		System.out.println("원본 : " + Arrays.toString(scores));
		Arrays.sort(scores);
		System.out.println("올림차순정렬 : " + Arrays.toString(scores));
	}
	//기본 자료형의 내림차순 정렬
	private static void basicSortDesc() {		//descending(내림차순)
		Integer [] scores = {80,50,30,90,75,88,77};
		System.out.println("원본 : " + Arrays.toString(scores));
		Arrays.sort(scores,Collections.reverseOrder());
		System.out.println("내림차순정렬 : " + Arrays.toString(scores));
	}
	
	//배열 복사
	private static void arrayCopyEx() {
		//회고
		char src[] = "Java Programing".toCharArray();
		
		System.out.println(Arrays.toString(src));
		
		for(int i = 0 ; i<src.length;i++) {
			System.out.println(src[i]);
		}
	
		int src2[] = {1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(src2));
		//시스템을 이용한 복사
		int[] target = new int[10];
		char[] target2 = new char[src.length];
		System.arraycopy(src2, 0, target, 0, src2.length);	//(원본배열,원본배열 복사 시작위치,타겟배열,타겟배열복사시작위치,길이)
		System.out.println(target);
		
		for(int i = 0 ; i<target.length;i++) {
			System.out.print(target[i]+" ");
		}
		System.out.println();
		target2 = Arrays.copyOf(src, src.length);		//복사할 객체 , 복사할 길이
		System.out.println(Arrays.toString(target2));
		//배열의 일부복제
		target2 = Arrays.copyOfRange(src, 5, 12);	//복사할 객체, 복사할시작 지점, 끝지점
		System.out.println(Arrays.toString(target2));
	}
	
}	
