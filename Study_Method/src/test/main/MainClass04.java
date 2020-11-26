package test.main;

import test.mypac.Myobject;
import test.mypac.Phone;

public class MainClass04 {
	public static void main(String[] args) {
		Myobject m=new Myobject();
		Phone p=new Phone();
		m.usePhone(p);
		System.out.println("--위와 동일 한 작업을 2줄의 코딩으로 한다면");
		Myobject m1=new Myobject();
		m1.usePhone(new Phone());
		System.out.println("- 위와 동일한 작업을 1줄의 코딩으로 한다면?");
		new Myobject().usePhone(new Phone());
	}
}
