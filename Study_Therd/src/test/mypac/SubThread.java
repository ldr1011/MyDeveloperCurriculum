package test.mypac;

/*
 *  새로운 작업단위(스레드) 만드는 방법
 *  
 *  1. Thread 클래스를 상속받는 클래스를 정의한다.
 *  2. run() 메소드를 오버라이드 한다.
 *  3. 해당클래스로 객체를 생성한다
 *  4. 생성한 객체의 start() 메소드를 호출하면 run() 메소드가 호출되면서
 *  	새로운 작업단위(스레드)가 시작된다.
 *  	새로운 작업단위에서 할 작업은 run() 메소드 안에 코딩하면 됩니다.
 */
public class SubThread extends Thread {
	@Override
	public void run() {
		try {
			System.out.println("10초 가 걸리는 작업중");
			Thread.sleep(10000);
			System.out.println("10초가 걸리는 작업이끝남");
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
	}

}
