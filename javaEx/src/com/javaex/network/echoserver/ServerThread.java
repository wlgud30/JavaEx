package com.javaex.network.echoserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ServerThread extends Thread {
	// 실제 통신 담당 쓰레드
	private Socket socket;

	// 생성자
	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	// Thread Logic
	@Override
	public void run() {
		// 접속이 허용되면 클라이언트의 정보 확인
		InetSocketAddress socketAddress = (InetSocketAddress) socket.getRemoteSocketAddress(); // 원격지 소켓의주소
		System.out.println("SERVER : [클라이언트가 연결되었습니다.");
		System.out.println("\t 클라이언트 : " + socketAddress.getAddress() + " : " + socketAddress.getPort());
		try {

			// 메세지 수신
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			// Each Back 을 위한 OutputStream
			OutputStream os = socket.getOutputStream();
			Writer osw = new OutputStreamWriter(os, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);

			// 메세지 읽어오기
			String msg;

			while (true) {
				msg = br.readLine();
				if (msg == null) {
					System.out.println("SERVER : [접속을 종료합니다.]");
					break;
				}

				System.out.println("SERVER : [수신 메세지] : " + msg);

				// Echo Back 메세지 전송
				msg = "Echo back - " + msg;
				System.out.println("SERVER : [Echo back] : " + msg);
				bw.write(msg);
				bw.newLine();
				bw.flush();
			}
			bw.close();
			br.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		super.run();
	}

}
