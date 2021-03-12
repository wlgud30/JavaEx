package com.javaex.network.echoserver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class Server {
	public static void main(String[] args) {
		// 서버 소켓
		ServerSocket server = null;
		try {
			// 바인드 - IP 연결
			server = new ServerSocket();
			SocketAddress ips = new InetSocketAddress("0.0.0.0", 10000);
			server.bind(ips);

			// 시작 메세지
			System.out.println("<서버 시작>");
			System.out.println("SERVER : [연결을 기다립니다.]");

			// 연결 대기
			Socket socket = server.accept(); // 클라이언트의 접속대기

			// 접속이 허용되면 클라이언트의 정보 확인
			InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress(); // 원격지 소켓의주소
			System.out.println("SERVER : [클라이언트가 연결되었습니다.");
			System.out.println("\t 클라이언트 : " + socketAddress.getAddress() + " : " + socketAddress.getPort());
			while (true) {

				// 메세지 수신
				InputStream is = socket.getInputStream();
				Reader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				// 메세지 읽어오기
				String msg;

				while (true) {
					msg = br.readLine();
					if (msg == null) {
						System.out.println("SERVER : [접속을 종료합니다.]");
						break;
					}

					System.out.println("SERVER : [수신 메세지] : " + msg);
				}
				if(msg.equals("종료")||msg==null) {
					break;
				}
			}
			// 후 처리
			System.out.println("SERVER : [서버를 종료합니다.]");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				server.close();
			} catch (IOException e) {

			}
		}
	}
}
