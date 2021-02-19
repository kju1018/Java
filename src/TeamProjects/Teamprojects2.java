package TeamProjects;

import java.util.Scanner;

public class Teamprojects2 {

	public static void main(String[] args) {
		boolean run = true;
		String[][] boardArray = new String[100][5];
		// ��� boardArray[0 ~ 99]������ ���� �ȿ� ������ null
		// boardArray[0 ~ 99] = null�� �˻��ҽ� number ���Ĵ� null�� �ƴ�
		Scanner scanner = new Scanner(System.in);
		int number = 4;// ���� ��ȣ
		int end = 2; //�迭 �� ��ġ

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
						if(i > end)
							end++;
						System.out.println(end);
						number++;
						break;
					}
				}
			} else if (selectMenu == 3) {
				System.out.print("��ȣ: ");
				int selectNumber = Integer.parseInt(scanner.nextLine());
				
				

				if (selectNumber <= 0 || selectNumber >= number) {
					System.out.println("���� �������� �ʽ��ϴ�.");
					System.out.println();
				} else if (boardArray[selectNumber - 1][0] == null) {
					System.out.println("���� �������� �ʽ��ϴ�.");
					System.out.println();
				} else {

					System.out.println();
					System.out.println("����: " + boardArray[selectNumber - 1][1]);
					System.out.println("����: " + boardArray[selectNumber - 1][2]);
					System.out.println("�۾���: " + boardArray[selectNumber - 1][3]);

					int view = Integer.parseInt(boardArray[selectNumber - 1][4]) + 1;
					System.out.println("��ȸ��: " + view);
					boardArray[selectNumber - 1][4] = String.valueOf(view);

					System.out.println();
				}
				continue;

			} else if (selectMenu == 4) {
				System.out.println();
				System.out.print("��ȣ: ");
				int selectNumber = Integer.parseInt(scanner.nextLine());

				if (selectNumber <= 0 || selectNumber >= number) {
					System.out.println("���� �������� �ʽ��ϴ�.");
					System.out.println();
					continue;
				} else if (boardArray[selectNumber - 1][0] == null) {
					System.out.println("���� �������� �ʽ��ϴ�.");
					System.out.println();
					continue;
				} else
					System.out.println("��������: " + boardArray[selectNumber - 1][1]);
				System.out.print("��������: ");
				String editTitle = scanner.nextLine();
				if (!editTitle.equals("")) {
					boardArray[selectNumber - 1][1] = editTitle;
				}
				System.out.println("��������: " + boardArray[selectNumber - 1][2]);
				System.out.print("��������: ");
				String editContent = scanner.nextLine();
				if (!editContent.equals("")) {
					boardArray[selectNumber - 1][2] = editContent;
				}

			} else if (selectMenu == 5) {
				System.out.println();
				System.out.print("��ȣ: ");
				int selectNumber = Integer.parseInt(scanner.nextLine());

				if (selectNumber <= 0 || selectNumber >= number) {
					System.out.println("���� �������� �ʽ��ϴ�.");
					System.out.println();
					continue;
				} else if (boardArray[selectNumber - 1][0] == null) {
					System.out.println("���� �������� �ʽ��ϴ�.");
					System.out.println();
					continue;
				} else {
					for (int i = 0; i < 5; i++) {
						boardArray[selectNumber - 1][i] = null;
					}
					if(end == selectNumber - 1)
						end--;
					System.out.println("end@#@!#!@# : " + end);
				}

			} else if (selectMenu == 6) {
				break;
			} else {
				System.out.println();
				continue;
			}
			System.out.println();
			System.out.println("---------------------------------------------------------------------");
			System.out.println("   ��ȣ   |     ����     |          ����          |   �۾���   |   ��ȸ��   ");
			System.out.println("---------------------------------------------------------------------");

			for (int i = end ; i >= 0; i--) {
				if (boardArray[i][0] != null) {
					System.out.print("   "+ i +"    " + boardArray[i][0] + "   ");
					System.out.print("       " + boardArray[i][1] + "      ");
					System.out.print("          " + boardArray[i][2] + "     ");
					System.out.print("         " + boardArray[i][3] + "");
					System.out.println("      " + boardArray[i][4] + "   ");
				}
			}
			
//			for(int i = 0; i<)
			System.out.println();

		}

		System.out.println("���α׷� ����");

	}

}