package test.main;

import test.mypac.Drill;

public class MainClass05 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			
			@Override
			public void hole() {
				System.out.println("바닥에 구멍을 3개만듦");
			}
		});
		Drill h=new Drill() {
			
			@Override
			public void hole() {
			System.out.println("구멍만듦");
			}
		};
		useDrill(h);
		useDrill(()->{
			System.out.println("홀인원");
		});
		Drill d1=()->{
			System.out.println("아무대나 구멍만듦");
		};
		useDrill(d1);
	}

	public static void useDrill(Drill d) {
		d.hole();
	}
}
