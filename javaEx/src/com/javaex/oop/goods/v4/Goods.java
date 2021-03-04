package com.javaex.oop.goods.v4;

// v4. this : 객체 자신을의미
//	this()

public class Goods {
	//this ->자신
	//this() 자신의 다른 생성자
	private String name;	
	private int price;
	
	//코드 내에 생성자가 하나도 없으면 컴파일러가 기본 생성자를 추가한다.
	// 사용자 정의 생성자가 있으면 기본 생성자를 추가하지 않는다. -> 기본 생성자 필요시 새로 생성자를 생성해야한다.
	//생성자1
	public Goods(String name) {
		this.name=name;
	}
	//모든 필드를 초기화 하는 생성자 : 생성자2
	public Goods(String name, int price) {
		//this.name = name;
		//내부에 있는 다른 생성자를 호출하고자할땐 디스를 먼저 호출한다
		this(name);
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
//	public void setName(String name) {
//		this.name = name;
//	}
	public int getPrice() {
		return price;
	}
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	public void showInfo() {
		System.out.printf("상품 이름은 :%s%n가격 : %d원%n",name,price);
	}
}
