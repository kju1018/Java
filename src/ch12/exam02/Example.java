package ch12.exam02;

public class Example {

	public static void main(String[] args) {

		System.out.println("���� ������ ����");

		// ��Ʈ��ũ �۾��� �ϴ� ������ ������ ����
		// ��� 1
		Thread thread1 = new NetworkTask();
		thread1.start();

		// ���� �۾��� �ϴ� ������ ������ ����
		Thread thread2 = new MusicTask();
		thread2.start();

		// ä�� �۾��� �ϴ� ������ ������ ����
		// Thread�� ����ؼ� ����Ŭ������ �����Ѵ��� �� ����Ŭ������ ��ü�� �����.
		// �͸� �ڽ� ��ü
		Thread thread3 = new Thread() {
			@Override
			public void run() {
				while (true) {
					System.out.println("ä�� �۾��� �մϴ�.");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}

			}
		};
		thread3.start();

		while (true) {
			System.out.println("���� �۾��� �մϴ�.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}

}
