package com.javaex.collection.hash;

public class Student {
	//필드
	int id;
	String name;
	
	public Student( String name,int id) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		//객체의 유일 식별자 -> int
		
		
		return id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student other = (Student) obj;
			
			return name.equals(other.name)&&other.id==id;
		}
		return super.equals(obj);
	}
	
	

}
