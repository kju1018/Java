package ch15.exam06;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		// Set<String> set = new TreeSet<String>(); 도 가능 하지만
		// 검색 기능과 관련된 메소드가 TreeSet에 정의되어있음 그래서
		// TreeSet으로 변수를 선언

		set.add("홍길동");
		set.add("감자바");
		set.add("방돌이");
		set.add("박길순");

		for (String item : set) {
			System.out.println(item);
		}
		// 저장되는 순간 대소를 비교 그래서 오름차순 정렬이 됨
		// 왼쪽부터 읽어 옴
		// 자동으로 정렬

		System.out.println();

		NavigableSet<String> nset = set.descendingSet();
		for (String item : nset) {
			System.out.println(item);
		}

		System.out.println();

		NavigableSet<String> sset = set.subSet("가", false, "방돌이", false);
		for (String item : sset) {
			System.out.println(item);
		}
		System.out.println();

		NavigableSet<String> sset3 = set.tailSet("가", false);
		for (String item : sset3) {
			System.out.println(item);
		}

	}

}
