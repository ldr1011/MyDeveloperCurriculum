package test.main;

public class StudyMain02 {
	public static void main(String[] args) {
		System.out.println("Study Main 메소드가 시작되었습니다.");
	int num1=10;
	int num2;
	num2=20;
	//인트 타입 선언만 하고 값을 주지않으면 0이 들어감
	
	/*
	 * 정수 표현 가능 범위 순서
	 * byte < short < int < long
	 */
	int myInt=100;
	byte myByte=100;
	int a=myInt;
	int b=myByte;
	
	byte c=(byte)myInt;
	//괄호안에 타입을 명시적지정 캐스팅을 강제로시킴
	myInt=200;
	
	byte d=(byte)myInt;
	}
}
