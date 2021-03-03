package ch18.exam08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;

public class Example {

	public static void main(String[] args) {

		String filePath = "F:\\Team5Projects\\Java\\src\\ch18\\exam08\\data.txt";

		try {
			Reader reader = new FileReader(filePath);

			char[] data = new char[1024];
			int readNum = -1;
			String str = "";
			while ((readNum = reader.read(data)) != -1) {
				// 1
//				String str = new String(data);
//				System.out.println(str);

				// 2
//				System.out.println(Arrays.toString(data));
				str += new String(data, 0, readNum);

			}
			System.out.println(str);
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
