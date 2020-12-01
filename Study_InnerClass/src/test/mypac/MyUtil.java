package test.mypac;

public class MyUtil {
	private String owner="이동렬";
	
	private void test() {
		System.out.println("MyUtil 테스트 중입니다.");
	}
	/*
	 *  내부 클래스 안에서 바깥에 자신을 포함하고 있는 클래스의
	 *  멤버(필드, 메소드)는 자유롭게 자기꺼 처럼 접근해서 사용할 수 있다.
	 *  이런 편리함 때문에 android 프로그래밍 할때 종종 사용된다.
	 */
	public class User{
		public void dosomething() {
			//바깥에 자신을 포함하고 있는 객체의 참조값을 가르키는방법
			//바깥클래스명.this. 이다.
			System.out.println(MyUtil.this.owner);
			MyUtil.this.test();
			
			//User 클래스에 동일한 이름의 필드와 메소드가 없다면 MyUtil.this 생략가능
			System.out.println(owner);
			test();
			
			//아래의 type 을 확인해 보세요.
			MyUtil a=MyUtil.this;
			User b=this;
		}
	}
}
