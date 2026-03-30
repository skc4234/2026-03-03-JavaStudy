package com.sist.customer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
 *  1. equals
 *  2. split
 *  3. substring
 *  4. trim
 *  5. length
 *  6. indexOf
 *  7. valueOf
 *  
 *  검색 관련
 *  8. contains
 *  9. startsWith
 *  10. toUpperCase
 *  11. compare
 */
/*
 *  String
 *   - equals => 로그인 / 아이디 중복체크 / 비밀번호 / 상세보기
 *   - contains => 검색
 *   - length => 입력여부 확인
 *   - startsWith/EndsWith => 자동완성
 *      => 자음 검색?
 *   - 문자열 분리 1) split => String[]
 *              2) java.util 라이브러리 StringTokenizer
 *   - valueOf / toString : 데이터형을 문자열로
 *   - 데이터베이스 / 파일 => toUpperCase
 *   - 입력상에서 공백 찾기 : trim()
 *   - 문자위치 : indexOf / lastIndexOf
 *  
 *  Math
 *   - random() : 난수 발생(0.0~0.99)
 *   - ceil() : 올림, 페이징 기법에서 사용
 *  
 *  Object
 *   - toString() : 객체를 문자열로 변환
 *   - clone() : 객체 전체 복사 => call by value
 *   - finalize() : 소멸자
 *   - equals / hashCode
 *   - getClass
 * ==============================================
 *  - StringBuffer
 *  - StringBuilder
 *     => 문자열 결합 관련
 *  - Wrapper : 데이터형을 클래스화 => 문자열을 정수형/실수형/논리형 등으로 변환
 *     => AutoBoxing / UnBoxing
 *  - System
 * ==================================== java.lang
 * java.util, java.text, java.io, java.net, java.sql
 * 
 * 
 * 
 */

public class CustomerMainFrame extends JFrame implements ActionListener {
	CardLayout card=new CardLayout();
	Login login = new Login();
	CustomerDataCollection cdc = new CustomerDataCollection();
	CustomerList cList = new CustomerList();
	CustomerFind cFind = new CustomerFind();
	JMenuItem list = new JMenuItem("사원 목록");
	JMenuItem find = new JMenuItem("사원 검색");
	JMenuItem exit = new JMenuItem("종료");
	
	public CustomerMainFrame() {
		JMenu menu = new JMenu("메뉴");
		menu.add(list); menu.add(find); 
		menu.addSeparator(); // 구분자
		menu.add(exit);
		JMenuBar bar = new JMenuBar();
		bar.add(menu);
		setJMenuBar(bar);
		setLayout(card);
		add("cList", cList);
		add("cFind", cFind);
		setSize(950, 700);
		//setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // x버튼 누르면 종료
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		list.addActionListener(this);
		find.addActionListener(this);
		exit.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		} catch (Exception e) {
			// TODO: handle exception
		}
		new CustomerMainFrame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2) {
			JOptionPane.showMessageDialog(this, "프로그램 종료!!");
			System.exit(0);
		}
		else if(e.getSource()==login.b1) {
			// 로그인 버튼 클릭
			String id = login.tf.getText();
			if(id.trim().length()<1) { // trim() => 좌우 공백 제거 / length() : 문자 갯수
				JOptionPane.showMessageDialog(this, "아이디를 입력하시오!!");
				login.tf.setText("");
				login.tf.requestFocus();
				return; // 메소드 종료, 처음부터 다시 시작
				
			}
			String pwd = String.valueOf(login.pf.getPassword()); // char[] => valueOf/toString => 문자열로 변환 
			if(pwd.trim().length()<1) { // trim() => 좌우 공백 제거 / length() : 문자 갯수
				JOptionPane.showMessageDialog(this, "비밀번호를 입력하시오!!");
				login.pf.setText("");
				login.pf.requestFocus();
				return; // 메소드 종료, 처음부터 다시 시작
				
			}
			
			// 로그인 처리
			String res = cdc.isLogin(id, pwd);
			if(res.equals("NO_ID")) {
				JOptionPane.showMessageDialog(this, "아이디가 존재하지 않습니다...");
				login.tf.setText("");
				login.pf.setText("");
				login.tf.requestFocus();
			}
			else if(res.equals("NO_PWD")) {
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다...");
				login.pf.setText("");
				login.pf.requestFocus();
				
			}
			else {
				// OK|홍길동
				String name = res.substring(res.indexOf("|")+1);
				JOptionPane.showMessageDialog(this, "로그인 성공!!");
				
				
				login.setVisible(false);
				setTitle(name + " 님 로그인 되었습니다!");
				setVisible(true);
			}
			
		}
		else if(e.getSource()==list) {
			card.show(getContentPane(), "cList");
		}

		else if(e.getSource()==find) {
			card.show(getContentPane(), "cFind");
		}

		else if(e.getSource()==exit) {
			dispose(); // 매모리 해제
			System.exit(0);
		}
	}

}
