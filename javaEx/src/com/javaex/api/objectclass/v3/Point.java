package com.javaex.api.objectclass.v3;

//v3 얕은 복제
//값이 같은 새로운 객체를 복제하는것 
//얕은 복제는 단순히 필드만 같은 값으로 복제한것
public class Point implements Cloneable{		//clone() 메서드 활성화
	//필드
	private int x;
	private int y;
	
	//생성자
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	//객체출력 or 문자열과 연결될 때 반환되는 문자열
	@Override
	public String toString() {
		
		return String.format("Point(x=%d y=%d)", x,y);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Point) {
			//obj -> 캐스팅
			Point other = (Point)obj;
			return this.x==other.x &&this.y==other.y;
		}
		//다른 타입은 비교방법 정의안되므로 부모의 equals 값을 그냥 리턴
		return super.equals(obj);
		
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	//복제 메서드
	public Point getClone() {
		Point clone = null;
		
		try {		//시도해서 예외가 있으면 처리하겠다
			clone = (Point)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	
	
}
