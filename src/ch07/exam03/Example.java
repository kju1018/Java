package ch07.exam03;

public class Example {

	public static void main(String[] args) {
		//Parent 객체도 자동으로 만들어짐
		Child child = new Child("길똥");
		System.out.println(child.firstName);
		System.out.println(child.lastName);
		child.sound();
	}

}
