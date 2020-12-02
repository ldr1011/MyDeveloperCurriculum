package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MainFrame01 extends JFrame implements ActionListener{
	//생성자
	public MainFrame01(String title) {
		super(title);
		setLayout(new BorderLayout());
		JButton btn=new JButton("알림");
		btn.addActionListener(this);
		
		add(btn, BorderLayout.NORTH);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(this, "알림입니다.");
		try {
			System.out.println("10초 가 걸리는 작업중");
			Thread.sleep(10000);
			System.out.println("10초가 걸리는 작업이끝남");
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		System.out.println("actionPerformed() 메소드가 리턴합니다.");
	}
	public static void main(String[] args) {
		MainFrame01 f=new MainFrame01("메인 프레임01");
		f.setBounds(100, 100, 500, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
}
