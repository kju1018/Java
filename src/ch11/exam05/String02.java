package ch11.exam05;

import java.util.Arrays;
import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {
		String ssn = "123456-1234567";

		// 어떤 위치의 문자 1개를 얻기
		char sex = ssn.charAt(7);
		if (sex == '1' || sex == '3') {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}

		// 방법1 문자열 잘라내기
		String first = ssn.substring(0, 6);
		String second = ssn.substring(7);
		System.out.println("substring: " + first);
		System.out.println(second);

		// 방법2 문자열 잘라내기 (특정문자를 기준으로)
		String[] parts = ssn.split("-");
		System.out.println("split: " + parts[0]);
		System.out.println(parts[1]);

		// 방법3 문자열 분리하기
		StringTokenizer st = new StringTokenizer(ssn, "-");
		while (st.hasMoreTokens()) {
			first = st.nextToken();
			System.out.println("StringTokenizer: " + first);
		}

		// 포함여부 : 방법1
		String content = "이것은 자바 책입니다";
		boolean result = content.contains("책입니다");
		// charSrquence

		System.out.println(result);

		// 포함 여부: 방법2
		int index = content.indexOf("자바");// 4
		// 없는 글자면 -1리턴
		if (index != -1) {
			System.out.println("자바 관련 책이군요");
		} else {
			System.out.println("자바 관련 책이 아니군요.");
		}

		// 문자열의 길이
		int length = content.length();
		System.out.println(length);

		// 대치하기
		String content2 = content.replace("자바", "Java");
		// 대치된 새로운 문자열을 반환
		System.out.println(content2);
	}

}
