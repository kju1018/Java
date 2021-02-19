package ch06.exam05;

public class Korean {
	// Field
	String nation = "한국";
	String name;
	String ssn;
	int age;

	// Constructor Overloading
	Korean() {
	}

	Korean(String name) {
		this.name = name;
	}

	Korean(String name, String ssn) {
	
		this.name = name;
		this.ssn = ssn;
	}

	Korean(String name, String ssn, int age) {
		this.name = name;
		this.ssn = ssn;
		this.age = age;
	}

//	Korean(String name, int age, String ssn) {
//
//	}

	// 자바는 생성자를 식별할 때 타입을 보고 식별함
	/*
	 * Korean(String ssn, String name) { // 같은거로 취급 String, String
	 * 
	 * }
	 */
}
