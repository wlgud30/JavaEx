package com.javaex.io.charstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ScannerEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "thieves.txt";
	
	public static void main(String[] args) {
		//Scanner 는 단순 키보드 입력을 받기 위한 클래스가 아님
		//다양한 입력 소스로부터 데이터를 입력 받는 범용 클래스
		Scanner sc = null;
		File f= new File(filename);
		
		try {
			sc = new Scanner(f);		//파일로부터 입력받는다
			
			String name;
			float height;
			float weight;
			
			//스캐너의 EOS(End of Stream)는 체크를 해주자.
			while(sc.hasNextLine()) {		//뒤에 남아있는 라인이 있는가?
				name = sc.next();
				height = sc.nextFloat();
				weight = sc.nextFloat();
				
				System.out.printf("%s, 키 : %f , 체중 : %f %n",name,height,weight);
				//다음행으로 이동
				sc.nextLine();
				
			}
		
		
		} catch (FileNotFoundException e) {
			System.out.println("파일을 닫아줌");
		}finally {
			try {
				sc.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
