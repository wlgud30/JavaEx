package com.javaex.oop.person.v1;

public class Student extends Person{
	
	private String school;
	
	public Student(String name, int age,String school) {
		super(name, age);
		this.school=school;
	}

	public Student(String school) {
		this.school=school;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	@Override
	public void showinfo() {
		System.out.println("이름 : "+name +"\t나이 : "+age+"\t 학교 : "+school);
		
	}


}
