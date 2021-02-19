package ch05;

public class Exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+',');
		}
		
		System.out.println();
		
		for(int value : arr) {
			System.out.println(value+',');
		}
	}

}