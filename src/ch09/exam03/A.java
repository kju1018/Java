package ch09.exam03;

public class A {
	public void method(final int x) {//final �������� ������ final��� finalƯ��
		int y = 2;
//		x=10; finalƯ������ �� ���� X
//		y=20; finalƯ������ �� ���� X
		class B {
			public void method() {
				int result = x + y;
			}
		}
	}
}
