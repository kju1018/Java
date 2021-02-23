package ch07.exam03;

public class Parent {
	// Field
	public String lastName;// 성
	public String firstName;// 이름
	// Constructor

	public Parent(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
		System.out.println("Parent 객체 생성");

	}

	// Method
	public void sound() {
		System.out.println("공부해라~~~~~");
	}
}
