package ch11.exam05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class String01 {

	public static void main(String[] args) throws Exception {// JVM한테 예외를 던져줌
		byte[] arr1 = { 65, 66, 67 };
		String str1 = new String(arr1);
		// 바이트 단위 사용 네트워크 통신때 사용
		// 바이트를 받아서 문자로 만든다음 사용자에게 보여줌

		System.out.println(str1);

		String str2 = "ABC";
		// -> byte배열로
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2));
		// Arrays.toString는 배열에 있는 항목을 읽고 문자열로 출력

//		try {
		String str3 = "가나다";
		byte[] arr31 = str3.getBytes("EUC-KR");
		// 영어와 한글만 지원 다른나라 언어는 지원 안함
		// 한글 한자가 2바이트
		// [-80, -95, -77, -86, -76, -39]
		// -80, -95 = 가, -77, -86 = 나, -76, -39 = 다
		System.out.println(Arrays.toString(arr31));
		byte[] arr32 = str3.getBytes("UTF-8");
		// 보통 사용, 인터넷 표준 문자셋, 모든 언어 다 지원
		// 한글 한자가 3바이트
		// [-22, -80, -128, -21, -126, -104, -21, -117, -92]
		// -22, -80, -128 = 가, -21, -126, -104 = 나, -21, -117, -92 = 다
		System.out.println(Arrays.toString(arr32));

		
		//다시 한글을 복원
		String str4 = new String(arr31, "EUC-KR");
		String str5 = new String(arr32, "UTF-8");
		
		System.out.println(str4);
		System.out.println(str5);
		
		
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
