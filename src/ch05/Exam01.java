package ch05;

public class Exam01 {

	public static void main(String[] args) {
		int var1 = 10;
		int var2 = 10;
		
		//값 비교
		System.out.println(var1 == var2); // true
		System.out.println(var1 != var2); // false
		
		String var3 = "자바";
//		String var4 = "자바";
		String var4 = new String("자바");
		
		//번지 비교
		System.out.println(var3 == var4); // true
		//리터럴이 같으면 하나의 객체를 공유한다.
		System.out.println(var3 != var4); // flase
		System.out.println(var3.equals(var4)); 
	}

}
