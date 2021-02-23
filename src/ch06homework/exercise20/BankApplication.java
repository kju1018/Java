package ch06homework.exercise20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------------------");
			System.out.print("선택> ");

			int selectNo = scanner.nextInt();
			scanner.nextLine();
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}
	}

	private static void createAccount() {
		String ano, owner;
		int balance;
		System.out.println("----------------");
		System.out.println("계좌생성");
		System.out.println("----------------");
		System.out.print("계좌번호: ");
		ano = scanner.nextLine();

		System.out.print("계좌주: ");
		owner = scanner.nextLine();

		System.out.print("초기입금액: ");
		balance = Integer.parseInt(scanner.nextLine());

		System.out.print("결과: ");
		Account newAccount = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("계좌가 생성되었습니다.");
				break;
			}
		}
	}

	private static void accountList() {
		System.out.println("----------------");
		System.out.println("계좌목록");
		System.out.println("----------------");

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.println(accountArray[i].getAno() + "\t" + accountArray[i].getOwner() + "\t"
						+ accountArray[i].getBalance());
			}
		}
	}

	private static void deposit() {
		System.out.println("----------------");
		System.out.println("출금");
		System.out.println("----------------");

		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		Account findAc = findAccount(ano);
		if (findAc != null) {
			System.out.print("예금액: ");
			int money = Integer.parseInt(scanner.nextLine());
			findAc.setBalance(findAc.getBalance() + money);
			System.out.println("결과: 예금이 성공되었습니다. 잔액: " + findAc.getBalance());
			
		} else {
			System.out.print("결과: 계좌가 없습니다.");
		}

	}

	private static void withdraw() {
		System.out.print("계좌번호: ");
		String ano = scanner.nextLine();
		Account findAc = findAccount(ano);
		if (findAc != null) {
			System.out.print("출금액: ");
			int money = Integer.parseInt(scanner.nextLine());
			if (findAc.getBalance() < money) {
				System.out.println("잔액이 부족합니다. ");
			} else {
				findAc.setBalance(findAc.getBalance() - money);
				System.out.println("출금이 성공되었습니다. 잔액: " + findAc.getBalance());
			}
		} else {
			System.out.println("결과: 계좌가 없습니다.");
		}

	}

	private static Account findAccount(String ano) {

		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] != null) {
				if (accountArray[i].getAno().equals(ano)) {
					return accountArray[i];
				}
			}
		}
		return null;
	}

}
