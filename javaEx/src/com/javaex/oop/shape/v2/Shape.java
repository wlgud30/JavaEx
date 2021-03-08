package com.javaex.oop.shape.v2;

public abstract class Shape {
	//추상 클래스:
	//	객체화 될 수 없고
	//	자식 클래스에게 필드와 메서드를 물려주는 역할
	//	특정 기능의 구현을 강제(규약)하는 역할을 수행
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x=x;
		this.y=y;
	}
	//public Shape() {
	//	
	//}
	//추상 클래스는 반드시 1개 이상의 추상메서드를 갖는다

	public abstract void draw();
	public abstract double area();
}
