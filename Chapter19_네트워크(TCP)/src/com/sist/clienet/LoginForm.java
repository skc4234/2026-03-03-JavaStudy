package com.sist.clienet;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class LoginForm extends JFrame implements ActionListener {
	JLabel la1,la2,la3; // 아이디, 닉네임, 성별
	JTextField tf1, tf2; // 아이디, 닉네임 입력창
	JRadioButton rb1,rb2; // 성별(남자, 여자)
	JButton b1,b2;
	
	public LoginForm() {
		la1 = new JLabel("아이디");
		la2 = new JLabel("닉네임");
		la3 = new JLabel("성별");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		
		// 라디오버튼은 반드시 그룹핑
		rb1 = new JRadioButton("남자");
		rb2 = new JRadioButton("여자");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1); bg.add(rb2);
		rb1.setSelected(true); // 디폴트 설정
		
		b1 = new JButton("로그인"); // => 서버 연결
		b2 = new JButton("취소");
	    // =====초기화======
		
		// 배치
		setLayout(null); // 지정된 레이아웃 없이 직접 배치
		la1.setBounds(10, 15, 60, 30);
		tf1.setBounds(75, 15, 150, 30);
		la2.setBounds(10, 50, 60, 30);
		tf2.setBounds(75, 50, 150, 30);
		la3.setBounds(10, 85, 60, 30);
		rb1.setBounds(75, 85, 70, 30);
		rb2.setBounds(150, 85, 70, 30);
		JPanel p = new JPanel();
		p.add(b1); p.add(b2);
		p.setBounds(10, 120, 215, 35);
		
		// 추가
		add(la1); add(tf1);
		add(la2); add(tf2);
		add(la3); add(rb1); add(rb2);
		add(p);
		
		//setSize(250, 210);
		setBounds(800, 400, 250, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
//		b1.addActionListener(this);
//		b2.addActionListener(this);
	}
	
//	public static void main(String[] args) {
//		new LoginForm();
//	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
//		if(e.getSource()==b2) {
//			System.exit(0);
//		}
	}
}
