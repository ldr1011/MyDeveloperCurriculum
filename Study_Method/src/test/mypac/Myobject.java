package test.mypac;
/*
 * 	[ 메소드를 만들때 고려해야 하는것]
 * 	1. 접근 지정자 ( public ,protected, default , private)
 *  2. static or non static
 *  3. 리턴 type (void 는 어떤 type 도 리턴하지 않는다는 의미)
 *  4. 메소드명 ( 영문자 소문자로 시작하고 예약어가 아니면 된다)
 *  5. 메소드에 전달하는 인자의 갯수와 데이터 type 
 */
public class Myobject {
	//어떤 값도 리턴하지 않는 메소드
	public void walk() {
		System.out.println("걸음을 걸어요~");
	}
	// int type 을 리턴하는 메소드 
	public int getNumber() {
		int num=10;
		return num;
	}
	//String type 을 리턴하는 메소드
	public String getGreeting() {
		String greet="안녕하세요";
		return greet;
	}
	//House type 을 리턴하는 메소드
	public House getHouse() {
		House h1=new House();
		return h1;
	}
	//phone type 을 전달 받는 메소드
	public void usePhone(Phone p) {
		p.call();
	}
	//Phone type 을 전달받는 static 메소드
	public static void callPhone(Phone p) {
		p.call();
	}
	//House type 을 리턴해주는 Static 메소드
	public static House buyHouse() {
		return new House();
	}
}
