package test.main;

import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass11 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		Object p1=new SmartPhone();
		Phone p2=new SmartPhone();
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
