package com.javaex.thread.synchronize;

public class User extends Thread{
	private SharedMemory memory;
	private int data;
	
	//생성자
	public User(String name,SharedMemory memory, int data) {
		this.setName(name);
		this.memory = memory;
		this.data = data;
	}

	@Override
	public void run() {
		if(memory != null) {
			memory.setMomory(data);
		}
		//쓰레드가 시작되면
		super.run();
	}
	
	
	
	
}
