package com.javaex.oop.shape.v2;

public class ShapeApp {
	public static void main(String[] args) {
		//Shape s = new Shape(10,20);		// 추상클래스는 집접 객체화 할 수 없다
		Rectangle r = new Rectangle(10,10,100,50);
		Circle c= new Circle(30,40,10);
		Point p = new Point(10,20);
		String s = "Triangle";
		
		drawTest(r);
		drawTest(c);
		drawTest(p);
		drawTest(s);
		
		Rectangle a1 = new Rectangle(10,10,6,4);
		Rectangle a2 = new Rectangle(10,10,2,12);
		Rectangle a3 = new Rectangle(10,10,3,3);
		Rectangle a4 = a3;
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		System.out.println(a1.equals(a4));
		System.out.println(a4.equals(a3));
		
	}
	
	private static void drawTest(Object obj) {
		// obj -> Drawable 인터페이스 내부에 draw();
		// 참조타입이 interface 여도 Casting 가능
		if(obj instanceof Drawable) {	//Drawable 인터페이스를 구현한 객체인가?
			((Drawable) obj).draw();
		}else {
			System.out.println("그리기 객체가 아닙니다.");
		}
		
		
	}
}
