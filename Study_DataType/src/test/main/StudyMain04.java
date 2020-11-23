package test.main;

public class StudyMain04 {
	public static void main(String[] args) {
		System.out.println("Sudy Main 메소드가 시작됨");
		//어머니 아버지 나의 나이
		int mage=56;
		int fage=58;
		int me=30;
		// 가족 나이합
		int sum=mage+fage+me;
		// 가족 평균 나이
		double ave=(double)sum/3;
		System.out.println("우리 가족 평균 나이는 "+ave +"입니다.");
	}
}
