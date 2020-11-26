package test.main;

import test.mypac.House;
import test.mypac.Myobject;
import test.mypac.Phone;

public class MainClass05 {
	public static void main(String[] args) {
		Myobject.callPhone(new Phone());
		House myhome=Myobject.buyHouse();
	}
}
