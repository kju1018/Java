package TeamProjects;

import java.util.Scanner;

public class Teamprojects1 {

	public static void main(String[] args) {
		boolean run = true;
		String[][] boardArray = new String[100][5];
		// ��� boardArray[0 ~ 99]������ ���� �ȿ� ������ null
		// boardArray[0 ~ 99] = null�� �˻��ҽ� number ���Ĵ� null�� �ƴ�
		Scanner scanner = new Scanner(System.in);
		int number = 4;// ���� ��ȣ

		for (int i = 0; i < 3; i++) {
			boardArray[i][0] = "" + (i + 1);
			boardArray[i][1] = "title" + (i + 1);
			boardArray[i][2] = "content" + (i + 1);
			boardArray[i][3] = "name" + (i + 1);
			boardArray[i][4] = "0";
		}

		while (run) {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("1.��� | 2.����(Create) | 3.�б�(Read) | 4.����(Update) | 5.����(Delete) | 6.����");
			System.out.println("--------------------------------------------------------------------------");
			System.out.print("�޴�����> ");

			int selectMenu = Integer.parseInt(scanner.nextLine());

			if (selectMenu == 1) {

			} else if (selectMenu == 2) {

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
						boardArray[i][4] = String.valueOf(0);
						number++;
						break;
					}
				}
			} else if (selectMenu == 3) {
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
				}
				System.out.println();
				continue;

			} else if (selectMenu == 4) {
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
					if(i == 99) {
						System.out.println("�ش� ��ȣ�� ���� �����ϴ�.");
					}
				}

			} else if (selectMenu == 5) {
				System.out.println();
				System.out.print("��ȣ: ");
				String selectNumber = scanner.nextLine();

				for (int i = 0; i < 100; i++) {
					if (boardArray[i][0] != null) {
						if (boardArray[i][0].equals(selectNumber)) {
							for (int k = 0; k < 5; k++) {
								boardArray[i][k] = null;
							}
							break;
						}
					}
				}

			} else if (selectMenu == 6) {
				break;
			} else {
				System.out.println();
				continue;
			}
			System.out.println();
			System.out.println("----------------------------------------------------------------------");
			System.out.println("   ��ȣ   |     ����     |          ����          |   �۾���   |   ��ȸ��   ");
			System.out.println("----------------------------------------------------------------------");

			String[][] tempArray = new String[100][5];

			System.arraycopy(boardArray, 0, tempArray, 0, tempArray.length);

			String[] temp; 
			for (int i = 0; i < 99; i++) {
				for (int k = i+1; k < 100; k++) {
					if(tempArray[i][0] != null && tempArray[k][0] != null) {
						if(Integer.parseInt(tempArray[i][0]) > Integer.parseInt(tempArray[k][0])) {
							System.out.println(tempArray[i][0] + "   " + tempArray[k][0]);
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
						System.out.print(value + "\t");
					}
					System.out.println();
				}
			}
			System.out.println();
						
			for (int i = 99; i >= 0; i--) {
				if (boardArray[i][0] != null) {
					System.out.print(i + "      ");
					for (String value : boardArray[i]) {
						System.out.print(value + "\t");
					}
					System.out.println();
				}
			}
			System.out.println();
		}

		System.out.println("���α׷� ����");

	}


}
