package ch07.exam01;

public class Example {

	public static void main(String[] args) {
		//Parent 객체도 자동으로 만들어짐
		Child child = new Child();
		child.field1 = 10;
		child.field2 = 20;
		child.method1();
		child.method2();
	}

}
