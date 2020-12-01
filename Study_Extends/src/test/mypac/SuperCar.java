package test.mypac;

import test.auto.Car;
import test.auto.Engine;

public class SuperCar extends Car{
	//Engine type 을 전달받는 생성자
	public SuperCar(Engine engine) {
		//부모 생성자에 필요한 값을 전달해 주는 문법 super()
		super(engine);
	}
	//빨리 달리는 메소드
	public void driveFast() {
		if(this.engine==null) {
			System.out.println("Engine 이없어서 시동이 안걸림");
			return; //메소드 끝내기
		}
		System.out.println("시속 270");
	}
}
