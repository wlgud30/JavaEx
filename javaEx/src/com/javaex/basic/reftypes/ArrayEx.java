package com.javaex.basic.reftypes;

public class ArrayEx {
	public static void main(String[] args) {
		//arrayBasic();
		//twoDimens();
		//arrayCopyFor();
		arrayCopySystem();
	}
	//배열 복사 system객체 이용
	
	
	private static void arrayCopySystem() {
		int source[] = {1,2,3};
		int target[] = new int[10];
		
		System.arraycopy(source, 0, target, 0, source.length);
		//(원본배열,복사시직위치,타겟배열,타겟배열의시작위치,타겟배열의길이?
		
		for(int i = 0 ; i <target.length;i++) {
			System.out.println(target[i]);
		}
		
		for(int value : target) {
			System.out.println(value);
		}
		
	}
	//배열복사
	private static void arrayCopyFor() {
		//배열은 크기 변경이 불가
		//추가 공간을 확보하려면 새 배열을 만들고 원래 요소값을 복사
		
		int source[] = {1,2,3};
		int target[] = new int[10];	//10개 배열
		
		//복사
		for(int i = 0 ; i < source.length; i++) {
			target[i] = source[i];
		}
		for(int i = 0 ; i< target.length; i++) {
			System.out.println(target[i]);
		}
		
	}

	private static void twoDimens() {
		//int[][] twoDimens = new int[5][10];	//5행10열
		
		//기본 데이터가 있을 경우 초기화
		
		int table[][] = {
				{1,2,3,4,5},	//한 행의 배열
				{2,3,4,5,6},
				{3,4,5,6,7}
		};
		System.out.println(table.length);
		int total=0;
		//테이블 배열의 모든 값을 합산
		for(int i =0; i<table.length;i++) {
			for(int j = 0 ; j<table[i].length;j++) {
				total = total+table[i][j];
				System.out.print(table[i][j]);
			}
			System.out.println();
		}
		System.out.println(total);
		
	}
	private static void arrayBasic() {
		//배열의선언
		String[] names;	 // 타입[] 식별자
		int scores[];	//타입 식별자[]
		
		//초기화
		names = new String[] {"홍길동","장발산","임꺽정","전우치"};
		
		scores = new int [4];		//4개의 공간을 가진 빈 배열
									//공간에 접근하려면 인덱스사용
		System.out.println("Length of scores"+scores.length);
		
		System.out.println(names);
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 70;
		scores[3] = 60;
		//scores[4] = 100;	 범위를 벗어난 접근은불가하다
		System.out.println(scores);
		
		float heights[] = {
				178.5f,
				175.3f,
				173.2f,
				180.5f
		};
		
		for(int i =0; i<names.length;i++) {
			System.out.printf("%s(%.2f) : score = %d%n",names[i],heights[i],scores[i]);
		}
		int [] scores2 = scores;		//참조복사 내용은 동일하나 주소값을 복사한다
		
		System.out.println("scores 와 scores2 는 같은객체?" + (scores==scores2));
		
		scores2[3] = 100;
		System.out.println(scores[3]);		//참조복사를하게되면 복사된 객체의 값을 바꾸면 원본객체의 값도 바뀌게된다
		
		
		
	}


}
