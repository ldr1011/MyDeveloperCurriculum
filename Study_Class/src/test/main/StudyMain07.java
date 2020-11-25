package test.main;

import test.mypac.MemberDto;

public class StudyMain07 {
	public static void main(String[] args) {
		//객체 생성과 동시에 필드에 저장할 값
		MemberDto dto1=new MemberDto(1, "김구라", "노량진");
		
		MemberDto dto2=new MemberDto();
		dto2.setNum(2);
		dto2.setName("해골");
		dto2.setAddr("행신동");
	}
}
