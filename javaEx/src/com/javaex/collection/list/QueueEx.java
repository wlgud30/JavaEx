package com.javaex.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	//FIFO First Input First Output
	public static void main(String[] args) {
		// Queue 는 인터페이스 , 실제 클래스는 List 관련 실체 클래스를 사용
		Queue<Integer> queue = new LinkedList<>();
		
		//데이터 제공
		for(int i = 0 ; i<10;i++) {
			queue.offer(i);
			System.out.println(queue);
		}
		
		//데이터 확인
		int item = queue.peek();		//데이터는 삭제되지않음
		System.out.println(item);
		System.out.println(queue);
		//데이터 인철
		item = queue.poll();
		System.out.println(item);
		System.out.println(queue);
		
		//queue에서 poll할때, 비어있는지 반드시 확인해주자
		
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
			System.out.println(queue);
		}
		
	}

}
