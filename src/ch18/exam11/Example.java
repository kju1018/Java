package ch18.exam11;

import java.io.IOException;
import java.io.InputStream;


public class Example {

	public static void main(String[] args) {
		
		try {
//			System.in.read();
			//in�� �����ϴ� �����ΰ��� read�� ����
			InputStream is = System.in;
			while(true) {
				int keyCode = is.read();
				//����Ű ���� Ű�ڵ带 ����
				//������ �� Ű�� ���� '��'�� Ű�� 2�� �� + ��
				//1byte�� ����
				System.out.println(keyCode);
			}
		
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
	}

}
