package com.javaex.collection.list;

import java.util.Stack;

public class StackEx {
	// Stack 자료형
	// Last Input First Output (LIFO)
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		
		System.out.println(stack);
		
		//데이터 제공
		for(int i = 0 ; i<10 ; i++) {
			stack.push(i);
				System.out.println(stack);
		}
		
		//확인 : 가장 마지막(출력위치)의 데이터를 확인
		System.out.println(stack.peek());
		System.out.println(stack);
		
		//인출 : pop	마지막 데이터를 빼낸다
		Integer item = stack.pop();
		System.out.println(item);
		System.out.println(stack);
		
		//순회
		//stack 에 값이 없을때 pop 을 시도하면 EmptyStackException 에러 발생
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
	}
	
	
}
