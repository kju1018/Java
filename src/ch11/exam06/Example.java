package ch11.exam06;

import java.util.regex.Pattern;

public class Example {

	public static void main(String[] args) {
		// ��ȭ��ȣ üũ
		String regExp = "010-\\d{3,4}-\\d{4}";
		// "\\"2���� �־���� �Ѱ� ����

		String data = "010-23-1234";
		boolean result = Pattern.matches(regExp, data);

		if (result) {
			System.out.println("��ȿ�� ������");
		} else {
			System.out.println("�߸��� ������");
		}
		String regExp2 = ".*(?=^.{8,15}$)(?=.*\\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*";
		String password = "123456789d!";
		boolean result2 = Pattern.matches(regExp2, password);
		
		System.out.println(result2);
		
	}


}
