package ch07.exam03;

public class Child extends Parent {
	// Field
	// Constructor
	public Child(String firstName) {
		super("��", firstName);// �θ�ü�� �ǹ�
		//super�� �ڽ� �����ڿ��� ���� ù�ٿ��� ����ؾ���!
		System.out.println("Child ��ü ����");
	}

	// Method
	public void method2() {
		System.out.println("method2()����");
	}
	
	@Override
	public void sound() {
		System.out.println("�Ⱦ��~~~");
	}
	//�θ��� �������Ѻ��� ������ �ȵȴ�.
	//ex) �θ� default�̸� default, public�� ���� ������ �Ұ�
	
}
