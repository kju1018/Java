package ch12.exam01;

public class MusicTask implements Runnable {//Runnable로 사용가능한 객체

	@Override
	public void run() {
		while(true) {
			System.out.println("뮤직을 연주 합니다.");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}

	}

}
