package com.javaex.problem_ex.v1;


public class Circle {
	
	protected int x;
	protected int y;
	protected int radius;
	
	public Circle(int x,int y,int radius) {
		this.x = x;
		this.y = y;
		this.radius=radius;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			//obj -> 캐스팅
			Circle other = (Circle)obj;
			return this.radius==other.radius;
		}
		return super.equals(obj);
	}
	
	
}
