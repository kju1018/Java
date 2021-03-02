package ch15.exam06;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Example1 {

	public static void main(String[] args) {

		TreeSet<String> set = new TreeSet<String>();
		// Set<String> set = new TreeSet<String>(); �� ���� ������
		// �˻� ��ɰ� ���õ� �޼ҵ尡 TreeSet�� ���ǵǾ����� �׷���
		// TreeSet���� ������ ����

		set.add("ȫ�浿");
		set.add("���ڹ�");
		set.add("�浹��");
		set.add("�ڱ��");

		for (String item : set) {
			System.out.println(item);
		}
		// ����Ǵ� ���� ��Ҹ� �� �׷��� �������� ������ ��
		// ���ʺ��� �о� ��
		// �ڵ����� ����

		System.out.println();

		NavigableSet<String> nset = set.descendingSet();
		for (String item : nset) {
			System.out.println(item);
		}

		System.out.println();

		NavigableSet<String> sset = set.subSet("��", false, "�浹��", false);
		for (String item : sset) {
			System.out.println(item);
		}
		System.out.println();

		NavigableSet<String> sset3 = set.tailSet("��", false);
		for (String item : sset3) {
			System.out.println(item);
		}

	}

}
