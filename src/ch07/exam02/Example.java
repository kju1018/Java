package ch07.exam02;

public class Example {

	public static void main(String[] args) {
		//Parent °´Ã¼µµ ÀÚµ¿À¸·Î ¸¸µé¾îÁü
		Child child = new Child("±æ¶Ë");
		System.out.println(child.firstName);
		System.out.println(child.lastName);
		child.method1();
		child.method2();
	}

}
