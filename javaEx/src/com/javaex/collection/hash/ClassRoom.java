package com.javaex.collection.hash;

public class ClassRoom {

	private String subject;
	private String roomName;
	
	
	public ClassRoom(String subject) {
		this.subject=subject;
	}
	public ClassRoom(String subject, String roomName) {
		super();
		this.subject = subject;
		this.roomName = roomName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	@Override
	public String toString() {
		return "ClassRoom [subject=" + subject + ", roomName=" + roomName + "]";
	}
	@Override
	public int hashCode() {
		// 과목은 같으나 강의실은 다를 수 있다
		// 과목의 HashCode가 같으면 식별자가 같은것으로 한다
		return subject.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
			if(obj instanceof ClassRoom) {
				//다운 캐스팅
				ClassRoom other = (ClassRoom) obj;
				
				return subject.equals(other.subject);
			}
		return super.equals(obj);
	}
	
	
	
}
