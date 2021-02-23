package ch07.exam03;

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
	
	@Override
	public void sound() {
		System.out.println("싫어요~~~");
	}
	//부모의 접근제한보다 좁으면 안된다.
	//ex) 부모가 default이면 default, public만 가능 좁은건 불가
	
}
