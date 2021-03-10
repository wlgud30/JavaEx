package com.javaex.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class ByteStreamEx {
	public static void main(String[] args) {
		// 입력소스
		byte input[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 목적지
		byte output[] = null;

		// 스트림 열기
		InputStream bis = null;
		OutputStream bos = null; // io작업은 예외가 많이 발생하기때문에 예외처리필수

		try {
			bis = new ByteArrayInputStream(input);
			bos = new ByteArrayOutputStream();
			
			// 입력을 위한 변수
			int data = 0;
			while((data=bis.read())!=-1) {
				//data = bis.read();		
				//1바이트를읽어옴
				System.out.println(data);
				//OutputStream으로 출력
				bos.write(data);
			}
			
			//타겟 배열로 출력
			output = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println(Arrays.toString(output));
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				bos.close();
				bis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
			
		}
		

	}
}
