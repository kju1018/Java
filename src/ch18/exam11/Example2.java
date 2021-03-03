package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;


public class Example2 {

	public static void main(String[] args) {
		
		try {
//			System.in.read();
			//in이 참조하는 번지로가서 read를 실행
			InputStream is = System.in;
			byte[] data = new byte[100];
			while(true) {
				int readNum = is.read(data);
				String str = new String(data, 0, readNum - 2);
				System.out.println(str);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
	}

}
