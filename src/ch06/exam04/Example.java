package ch06.exam04;

public class Example {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("김자바", "951111-4432415");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		//k1이라는 변수가 참조하고있는 객체가 갖고있는 name

		Korean k2 = new Korean("홍길동", "951111-4432415");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}
