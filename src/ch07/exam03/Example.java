package ch07.exam03;

public class Example {

	public static void main(String[] args) {
		//Parent ��ü�� �ڵ����� �������
		Child child = new Child("���");
		System.out.println(child.firstName);
		System.out.println(child.lastName);
		child.sound();
	}

}
