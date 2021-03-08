package com.javaex.api.generics.v3;

//Generic 
//T : type
//R : ReturnType
//K : KEY
//V : value
//... 다양한 템플릿 문자를 사용할 수 있다.

public class GenericBox<K,V>{		//<템플릿문자>
	K key;
	V content;
	
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getContent() {
		return content;
	}
	public void setContent(V content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "GenericBox [key=" + key + ", content=" + content + "]";
	}


}
