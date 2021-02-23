package ch07.exam07;

public class Example {

	public static void main(String[] args) {
		//Parent 객체도 자동으로 만들어짐
		Child child = new Child();
		child.method1();//Parent의 메소드
		child.method2();//Child의 메소드
		child.method3();//Child의 메소드
		
		Parent parent = child;
		parent.method1();//Parent의 메소드
		parent.method2();//Child의 메소드
		//method2는 Child클래스에서 오버라이딩하기 때문에
		//method2는 Child클래스의 method2를 호출
		
		//parent.method3();
		//parent는 변수 타입이 Parent이기 때문에 method1, method2만 사용가능
		
	}

}
