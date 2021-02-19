package ch06.exam02;

public class Example {

	public static void main(String[] args) {

//		Car myCar;//변수 선언
//		new Car(); 객체가 만들어지고 Car객체의 번지가 리턴됨
		// 객체 생성
		Car myCar = new Car();

		// 필드의 값을 읽기
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);

		// 필드의 값을 변경
		myCar.company = "현대자동차";// myCar라는 변수가
		myCar.model = "그랜저";
		myCar.price = 30000000;
		myCar.old = true;
		myCar.speed = 60;
		System.out.println();
		// 필드의 값을 읽기
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.price);
		System.out.println(myCar.old);
		System.out.println(myCar.speed);

		//다른 객체 생성
		Car yourCar = new Car();
	}

}
