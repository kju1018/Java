package ch06.exam02;

public class Example {

	public static void main(String[] args) {

//		Car myCar;//���� ����
//		new Car(); ��ü�� ��������� Car��ü�� ������ ���ϵ�
		// ��ü ����
		Car myCar = new Car();

		// �ʵ��� ���� �б�
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);

		// �ʵ��� ���� ����
		myCar.company = "�����ڵ���";// myCar��� ������
		myCar.model = "�׷���";
		myCar.price = 30000000;
		myCar.old = true;
		myCar.speed = 60;
		System.out.println();
		// �ʵ��� ���� �б�
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);

		//�ٸ� ��ü ����
		Car yourCar = new Car();
	}

}
