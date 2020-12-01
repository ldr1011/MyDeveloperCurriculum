package test.main;

import test.mypac.Phone;

public class MainClass08 {

	public static void main(String[] args) {
		System.out.println("main 메소드가 시작됩니다.");
		
		Phone p1=null;
		Phone p2=new Phone();
		MainClass08.usePhone(p1);
		
		System.out.println("main 메소드가 종료됩니다.");
	}
	
	public static void usePhone(Phone p) {
		//여기에서 NullPointerException 을방지하는 방법이 있을까요?
		p.call();
	}
}
