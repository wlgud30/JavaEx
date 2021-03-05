package com.javaex.oop.shape.v1;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
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
	
}
