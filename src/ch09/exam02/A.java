package ch09.exam02;

public class A {
	public class B {
		public int field;
		public B() {}
		public void method() {}
	}

	public static class C {
		public int field;
		public C() {}
		public void method() {}
	}
	
	public void method() {
		//메소드 안에서 선언된 클래스는 접근제한자 불가
		//D는 메소드 안에서만 사용가능
		class D {
			public int field;
			public D() {}
			public void method() {}
		}
		D d = new D();
		d.field = 1;
		d.method();
	}
}
