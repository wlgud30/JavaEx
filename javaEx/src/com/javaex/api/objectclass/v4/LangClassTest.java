package com.javaex.api.objectclass.v4;

public class LangClassTest {
	
	public static void main(String[] args) {
		ScoreBoard s1 = new ScoreBoard(new int[] {10,20,30,40,50});
		System.out.println("s1 : "+s1);
		
		//복제
		ScoreBoard s2 = s1.getClone();
		System.out.println("s2 = "+s2);
		
		System.out.println("s1=s2? "+ (s1==s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		//복제된 객체의 내부 참조 자료를 변경
		s2.getScores()[2] = 100;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.getScores()==s2.getScores());
		
	}

}
