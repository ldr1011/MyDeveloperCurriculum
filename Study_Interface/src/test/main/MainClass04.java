package test.main;

import test.mypac.Remocon;

public class MainClass04 {
	public static void main(String[] args) {
		Remocon r1=new Remocon() {
			
			@Override
			public void up() {
				System.out.println("리모콘을 TV위로올림");
			}
			
			@Override
			public void down() {
				System.out.println("리모콘을 TV밑으로내림");
			}
		};
		//r1 지역변수에 담긴값을 3번 사용해보기
		useRemocon(r1);
		useRemocon(r1);
		useRemocon(r1);
		//Remocon type 의 참조값을 한번만(일회성)으로 사용하기
		useRemocon(new Remocon() {
			
			@Override
			public void up() {
				System.out.println("창문 올려");
			}
			
			@Override
			public void down() {
				System.out.println("창문 내려");
			}
		});
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	
	}
}
