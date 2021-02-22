package ch06.exam14;

public class Example {

	public static void main(String[] args) {

		System.out.println(Korean.NATION);
		// Korean.NATION = "미국";

		Korean k1 = new Korean("1234123-123124123");
		// k1.ssn = "변경"; final로 변경 불가

		System.out.println(Math.PI);
		double area = 10 * 10 * Math.PI;
		
	}

}
