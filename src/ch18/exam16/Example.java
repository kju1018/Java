package ch18.exam16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Example {

	public static void main(String[] args) throws IOException {
		
		//방법1
		/*		InputStream is = System.in;
				byte[] data = new byte[100];
				
				int readNum = is.read(data);
				String str = new String(data, 0, readNum);
				System.out.println(str);
				
				readNum = is.read(data);
				str = new String(data, 0, readNum);
				System.out.println(str);*/

		//방법2
		InputStream is = System.in;//주 스트림
		InputStreamReader isr = new InputStreamReader(is);//문자변환 보조스트림, 보통 단독으로 사용하지않고
		//BufferedReader랑 같이 사용
		BufferedReader br = new BufferedReader(isr);//성능향상 보조스트림
		
		String str = br.readLine();
		System.out.println(str);
	}

}
