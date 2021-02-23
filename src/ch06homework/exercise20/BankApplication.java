package ch06homework.exercise20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("---------------------------------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("---------------------------------------------------------------");
			System.out.print("����> ");

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
				System.out.println("���α׷� ����");
			}
		}
	}

	private static void createAccount() {
		String ano, owner;
		int balance;
		System.out.println("----------------");
		System.out.println("���»���");
		System.out.println("----------------");
		System.out.print("���¹�ȣ: ");
		ano = scanner.nextLine();

		System.out.print("������: ");
		owner = scanner.nextLine();

		System.out.print("�ʱ��Աݾ�: ");
		balance = Integer.parseInt(scanner.nextLine());

		System.out.print("���: ");
		Account newAccount = new Account(ano, owner, balance);
		for (int i = 0; i < accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}

	private static void accountList() {
		System.out.println("----------------");
		System.out.println("���¸��");
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
		System.out.println("���");
		System.out.println("----------------");

		System.out.print("���¹�ȣ: ");
		String ano = scanner.nextLine();
		Account findAc = findAccount(ano);
		if (findAc != null) {
			System.out.print("���ݾ�: ");
			int money = Integer.parseInt(scanner.nextLine());
			findAc.setBalance(findAc.getBalance() + money);
			System.out.println("���: ������ �����Ǿ����ϴ�. �ܾ�: " + findAc.getBalance());
			
		} else {
			System.out.print("���: ���°� �����ϴ�.");
		}

	}

	private static void withdraw() {
		System.out.print("���¹�ȣ: ");
		String ano = scanner.nextLine();
		Account findAc = findAccount(ano);
		if (findAc != null) {
			System.out.print("��ݾ�: ");
			int money = Integer.parseInt(scanner.nextLine());
			if (findAc.getBalance() < money) {
				System.out.println("�ܾ��� �����մϴ�. ");
			} else {
				findAc.setBalance(findAc.getBalance() - money);
				System.out.println("����� �����Ǿ����ϴ�. �ܾ�: " + findAc.getBalance());
			}
		} else {
			System.out.println("���: ���°� �����ϴ�.");
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
