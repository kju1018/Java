package ch10.exam06;

public class Account {
	public void deposit(String account, int money) throws NoAccountException {
		if (account == null) {
			// throw�� ���� �߻� �ڵ� ���ܸ� �߻���Ŵ -> throws�� ȣ���Ѱ����� ���ѱ�� -> ȣ���Ѱ����� try catch�� ó��
			throw new NoAccountException("�Ա� ���°� �����ϴ�.");
		}
		System.out.println("�Ա� ����");
	}

	public void withdraw(String account, int money) throws NoAccountException, BalanceLackException {
		int balance = 10000;
		if (account == null) {
			// throw�� ���� �߻� �ڵ�
			throw new NoAccountException("��� ���°� �����ϴ�.");
		} else if (money > balance) {
			throw new BalanceLackException("�ܰ� �����մϴ�.");
		} else {
			System.out.println("��� ����");
		}
	}
}
