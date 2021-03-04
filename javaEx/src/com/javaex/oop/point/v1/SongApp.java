package com.javaex.oop.point.v1;

public class SongApp {
	public static void main(String[] args) {
		Song song = new Song();
		song.setArtist("아이유");
		song.setTitle("좋은날");
		song.setAlbum("Real");
		song.setYear(2010);
		song.setTrack("3번 track");
		song.setComposer("이민수");
		song.showInfo();
		System.out.println();
		Song song2 = new Song("버스커버스커","벚꽃엔딩","버스커버스커1집","4번 track",2012,"장범준");
		song2.showInfo();
	}
}
