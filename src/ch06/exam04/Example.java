package ch06.exam04;

public class Example {

	public static void main(String[] args) {
		
		Korean k1 = new Korean("���ڹ�", "951111-4432415");
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		//k1�̶�� ������ �����ϰ��ִ� ��ü�� �����ִ� name

		Korean k2 = new Korean("ȫ�浿", "951111-4432415");
		System.out.println(k2.name);
		System.out.println(k2.ssn);
	}

}
