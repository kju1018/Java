package ch06.exam08;

public class BoardService {
	//Field
	String[][] boards;
	
	//Constructor
	BoardService(int rows, int columns){
		boards = new String[rows][columns];
	}
	
	//Method
	void create (int bno, String title, String content, String name, int hitcount) {
		String[] board = {
				String.valueOf(bno), 
				title, 
				content, 
				name, 
				String.valueOf(hitcount)
		};
		for (int i = 0; i < boards.length; i++) {
			if(boards[i] ==null) {
				boards[i] = board;
				break;
			}
		}
	}
	void showList() {
		
	}
}
