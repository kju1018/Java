package ch06.exam16.pack1;

public class Car {
	//클래스는 private에 못 붙힌다.
	
	//Field
	public String model;
	
	//Constructor
	public Car(){
		
	}//아무것도 안적으면 자동으로 public를 붙여서 생성
	
	//Method
	public void run() {
		System.out.println("달립니다.");
	}
}
