package ch06.exam10;

public class Example {

	public static void main(String[] args) {
		Changer changer = new Changer();

		// Call By Value(값을 복사해서 호출)
		// 한쪽에서 값을 바꿔도 다른쪽이 안바뀜
		int v1 = 1;
		changer.change(v1);
		System.out.println(v1);

		// Call by Reference(번지를 복사해서 호출)
		//String은 내부의 값을 바꿀 수 없음 
		//(새로운 객체가 생성되어 주소를 바꿔야 바꿀 수 있음)
		String v3 = "A";
		changer.change(v3);
		System.out.println(v3);

		// Call by Reference
		int[] arr1 = { 0, 0, 0 };
		changer.change(arr1);
		System.out.println(arr1[0]);

		// Call by Reference
		String[] arr3 = { "A", "B", "C" };
		changer.change(arr3);
		System.out.println(arr3[0]);

		// Call by Reference
		Member m1 = new Member();
		System.out.println(m1.age);
		changer.change(m1);
		System.out.println(m1.age);
		
	}

}
