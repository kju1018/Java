package ch15.exam09;

import java.util.LinkedList;
import java.util.Queue;

public class Example2 {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("È«±æµ¿");
		queue.offer("È«±æ¼­");
		queue.offer("È«±æ³²");
		queue.offer("±èÀÚ¹Ù");

		while(!queue.isEmpty()) {
			String item = queue.poll();
			System.out.println(item);
		}
		
	}

}
