package ch10.exam01;

import java.io.FileInputStream;

public class Example {

	public static void main(String[] args) {

		int[] arr = null;
		arr[0] = 10; // NullPointerException => 실행예외(컴파일러가 체크하지 않음)

//		FileInputStream fi = new FileInputStream("F:/Temp/file.txt"); 
		//FileNotFoundException => 일반 예외(컴파일 체크 예외)
		
//		int value = Integer.parseInt(scanner.nextLine());
	}

}
