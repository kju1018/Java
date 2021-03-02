package ch11.exam01;

public class Example {
	public static void main(String[] args) {
		Member m1 = new Member("winter", "´Ê°Ü¿ï");
		Member m2 = new Member("spring", "´Ê°Ü¿ï");
		
		System.out.println(m1 == m2);
		System.out.println(m1.equals(m2));
		
		String a = "bbb";
		String b = a;
		String c = new String("aaa");
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(b == c);
		
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(c));
		System.out.println(b.compareTo(c));
	}
}
