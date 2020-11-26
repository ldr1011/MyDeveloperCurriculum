package test.main;

import test.mypac.House;

public class MainClass02 {
	public static void main(String[] args) {
		//House 클래스를 이용해서 여러분들이 집에서 편한하게 3번 쉬어보세요
		House a=new House();
		a.relax("이동렬");
		a.relax("이동렬");
		a.relax("이동렬");
		//집에서 100번 쉬어 보세요.
	    for(int i=0; i<100; i++) {
	    a.relax("내가 자는중 100번");
	    }
	}
}
