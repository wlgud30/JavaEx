package com.javaex.oop.point.v4;

public class PointApp {
	public static void main(String[] args) {
		Point p1 = new Point(5,10);	//기본생성자
		p1.draw();
		p1.draw(true);
		
		Point p2 = new Point(15,30);	//사용자 정의생성자
		p2.draw();
		p2.draw(false);
		
		ColorPoint cp = new ColorPoint(10, 20, "black");
		cp.draw();
		cp.draw(false);
		System.out.println("=============================");
		
		ColorPoint cp2 = new ColorPoint(30, 40, "red");
		cp2.draw();
		
		//부모 타입으로 자식을 참조할 수 있다.
		Point cp3 = new ColorPoint(50,100,"파랑");
		cp3.draw();
	}
}
