package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;


public class Example {

	public static void main(String[] args) {
		
		try {
//			System.in.read();
			//in이 참조하는 번지로가서 read를 실행
			InputStream is = System.in;
			while(true) {
				int keyCode = is.read();
				//방향키 같은 키코드를 읽음
				//무조건 한 키만 읽음 '아'는 키가 2개 ㅇ + ㅏ
				//1byte만 읽음
				System.out.println(keyCode);
			}
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
	}

}
