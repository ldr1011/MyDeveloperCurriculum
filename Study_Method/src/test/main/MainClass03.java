package test.main;

import test.mypac.House;
import test.mypac.Myobject;

public class MainClass03 {
	public static void main(String[] args) {
		//MyObject 객체를 생성해서 참조값을 m1 이라는 이름의 지역변수에 대입해 보세요.
		Myobject m1=new Myobject();
		//m1 에 있는 참조값을 이용해서 House 객체의 참조값을 얻어와서 myhome 이라는
		//이름의 지역변수에 담아보세요.
		House myhome=m1.getHouse();
		// myHome 안에 있는 참조값을 이용해서 집에서 3번 쉬어보세요.
		myhome.relax("3");
		myhome.relax("2");
		myhome.relax("1");
		
	}
}
