package ch07.exam06.pack1;

import ch07.exam06.pack2.Child;

public class Example {

	public static void main(String[] args) {
		//Parent 객체도 자동으로 만들어짐
		Parent parent = new Parent();
		parent.field1 = 10;
		parent.parentMethod();
	
	}

}
