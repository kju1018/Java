package ch08.exam02;

public class Example {

	// �� �������̽��� ����� �� �ִ� ��ü�� �� �� ���� (implements RemoteControl)
	public static void method(RemoteControl rc) {
		// �������̽��� �����θ� ����ϴ� �ڵ�
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		// Audio��� ��ü�� RemoteControl�������̽��� ����ϰڴ�.

		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);

		method(new Television());
		method(new Audio());
	}

}
