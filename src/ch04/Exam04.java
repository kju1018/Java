package ch04;

public class Exam04 {

	public static void main(String[] args) {

		char grad = 'B';
	
		switch (grad) {
			case 'A':
				System.out.println("Ŀ�Ǹ� �����մϴ�.");
//				break;
			case 'B':
				System.out.println("������ �ݴϴ�.");
				break;
			case 'C':
				System.out.println("�λ縸 �մϴ�.");
				break;
			default:
				System.out.println("�Ű澲�� �ʽ��ϴ�.");
	
		}
		
		// --------------------------------------------
		
		if (grad == 'A') {
			System.out.println("Ŀ�Ǹ� �����մϴ�.");
			System.out.println("������ �ݴϴ�.");
		} else if (grad == 'B') {
			System.out.println("������ �ݴϴ�.");
		} else if (grad == 'C') {
			System.out.println("�λ縸 �մϴ�.");
		} else {
			System.out.println("�Ű澲�� �ʽ��ϴ�.");
		}
	}

}