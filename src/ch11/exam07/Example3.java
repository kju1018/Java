package ch11.exam07;

public class Example3 {
	public static void main(String[] args) {
		
//		Integer var1 = new Integer(500);
//		Integer var2 = new Integer(500);
//		Integer var1 = 500;
//		Integer var2 = 500;
		//자동 박싱이 되는데 각각 박싱이 된다.
		/*
		false
		true
		*/
		
		Integer var1 = 10;
		Integer var2 = 10;
		// ==은 값의 범위가 -127 ~ 127 사이면 객체를 공유함
		System.out.println(var1 == var2); 
		// var1 == var2 는 번지비교
		//값의 범위에따라 다른 값
		System.out.println(var1.equals(var2));
		// 값만 비교
		//결론 이거 써라
		/*		
		true
		true
		*/
		
		
	}
}
