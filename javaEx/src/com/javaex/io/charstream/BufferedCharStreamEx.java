package com.javaex.io.charstream;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStreamEx {
	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String source = rootPath + "last-leaf.txt";
	static final String target = rootPath + "last-leaf-filtered.txt";
	
	public static void main(String[] args) {
		//메인 스트림
		Reader reader = null;
		Writer writer = null;
		
		//보조 스트림
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			reader = new FileReader(source);
			writer = new FileWriter(target);
			// 보조 스트림은 부가적인 편의 기능을 수행한다
			br = new BufferedReader(reader);
			bw = new BufferedWriter(writer);
			//편의 기능으로 한줄 단위(개행된 문자열) 을 입출력 할 수 있는 기능을 가지고 있다.
			String line = null;
			
			while((line=br.readLine()) != null) {
				//	읽어들인 line 중 , leaf of leaves 단어가 포함된 라인만 target으로 저장
				if(line.toLowerCase().contains("leaf")||line.toLowerCase().contains("leaves")) {
					System.out.println(line);
					bw.write(line);
					bw.newLine();
				}
				
			}
			System.out.println("필터링 완료");
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾지 못했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				bw.close();
			} catch (Exception e2) {
				
			}
		}
		
	}
}
