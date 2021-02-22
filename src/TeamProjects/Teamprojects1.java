package TeamProjects;

import java.util.Scanner;

public class Teamprojects1 {

	public static void main(String[] args) {
		boolean run = true;
		String[][] boardArray = new String[100][5];
		Scanner scanner = new Scanner(System.in);
		int number = 1;// ���� ��ȣ
		int count = 0;

		while (run) {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("1.��� | 2.����(Create) | 3.�б�(Read) | 4.����(Update) | 5.����(Delete) | 6.����");
			System.out.println("--------------------------------------------------------------------------");
			System.out.print("�޴�����> ");

			String selectMenu = scanner.nextLine();

			if (selectMenu.equals("1")) {

			} else if (selectMenu.equals("2")) {
				System.out.print("����: ");
				String title = scanner.nextLine();
				System.out.print("����: ");
				String contents = scanner.nextLine();
				System.out.print("�۾���: ");
				String name = scanner.nextLine();
				for (int i = 0; i < boardArray.length; i++) {
					if (boardArray[i][0] == null) {
						boardArray[i][0] = String.valueOf(number);
						boardArray[i][1] = title;
						boardArray[i][2] = contents;
						boardArray[i][3] = name;
						boardArray[i][4] = "0";
						number++;
						count++;
						break;
					}
				}
			} else if (selectMenu.equals("3")) {
				System.out.print("��ȣ: ");
				String selectNumber = scanner.nextLine();

				for (int i = 0; i < 100; i++) {
					if (boardArray[i][0] != null) {
						if (boardArray[i][0].equals(selectNumber)) {
							System.out.println();
							System.out.println("����: " + boardArray[i][1]);
							System.out.println("����: " + boardArray[i][2]);
							System.out.println("�۾���: " + boardArray[i][3]);
							int view = Integer.parseInt(boardArray[i][4]) + 1;
							System.out.println("��ȸ��: " + view);
							boardArray[i][4] = String.valueOf(view);
							break;
						}
					}
					if (i == 99) {
						System.out.println("�ش� ��ȣ�� ���� �����ϴ�.");
					} //
				}
				System.out.println();
				continue;

			} else if (selectMenu.equals("4")) {
				System.out.println();
				System.out.print("��ȣ: ");
				String selectNumber = scanner.nextLine();

				for (int i = 0; i < 100; i++) {
					if (boardArray[i][0] != null) {
						if (boardArray[i][0].equals(selectNumber)) {
							System.out.println();
							System.out.println("��������: " + boardArray[i][1]);
							System.out.print("��������: ");
							String editTitle = scanner.nextLine();
							if (!editTitle.equals("")) {
								boardArray[i][1] = editTitle;
							}

							System.out.println("��������: " + boardArray[i][2]);
							System.out.print("��������: ");
							String editContent = scanner.nextLine();
							if (!editContent.equals("")) {
								boardArray[i][2] = editContent;
							}
							break;
						}
					}
					if (i == 99) {
						System.out.println("�ش� ��ȣ�� ���� �����ϴ�.");
					}
				}

			} else if (selectMenu.equals("5")) {
				System.out.println();
				System.out.print("��ȣ: ");
				String selectNumber = scanner.nextLine();

				for (int i = 0; i < 100; i++) {
					if (boardArray[i][0] != null) {
						if (boardArray[i][0].equals(selectNumber)) {
							for (int k = 0; k < 5; k++) {
								boardArray[i][k] = null;
							}
							count--;
							break;
						}
					}
					if (i == 99) {
						System.out.println("�ش� ��ȣ�� ���� �����ϴ�.");
					}
				}

			} else if (selectMenu.equals("6")) {
				break;
			} else {
				System.out.println("�ٽ� �Է��� �ּ���.");
				System.out.println();
				continue;
			}
			System.out.println();
			System.out.println("------------------------------------------------------------------------------------");
			System.out.println("\t��ȣ\t |\t����\t |\t����\t |\t�۾���\t |\t��ȸ��\t ");
			System.out.println("------------------------------------------------------------------------------------");

			String[][] tempArray = new String[100][5];

			System.arraycopy(boardArray, 0, tempArray, 0, tempArray.length);

			String[] temp;
			if (count <= 0) {
				System.out.println("���� �����ϴ�.");
			} else if(count < 100){
				for (int i = 0; i < 99; i++) {
					for (int k = i + 1; k < 100; k++) {
						if (tempArray[i][0] != null && tempArray[k][0] != null) {
							if (Integer.parseInt(tempArray[i][0]) > Integer.parseInt(tempArray[k][0])) {
								temp = tempArray[k];
								tempArray[k] = tempArray[i];
								tempArray[i] = temp;
							}
						}
					}
				}

				for (int i = 99; i >= 0; i--) {
					if (tempArray[i][0] != null) {
						for (String value : tempArray[i]) {
							System.out.print("\t" + value + "\t");
						}
						System.out.println();
					}
				}
			}
			System.out.println();

		}

		System.out.println("���α׷� ����");

	}

}
