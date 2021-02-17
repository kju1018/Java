package ch05;

import java.util.Arrays;

public class Exam03 {

	public static void main(String[] args) {

		int[] scores1 = new int[] { 90, 85, 95 };
		int[] scores2 = new int[] { 90, 85, 95 };
		int[] scores3 = scores1;
		
		System.out.println(scores1 == scores2);
		System.out.println(scores1 == scores3);
	}

}
