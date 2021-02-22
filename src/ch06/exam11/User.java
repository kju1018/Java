package ch06.exam11;

public class User {
	// 인스턴스의 필드, 멤버
	String id;
	String name;
	String password;
	static String nation="한국";//static은 객체를 만들지 않아도 사용가능

	// 생성자는 클래스의 멤버이지만 인스턴스의 멤버는 아님
	User(String name) {
		this.name = name;
	}

	static void info() {
//		name = "나나나"; name은 static이 아니기 때문에 사용 불가
		//static으로 선언되어있는 메소드에서는 static이 선언된필드 사용가능
		nation = "한국";
		System.out.println("모든 User는 한국인입니다.");
	}

	void login() {
		System.out.println(name + "님이 로그인합니다");
	}

	void logout() {
		System.out.println(name + "님이 로그아웃합니다");
	}

}
