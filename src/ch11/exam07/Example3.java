package ch11.exam07;

public class Example3 {
	public static void main(String[] args) {
		
//		Integer var1 = new Integer(500);
//		Integer var2 = new Integer(500);
//		Integer var1 = 500;
//		Integer var2 = 500;
		//�ڵ� �ڽ��� �Ǵµ� ���� �ڽ��� �ȴ�.
		/*
		false
		true
		*/
		
		Integer var1 = 10;
		Integer var2 = 10;
		// ==�� ���� ������ -127 ~ 127 ���̸� ��ü�� ������
		System.out.println(var1 == var2); 
		// var1 == var2 �� ������
		//���� ���������� �ٸ� ��
		System.out.println(var1.equals(var2));
		// ���� ��
		//��� �̰� ���
		/*		
		true
		true
		*/
		
		
	}
}
