package ch11.exam07;

public class Example {

	public static void main(String[] args) {
		
		int var1 = 10;
		Integer var2 = new Integer(10);
		Integer var3 = 10; // Auto Boxing
		
		double var4 = 3.5;
		Double var5 = new Double(3.5);//Double이라는 객체의 번지가 들어감
		Double var6 = 3.5;
		//값인데 어떻게 참조변수에 들어가냐?
		//중간에 3.5가 들어간 객체를 만들어줌
		//Auto Boxing
		
		Integer var7 = new Integer(10);
		int var8 = var7.intValue();
		//var7의 10을 꺼내서  var8에 넣음
		int var9 = var7; // Auto UnBoxing
		//자동으로 값이 풀리고 들어간다
		
		Double var10 = new Double(3.5);
		double var11 = var10.doubleValue();// 원래 얻는 방식
		//3.5를 빼서 var11에 저장 정석방법
		double var12 = var10; // Auto UnBoxing
		//자동으로 박싱이 풀림
		//포장클래스만 이렇다.
		
		Object[] arr = new Object[5];
		arr[0] = "abc";
		arr[1] = 10; //10은 객체가 아니지만 된다
		//그냥 들어가는게 아님 -> new Integer(10)이런식으로 만들어져서
		//번지가 들어가는것이다.
		//Auto Boxing
		
		arr[2] = true;
		//true도 객체가 아님 중간에 new Boolean(true)가 생략됐다고 봐야함
		//Auto Boxing
	}

}
