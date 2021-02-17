package ch04homework;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 ¦ 2.출금 ¦ 3.잔고 ¦ 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");

			int select = Integer.parseInt(scanner.nextLine());

			if (select == 1) {
				System.out.print("예금액> ");
				balance += Integer.parseInt(scanner.nextLine());
			} else if (select == 2) {
				System.out.print("출금액> ");
				balance -= Integer.parseInt(scanner.nextLine());
			} else if (select == 3) {
				System.out.print("잔고> ");
				System.out.println(balance);
			} else if (select == 4) {
				run = false;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}

}
