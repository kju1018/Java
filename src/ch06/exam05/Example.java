package ch06.exam05;

public class Example {

	public static void main(String[] args) {
		
		Korean k1 = new Korean();
		Korean k2 = new Korean("��μ�");
		Korean k3 = new Korean("��μ�", "123456-1234567");
		Korean k4 = new Korean("��μ�", "123456-1234567", 25);
		
//		Korean k5 = new Korean("��μ�", 25, "123456-1234567");
		
		for(int i = 0 ; i<10;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i = 0 ; i<10; ++i) {
			System.out.print(i+" ");
		}
	}

}
