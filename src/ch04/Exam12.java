package ch04;

public class Exam12 {

	public static void main(String[] args) {
		int count = 1;

		while (true) {
			count++;
			System.out.println(count);
			if (count > 10) {
				break; //while문을 끝내라
//				return; // 메소드를 종료시켜라( main 함수 종료)
			}
		}
	
			
//		System.out.println("프로그램 마무리 내용 실행");
	}

}
