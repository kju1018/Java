package ch08.exam01;

public interface RemoteControl {
	// ���
	// public static final ����
	String COMPANY = "�Ｚ";
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 1;
	// �޼ҵ�(��ü ��� ����)
	//public abstract ����
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
