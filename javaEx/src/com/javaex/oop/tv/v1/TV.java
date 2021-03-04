package com.javaex.oop.tv.v1;

public class TV {
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(int channel, int volume, boolean power) {
		this.channel=channel;
		this.volume=volume;
		this.power=power;
	}
	void power(boolean power) {
		this.power=power;
	}
	void channel(int channel) {
		if(channel<=0||channel>255) {
			System.out.println("채널은 1~255까지입니다.");
		}else{
			this.channel=channel;
		}
	}
	void channel(boolean up) {
		if(up&&channel<255) {
			channel++;
		}else if(!up&&channel>1){
			channel--;
		}else {
			System.out.println("채널은 1~255까지입니다.");
		}
	}
	void volume(int volume) {
		if(volume<0||volume>=100) {
			System.out.println("볼륨은 0~100까지입니다.");
		}else {
			this.volume=volume;
		}	
	}
	void volume(boolean up) {
		if(up&&volume<100) {
			volume++;
		}else if(!up&&volume>0){
			volume--;
		}else {
			System.out.println("볼륨은 0~100까지입니다.");
		}
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	
	public void status() {
		String onoff = power?"on":"off";
		System.out.print("현재 티비의 전원은 " +onoff);
		System.out.print("\t볼륨은 "+ volume);
		System.out.println("\t채널은 "+ channel);
	}
}
