package com.javaex.api.objectclass.v4;

import java.util.Arrays;

public class ScoreBoard implements Cloneable{
	//참조형 필드
	private int[] scores;
	
	//생성자
	public ScoreBoard(int[] scores) {
		this.scores = scores;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	@Override
	public String toString() {
		return "ScoreBoard [scores=" + Arrays.toString(scores) + "]";
	}
	
	//깊은 복제를 위해 내부 참조 필드를 복제
	//clone 메서드를 재정의 해야한다(Override)
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복제를 시도
		ScoreBoard clone = (ScoreBoard) super.clone();
		
		//내부 참조 필드 복제
		clone.scores =Arrays.copyOf(scores, scores.length);
		
		return clone;
	}
	
	public ScoreBoard getClone() {
		ScoreBoard clone = null;
		
		try {
			clone = (ScoreBoard)clone();		//복제
		}catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		
		return clone;
	}


}
