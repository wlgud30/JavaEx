package com.javaex.io;

import java.io.File;
import java.io.IOException;


//File 클래스
//	파일의 정보를 확인
//	파일, 디렉터리를 생성, 삭제할 수는 있지만
//	파일 내용을 기록하는 것은 Stream 에서 담당한다

public class FileClassEx {
	//현재 프로젝트 내의 루트 디렉터리 위치
	private static String rootPath = System.getProperty("user.dir")+"\\files\\";
	
	public static void main(String[] args) {
		//File 객체 생성
		File root = new File(rootPath);
		System.out.println(root.exists());
		//만약 디렉터리가 존재하지않으면
		if(!root.exists()) {
			root.mkdirs();
		}
		
		printInfo(root);
		
		//새로운 파일을 생성하고자 할경우
		
		File file = new File(rootPath+"\\myFile.txt");
		System.out.println("-> myFile.txt 생성");
		if(!file.exists()) {		//파일이 있나 중복체크
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.err.println("파일을 만들지 못했습니다 ㅠ");		//실제 파일생성
			}	
		}
		printInfo(root);
		
		//파일 삭제
		System.out.println("-> myFile.txt 삭제");
		
		file.delete();
		
		printInfo(root);
		
	}

	private static void printInfo(File file) {
		System.out.println("=============================");
		//file -> directory -> 파일 목록 출력
		//	->file	-> 파일 정보 출력
		if(file.isDirectory()) {
			System.out.println(file.getName()); //디렉터리의 이름을 출력
			File[] files = file.listFiles();
			// 파일 목록
			for(File f : files) {
				System.out.print(f.isDirectory()?"d":"f" + "  ");
				System.out.println(f.getName() + ":"+f.length());
			}
		}else {
			System.out.println(file.getName() + ":"+file.length());
		}
		System.out.println("=============================");
	}

}
