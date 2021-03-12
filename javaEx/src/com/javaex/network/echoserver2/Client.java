package com.javaex.network.echoserver2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Socket socket = null;

		try {
			// 소켓 객체 생성
			socket = new Socket();
			Scanner sc = new Scanner(System.in);

			// 시작 메세지
			System.out.println("<클라이언트 시작>");
			System.out.println("CLIENT : [연결을 요청합니다.]");

			// 접속 시도
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			socket.connect(remote);

			// 접속 성공
			System.out.println("CLIENT : [서버에 연결되었습니다.]");

			// 메세지 전송
			OutputStream os = socket.getOutputStream(); // 소켓에서 출력 스트림 획득
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			while (true) {
				String msg = sc.next();
				bw.write(msg);
				System.out.println("CLIENT : [전송 메세지] : " + msg);
				if (msg.equals("종료")) {
					break;
				}
			}
			bw.close();

			// 후처리
			System.out.println("<클라이언트 종료>");
		} catch (ConnectException e) {
			System.err.println("[접속이 거부되었습니다.]");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
	}
}
