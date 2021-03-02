package ch18.exam05;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {
		
		String filePath = "D:\\Study\\Users\\Team5Projects\\Java\\src\\ch18\\exam05\\data.txt";
		
		try {
			OutputStream os = new FileOutputStream(filePath);
			byte[] arr = {65, 66, 67};
			
			os.write(arr);
			os.write(arr, 0, arr.length);
			//0번 위치부터 arr.length만큼 보내겠다.
			os.flush();
			os.close();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
