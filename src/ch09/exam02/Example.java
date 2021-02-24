package ch09.exam02;

public class Example {

	public static void main(String[] args) {
		A a = new A();
		A.B b = a.new B();
		// A.B b = A.new B();는 불가
		b.field = 1;
		b.method();

		// C는 static이기 때문에 A의 객체가 필요없음
		A.C c = new A.C();
		c.field = 1;
		c.method();
	}

}
