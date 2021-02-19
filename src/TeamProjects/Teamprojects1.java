package TeamProjects;

import java.util.Scanner;

public class Teamprojects1 {

	public static void main(String[] args) {
		boolean run = true;
		String[][] boardArray = new String[100][5];
		// 모든 boardArray[0 ~ 99]까지는 생성 안에 내용은 null
		// boardArray[0 ~ 99] = null로 검사할시 number 이후는 null이 아님
		Scanner scanner = new Scanner(System.in);
		int number = 4;// 다음 번호
		int end = 2; // 배열 끝 위치

		for (int i = 0; i < 3; i++) {
			boardArray[i][0] = "" + (i + 1);
			boardArray[i][1] = "title" + (i + 1);
			boardArray[i][2] = "content" + (i + 1);
			boardArray[i][3] = "name" + (i + 1);
			boardArray[i][4] = "0";
		}

		while (run) {
			System.out.println("--------------------------------------------------------------------------");
			System.out.println("1.목록 | 2.생성(Create) | 3.읽기(Read) | 4.수정(Update) | 5.삭제(Delete) | 6.종료");
			System.out.println("--------------------------------------------------------------------------");
			System.out.print("메뉴선택> ");

			int selectMenu = Integer.parseInt(scanner.nextLine());

			if (selectMenu == 1) {

			} else if (selectMenu == 2) {

				System.out.print("제목: ");
				String title = scanner.nextLine();
				System.out.print("내용: ");
				String contents = scanner.nextLine();
				System.out.print("글쓴이: ");
				String name = scanner.nextLine();

				for (int i = 0; i < boardArray.length; i++) {
					if (boardArray[i][0] == null) {
						boardArray[i][0] = String.valueOf(number);
						boardArray[i][1] = title;
						boardArray[i][2] = contents;
						boardArray[i][3] = name;
						boardArray[i][4] = String.valueOf(0);
						if (i > end)
							end++;
						System.out.println(end);
						number++;
						break;
					}
				}
			} else if (selectMenu == 3) {
				System.out.print("번호: ");
				int selectNumber = Integer.parseInt(scanner.nextLine());

				for (int i = 0; i <= end; i++) {
					if (boardArray[i][0] != null) {
						if (Integer.parseInt(boardArray[i][0]) == selectNumber) {
							System.out.println();
							System.out.println("제목: " + boardArray[selectNumber - 1][1]);
							System.out.println("내용: " + boardArray[selectNumber - 1][2]);
							System.out.println("글쓴이: " + boardArray[selectNumber - 1][3]);

							int view = Integer.parseInt(boardArray[selectNumber - 1][4]) + 1;
							System.out.println("조회수: " + view);
							boardArray[selectNumber - 1][4] = String.valueOf(view);
							break;
						}
					}
				}
				System.out.println();
				continue;

			} else if (selectMenu == 4) {
				System.out.println();
				System.out.print("번호: ");
				int selectNumber = Integer.parseInt(scanner.nextLine());

				for (int i = 0; i <= end; i++) {
					if (boardArray[i][0] != null) {
						if (Integer.parseInt(boardArray[i][0]) == selectNumber) {
							System.out.println();
							System.out.println("기존제목: " + boardArray[selectNumber - 1][1]);
							System.out.print("수정제목: ");
							String editTitle = scanner.nextLine();
							if (!editTitle.equals("")) {
								boardArray[selectNumber - 1][1] = editTitle;
							}

							System.out.println("기존내용: " + boardArray[selectNumber - 1][2]);
							System.out.print("수정내용: ");
							String editContent = scanner.nextLine();
							if (!editContent.equals("")) {
								boardArray[selectNumber - 1][2] = editContent;
							}

							break;
						}
					}
					/* if (i == end) 해당 번호 글 없음 */
				}

			} else if (selectMenu == 5) {
				System.out.println();
				System.out.print("번호: ");
				int selectNumber = Integer.parseInt(scanner.nextLine());

				for (int i = 0; i <= end; i++) {
					System.out.println(i);
					if (boardArray[i][0] != null) {
						if (Integer.parseInt(boardArray[i][0]) == selectNumber) {
							for (int k = 0; k < 5; k++) {
								boardArray[i][k] = null;
							}
							if (end == i)
								end--;
							System.out.println("end@#@!#!@# : " + end);
							break;
						}
					}
				}

//		
			} else if (selectMenu == 6) {
				break;
			} else {
				System.out.println();
				continue;
			}
			System.out.println();
			System.out.println("---------------------------------------------------------------------");
			System.out.println("   번호   |     제목     |          내용          |   글쓴이   |   조회수   ");
			System.out.println("---------------------------------------------------------------------");

			String[][] temp = new String[end + 1][5];

			System.arraycopy(boardArray, 0, temp, 0, end + 1);
			for (int i = 0; i < end; i++) {
				for (int j = i; j <= end; j++) {
					if (boardArray[i][0] != null && boardArray[j][0] != null) {
						if (Integer.parseInt(boardArray[i][0]) > Integer.parseInt(boardArray[j][0])) {
							temp[i] = boardArray[j];
							temp[j] = boardArray[i];
						}
					}
				}    
			}
			for (int i = end; i >= 0; i--) {
				if (temp[i][0] != null) {
					System.out.print("      " + temp[i][0] + "   ");
					System.out.print("       " + temp[i][1] + "      ");
					System.out.print("          " + temp[i][2] + "     ");
					System.out.print("         " + temp[i][3] + "");
					System.out.println("      " + temp[i][4] + "   ");
				}
			}
			System.out.println("-------------원본---------");
			for (int i = end ; i >= 0; i--) {
				if (boardArray[i][0] != null) {
					System.out.print("   "+ i +"    " + boardArray[i][0] + "   ");
					System.out.print("       " + boardArray[i][1] + "      ");
					System.out.print("          " + boardArray[i][2] + "     ");
					System.out.print("         " + boardArray[i][3] + "");
					System.out.println("      " + boardArray[i][4] + "   ");
				}
			}

			System.out.println();

		}

		System.out.println("프로그램 종료");

	}

}
