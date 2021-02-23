package ch08.exam02;

public class Example {

	// 이 인터페이스로 사용할 수 있는 객체만 올 수 있음 (implements RemoteControl)
	public static void method(RemoteControl rc) {
		// 인터페이스의 설명대로만 사용하는 코드
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);
	}

	public static void main(String[] args) {
		RemoteControl rc = new Television();
		// Audio라는 객체를 RemoteControl인터페이스로 사용하겠다.

		rc.turnOn();
		rc.turnOff();
		rc.setVolume(5);

		method(new Television());
		method(new Audio());
	}

}
