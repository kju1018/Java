package ch08.exam01;

public class Example {

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		//Audio��� ��ü�� RemoteControl�������̽��� ����ϰڴ�.
		
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}

}
