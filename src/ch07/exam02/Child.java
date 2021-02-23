package ch07.exam02;

public class Child extends Parent {
	// Field
	// Constructor
	public Child(String firstName) {
		super("김", firstName);// 부모객체를 의미
		//super는 자식 생성자에서 가장 첫줄에서 사용해야함!
		System.out.println("Child 객체 생성");
	}

	// Method
	public void method2() {
		System.out.println("method2()실행");
	}
}
