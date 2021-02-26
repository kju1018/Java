package ch11.exam07;

public class Example2 {

	public static void main(String[] args) {
		
		int var1 = Integer.parseInt("3");
		double var2 = Double.parseDouble("3.5");
		
		Integer var4 = new Integer(3);
		Integer var5 = new Integer("3");
		//둘 다 같음 
		//내부적으로 "3"에 Integer.pareInt("3")이 동작함
		Integer var6 = 3;
		//요즘에는 이런식으로 사용
		
	}

}
