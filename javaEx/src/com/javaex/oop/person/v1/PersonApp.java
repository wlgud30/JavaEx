package com.javaex.oop.person.v1;

public class PersonApp {
	public static void main(String[] args) {
		Person p = new Person("정우성",45);
		Student s1 = new Student("서울고등학교");
		Student s2 = new Student("이정재",45,"한국고등학교");
		// 자식이 부모를 호출할순 없다 Student s3 = (Student) new Person("이지훈",52);
		Person p2 = new Student("학교");
		
		p.showinfo();
		s1.showinfo();
		s2.showinfo();
		p2.showinfo();
		
	}
}
