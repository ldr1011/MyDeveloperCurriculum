package test.main;

import test.mart.Computer;
import test.mart.Cpu;
import test.mart.HardDisk;
import test.mart.Memory;

public class StudyMain09 {
	public static void main(String[] args) {
		/*
		 * [ 프로그래밍의 목적]
		 * 
		 * 1. 게임을 한다
		 * 2. oli999@naver.com 으로 이메일을 보낸다.
		 * 
		 */
		Cpu cpu1=new Cpu();
		HardDisk hd1=new HardDisk();
		Memory me1=new Memory();
		Computer com1=new Computer(cpu1,me1,hd1);
		com1.playGame();
		com1.sendEmail("oli999@naver.com");
	}

}
