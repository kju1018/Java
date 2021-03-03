package ch18.exam18;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) throws Exception {
		
		String filePath1 = "F:/Team5Projects/Java/src/ch18/exam18/data.db";
		
		OutputStream os = new FileOutputStream(filePath1);
		DataOutputStream dos = new DataOutputStream(os);
		//이건 3이 문자가 아니라 4바이트로 저장
		dos.writeInt(3);
		dos.writeDouble(10.5);
		dos.writeBoolean(true);
		dos.writeUTF("홍길동");
		dos.flush();
		
		dos.close();
	}

}
