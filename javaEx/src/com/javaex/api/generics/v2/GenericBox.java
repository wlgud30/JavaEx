package com.javaex.api.generics.v2;

//Generic 
//설계시에는 내부타입을 지정하지 않고 실제 인스턴스화 할때 타입을 지정해주는방식

public class GenericBox<T>{		//<템플릿문자>
	private T content;

	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}
	
	

}
