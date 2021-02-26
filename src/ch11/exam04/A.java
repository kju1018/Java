package ch11.exam04;

public class A {
	public int field1;
	public int field2;

	public A() {}

	public A(int field1) {
		this.field1 = field1;
	}
	
	public void method1() {}
	public void method2() {}
	

	//이클립스가 어떻게 구성요소를 다 알고있는지
	//리플렉션을 이용해서 조사
	
	//로깅할때 사용 패키지 이름을 얻어낼때
	//A가 로딩된 메소드영역의 번지 A.class
	
}
