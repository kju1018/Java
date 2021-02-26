package ch11.exam05;

import java.util.Arrays;
import java.util.StringTokenizer;

public class String02 {

	public static void main(String[] args) {
		String ssn = "123456-1234567";

		// � ��ġ�� ���� 1���� ���
		char sex = ssn.charAt(7);
		if (sex == '1' || sex == '3') {
			System.out.println("����");
		} else {
			System.out.println("����");
		}

		// ���1 ���ڿ� �߶󳻱�
		String first = ssn.substring(0, 6);
		String second = ssn.substring(7);
		System.out.println("substring: " + first);
		System.out.println(second);

		// ���2 ���ڿ� �߶󳻱� (Ư�����ڸ� ��������)
		String[] parts = ssn.split("-");
		System.out.println("split: " + parts[0]);
		System.out.println(parts[1]);

		// ���3 ���ڿ� �и��ϱ�
		StringTokenizer st = new StringTokenizer(ssn, "-");
		while (st.hasMoreTokens()) {
			first = st.nextToken();
			System.out.println("StringTokenizer: " + first);
		}

		// ���Կ��� : ���1
		String content = "�̰��� �ڹ� å�Դϴ�";
		boolean result = content.contains("å�Դϴ�");
		// charSrquence

		System.out.println(result);

		// ���� ����: ���2
		int index = content.indexOf("�ڹ�");// 4
		// ���� ���ڸ� -1����
		if (index != -1) {
			System.out.println("�ڹ� ���� å�̱���");
		} else {
			System.out.println("�ڹ� ���� å�� �ƴϱ���.");
		}

		// ���ڿ��� ����
		int length = content.length();
		System.out.println(length);

		// ��ġ�ϱ�
		String content2 = content.replace("�ڹ�", "Java");
		// ��ġ�� ���ο� ���ڿ��� ��ȯ
		System.out.println(content2);
	}

}
