package ch02;

public class Exam02 {

	public static void main(String[] args) {

		// �ڵ� Ÿ�� ��ȯ
		byte var1 = 10;
		int var2 = var1;
		System.out.println("var2: " + var2);

		// ���� Ÿ�� ��ȯ
		int var3 = 10;
		byte var4 = (byte) var3;

		System.out.println("var4: " + var4);

		// ----------------------------------------------

		// �ڵ� Ÿ�� ��ȯ (������ �Ǽ����� �׻� ���� ����)
		long var5 = 10;
		float var6 = var5;

		// ���� Ÿ�� ��ȯ (�Ǽ��� �������� �׻� ū ����)
		float var7 = 10.5f;
		long var8 = (long) var7;
		// long�� 8byte�̰� float�� 4byte������ �ȵ�
		// �׻� �Ǽ��� �������� ũ��.

		// ---------------------------------
		
		//�Ǽ��� ������ ��ȯ
		double var9 = 3.14;
		int var10 = (int) var9;
		
		String a = "asd";
	

	}

}
