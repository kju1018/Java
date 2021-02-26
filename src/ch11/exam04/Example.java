package ch11.exam04;

public class Example {

	public static void main(String[] args) {
		Class var1 = A.class;
		//보통 이렇게 사용
		//A.class는 A가 로딩된 번지다
		//A.class는 메소드 영역에 로딩된 해당 클래스의 번지
		//컴파일을 하면 .class파일이 생김
		//쓰려고하면 A가 메소드영역에 로딩이 되야함
		
		A a = new A();
		Class var2 = a.getClass();
	}

}
