package ch11.exam04;

public class Example {

	public static void main(String[] args) {
		Class var1 = A.class;
		//���� �̷��� ���
		//A.class�� A�� �ε��� ������
		//A.class�� �޼ҵ� ������ �ε��� �ش� Ŭ������ ����
		//�������� �ϸ� .class������ ����
		//�������ϸ� A�� �޼ҵ念���� �ε��� �Ǿ���
		
		A a = new A();
		Class var2 = a.getClass();
	}

}
