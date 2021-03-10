package com.javaex.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class DataStreamEx {

	// 바이트 기반 스트림은 기본 데이터 타입을 저장할 수 없다
	// DataInputStream , DataOutputStream 을 이용하면 기본타입을 변환 저장할 수 있다.

	static final String rootPath = System.getProperty("user.dir") + "\\files\\";
	static final String filename = rootPath + "primitives.txt";
	static final String target = rootPath + "primitives";

	public static void main(String[] args) {
		// exportPrimitives();
		importPrimitives();
	}

	private static void importPrimitives() {
		// 메인스트림
		InputStream is = null;
		// 보조 스트림
		DataInputStream dis = null;

		try {
			is = new FileInputStream(filename);
			dis = new DataInputStream(is);

			for (int i = 0; i < 2; i++) { // 2쌍의 데이터를 불러오자
				// 출력한 순서대로 타입을 불러와야함
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int val = dis.readInt();
				float f = dis.readFloat();

				System.out.printf("%s,%b,%d,%f\n", s, b, val, f);
			}

		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
			} catch (Exception e2) {

			}
		}

	}

	private static void exportPrimitives() {
		// 메인 스트림
		OutputStream os = null;
		// 보조 스트림
		DataOutputStream dos = new DataOutputStream(os);

		try {
			os = new FileOutputStream(filename);
			dos = new DataOutputStream(os);

			// 기본 타입 출력
			// 출력순서 : String boolean int float
			dos.writeUTF("홍길동"); // 문자열출력
			dos.writeBoolean(true);
			dos.writeInt(25);
			dos.writeFloat(80.3f);

			dos.writeUTF("김길동");
			dos.writeBoolean(false);
			dos.writeInt(52);
			dos.writeFloat(30.8f);

			System.out.println("데이터 출력 완료");
		} catch (FileNotFoundException e) {

		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			try {
				dos.close();
				os.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
