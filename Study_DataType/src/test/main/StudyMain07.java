package test.main;

public class StudyMain07 {
	public static void main(String[] args) {
		System.out.println("Study Main 메소드가 시작됨");
		String name="이동렬";
		// name 안에 들어 있는 참조값을 myName 이라는 새로운 변수에 대입
		String myName=name;
		// "공부중" 라는 String type 참조값을 name 에 덮어쓰기(새로대입)
		name="공부중";
		// String type 참조값이 들어 갈수 있는 지역변수 name 을 빈상태로 만들기 
		// null 은 참조 데이터 type 이 들어 갈수 있는 빈 공간을 의미한다. 
		name=null;
	}
}
