package com.javaex.oop.shape.v2;

public class Rectangle extends Shape implements Drawable{
	private int width;
	private int height;
	
	//부모클래스 생성자의 파라미터 값이 필요없는 생성자를 자식클래스에서 만드려면 부모클래스에서 기본생성자를 명시해줘야한다.
	//public Rectangle(int width, int height) {
	//	super();
	//	this.width=width;
	//	this.height=height;
	//}
	
	public Rectangle(int x, int y, int width, int height) {
		super(x, y);
		this.height=height;
		this.width=width;
	}
	
	@Override
	public void draw() {
		System.out.printf("사각형 [x=%d,y=%d, width=%d, height=%d, area=%f]\n",x,y,width,height,area());
		
	}

	@Override
	public double area() {
		
		return width*height;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle other = (Rectangle) obj;
			return (other.height*other.width)==this.height*this.width;
		}
		return super.equals(obj);
	}
	
	
	
}
