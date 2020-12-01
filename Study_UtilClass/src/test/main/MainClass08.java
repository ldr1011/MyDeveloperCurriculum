package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass08 {
	public static <V> void main(String[] args) {
		/*
		 *  1. 3명의 회원 정보를 HashMap 객체를 3개 생성해서 각각 담아보세요.
		 *  	번호=>"num" 이라는 키값으로 정수 저장
		 *  	이름=>"name" 이라는 키값으로 문자열 저장
		 *  	주소=> "addr" 이라는 키값으로 문자열 저장
		 *  2. 위에서 생성한 Map 을 담을 ArrayList 객체를 생성하고 생성된 참조값을
		 *  	members 라는 이름의 지역변수에 담아보세요.
		 *  3. members 에 회원정보가 담긴 Map 객체의 참조값을 순서대로 담아보세요.
		 *  4. 반복문 돌면서 members 에 담긴 내용을 아래와 같은 형식으로 출력해보세요.
		 *  번호:1, 이름:김구라, 주소 : 노량진
		 *  .
		 *  .
		 */
		Map<String, Object> m1=new HashMap<String, Object>();
		m1.put("num", 1);
		m1.put("name", "이동렬");
		m1.put("addr", "구리");
		Map<String, Object> m2=new HashMap<String, Object>();
		m2.put("num", 2);
		m2.put("name", "강아지");
		m2.put("addr", "구리");
		Map<String, Object> m3=new HashMap<String, Object>();
		m3.put("num", 3);
		m3.put("name", "고양이");
		m3.put("addr", "구리");
		List<Map<String, Object>> members=new ArrayList<>();
		members.add(m1);
		members.add(m2);
		members.add(m3);
		for(int i=0; i<members.size(); i++) {
			Map q=members.get(i);
			System.out.println(" 번호: "+q.get("num")+
					" 이름: "+q.get("name")+
					" 주소: "+q.get("addr"));
		}
		for(Map<String, Object> tmp:members) {
			//번호
			int num=(int) tmp.get("num");
			String name=(String)tmp.get("name");
			String addr=(String)tmp.get("addr");
			System.out.println("번호: "+num+", 이름: "+name+", 주소: "+addr);
		}
		
		
	}
}