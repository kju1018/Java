package ch06homework.exercise15;

public class MemberService {

	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}
		return false;
	}

	void logout(String id) {
		if (id.equals("hong")) {
			System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
		}
	}
}
