package ch04;

public class Exam08 {

	public static void main(String[] args) {

		int sum = 0;
		int i;
		for (i = 1; i <= 10; i++) {
			int value = i;
			sum += value;
		}
		System.out.println("1 ~ " + i + " " + sum);
	}
}
