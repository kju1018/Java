package ch09.exam03;

public class A {
	public void method(final int x) {//final 생략가능 하지만 final없어도 final특성
		int y = 2;
//		x=10; final특성으로 값 변경 X
//		y=20; final특성으로 값 변경 X
		class B {
			public void method() {
				int result = x + y;
			}
		}
	}
}
