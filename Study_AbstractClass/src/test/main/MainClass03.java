package test.main;

import test.mypac.Longsword;
import test.mypac.Weapon;

public class MainClass03 {
	//Inner Class(내부 클래스에 한해서 필요하다면 static 예약어를 붙일수있다)
	static class AirPlane extends Weapon{

		@Override
		public void attack() {
		System.out.println("Air Attack 데미지2");
		}
		
	}
	
	public static void main(String[] args) {
		//Local Inner Class
		class Sword extends Weapon{

			@Override
			public void attack() {
				System.out.println("칼로 공격");
			}
			
		}
		//sword 객체를 생성해서 참조값을 Weapon type 으로 받기 
		// local inner class
		Weapon w1=new Sword();
		useWeapon(w1);
		//AirPlane 객체를 생성해서 참조값을 Weapon type 으로 받기
		// inner class
		Weapon w2=new AirPlane();
		useWeapon(w2);
		//Longsword 객체를 생성해서 참조값을 Weapon type 으로 받기
		// external class
		Weapon w3=new Longsword();
		useWeapon(w3);
	}
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		
	}
}
