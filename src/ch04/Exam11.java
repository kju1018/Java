package ch04;

public class Exam11 {

	public static void main(String[] args) {
		int count = 1;

		while (true) {
			count++;
			if (count % 2 == 0) {
				continue;
			}
			System.out.println(count);
			if (count > 10) {
				break; // while���� ������

			}
		}

		System.out.println("���α׷� ������ ���� ����");
	}

}
