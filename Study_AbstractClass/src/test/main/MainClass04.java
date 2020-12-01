package test.main;

import test.mypac.Weapon;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 * Weapon 추상클래스를 상속받은 익명의 local inner클래스를 이용해서
		 * weapon type 의 참조값을 얻어내서 w1이라는 Weapon type 의 
		 * 지역변수에 담기
		 */
		Weapon w1=new Weapon() {
			
			@Override
			public void attack() {
			System.out.println("아무거나 공격해!!");
			}
		};
		useWeapon(w1);
		useWeapon(w1);
		
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
