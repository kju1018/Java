package ch10.exam06;

public class Example {

	public static void main(String[] args) {

		Account account = new Account();

		try {
			String ano = null;
			// 실행예외라 안붙여도 오류는 안남 하지만 실행하면 오류발생
			// try catch처리 해주는게 좋음
			account.deposit(ano, 5000);
		} catch (NoAccountException e) {
			System.out.println(e.getMessage());
		}

		String ano = "111-222-333";
		try {
			account.withdraw(ano, 1000);
			account.withdraw(ano, 10000000);
		} catch (NoAccountException e) {
			System.out.println(e.getMessage());
		} catch (BalanceLackException e) {
			System.out.println(e.getMessage());
		}

	}

}
