package ch04;

public class Exam05 {

	public static void main(String[] args) {
		// �ֻ����� ���� ������ �� ���(1, 2, 3, 4, 5, 6)
		// int value = ?;

		double temp = Math.random();

		System.out.println(temp); // [0, 1) 0���� 1����X �Ǽ�

		System.out.println(temp * 6);// [0, 6)

		System.out.println((int) (temp * 6));// [0, 6) 0 1 2 3 4 5

		System.out.println((int) (temp * 6) + 1);// [0, 6) 1 2 3 4 5 6

		int value = (int) (temp * 6) + 1;

		if (value % 2 == 0) {
			System.out.println("¦���� ���Ծ��.");	
		} else {
			System.out.println("Ȧ���� ���Ծ��.");
		}
	}

}
