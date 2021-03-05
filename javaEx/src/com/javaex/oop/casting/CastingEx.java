package com.javaex.oop.casting;

public class CastingEx {
	public static void main(String[] args) {
		Dog dog1 = new Dog("멍멍이");
		dog1.eat();
		dog1.walk();
		dog1.bark();
		
		Animal dog2 = new Dog("스누피");
		dog2.eat();
		dog2.walk();
		//dog2.bark();		참조타입의 설계도 내에 있는 것만 이용할 수 있다
		
		//참조타입을 자기 자신으로 변경(다운캐스팅)
		((Dog)dog2).bark();
		
		Animal pet = new Dog("아지");
		pet.eat();
		pet.walk();
		
		pet = null;
		
		pet = new Cat("야옹");
		pet.eat();
		pet.walk();
		//((Dog)dog2).bakr();		cat인스턴스는 dog 클래스의 인스턴스가 아니다
		// 중요: 다운캐스팅을 하기전에 반드시 해당 인스턴스의 설계도 클래스를 인스턴스화 한 것인지 확인해야한다.
		
		if(pet instanceof Dog) {
			((Dog)pet).bark();
		}else if(pet instanceof Cat) {
			((Cat)pet).meow();
		}
	}
}
