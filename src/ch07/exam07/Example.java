package ch07.exam07;

public class Example {

	public static void main(String[] args) {
		//Parent ��ü�� �ڵ����� �������
		Child child = new Child();
		child.method1();//Parent�� �޼ҵ�
		child.method2();//Child�� �޼ҵ�
		child.method3();//Child�� �޼ҵ�
		
		Parent parent = child;
		parent.method1();//Parent�� �޼ҵ�
		parent.method2();//Child�� �޼ҵ�
		//method2�� ChildŬ�������� �������̵��ϱ� ������
		//method2�� ChildŬ������ method2�� ȣ��
		
		//parent.method3();
		//parent�� ���� Ÿ���� Parent�̱� ������ method1, method2�� ��밡��
		
	}

}
