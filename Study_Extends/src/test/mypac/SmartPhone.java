package test.mypac;

// SmartPhone 클래스를 종단 클래스로 만드는 final 예약어
public final class SmartPhone extends HandPhone{
	//디폴트 생성자
	public SmartPhone() {
		System.out.println("SmartPhone() 생성자가 호출됨");
	}
	//인터넷 하는 메소드
	public void doInternet() {
		System.out.println("인터넷을 해요");
	}
	//이 메소드는 재정의한 메소드라고 표시해주는 어노테이션
	//특별한 기능을 하는것은 아니고 단지 재정의한 메소드라고 표시해주는 기능만있다.
	@Override
	public void takePicture() {
		// super 는 부모객체를 가르키는 예약어 이다.
		// 피 오버라이드 된 부모 메소드도 만일 호출하려면
		// 아래와 같이 호출하면된다.
		//super.takePicture();
		// 부모 메소드를 호출해야 하는지 아닌지는 그때 그때 클래스에 따라 다르므로
		// 학습을 해서 선택을 해야 한다.
		System.out.println("빛의3원소 rgb 밖에안나오는 사진");
	}
}
