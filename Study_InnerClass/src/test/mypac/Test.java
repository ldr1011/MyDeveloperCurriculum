package test.mypac;
/*
 *  클래스 안에 정의 할수 있는 멤버?
 *  1. 생성자
 *  2. 필드
 *  3. 메소드
 *  4. 클래스
 */
public class Test {
	//클래스 안에 정의하는 클래스는 Inner Class 라고한다.
	public class A{
		
	}
	public class B{
		
	}
	/*
	 *  메소드 안에 정의 할수 있는것? 
	 *  
	 *  1. 지역변수 (Local Variable)
	 *  2. 지역내부 클래스 (Local Inner Class)
	 */
	public void test1() {
		class C{
			public void merong( ) {
				System.out.println("복잡하지롱~");
			}
		}
		C a=new C();
		a.merong();
	}
}
