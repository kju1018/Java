package ch06.exam11;

public class User {
	// �ν��Ͻ��� �ʵ�, ���
	String id;
	String name;
	String password;
	static String nation="�ѱ�";//static�� ��ü�� ������ �ʾƵ� ��밡��

	// �����ڴ� Ŭ������ ��������� �ν��Ͻ��� ����� �ƴ�
	User(String name) {
		this.name = name;
	}

	static void info() {
//		name = "������"; name�� static�� �ƴϱ� ������ ��� �Ұ�
		//static���� ����Ǿ��ִ� �޼ҵ忡���� static�� ������ʵ� ��밡��
		nation = "�ѱ�";
		System.out.println("��� User�� �ѱ����Դϴ�.");
	}

	void login() {
		System.out.println(name + "���� �α����մϴ�");
	}

	void logout() {
		System.out.println(name + "���� �α׾ƿ��մϴ�");
	}

}
