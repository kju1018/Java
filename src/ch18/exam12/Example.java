package ch18.exam12;

import java.io.IOException;
import java.io.OutputStream;

public class Example {

	public static void main(String[] args) {

		// System.out.write();

		try {
			OutputStream os = System.out;
			os.write(65);
			os.write(new byte[] {66, 67, 68});
			System.out.println();
			os.write(new byte[] {66, 67, 68}, 0, 2);
			os.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
