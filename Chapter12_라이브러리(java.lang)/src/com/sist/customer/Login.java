package com.sist.customer;
import java.awt.*;
import javax.swing.*;
/*
 *   윈도우
 *    => *JFrame : 일반 윈도우
 *    => JWindow : 팝업창이 없음
 *    => *JPanel : 단독으로 사용할 수 없다 => 프레임과 결합
 *    => JDialog : 윈도우 위 팝업창(모달)
 *   
 *   
 *   컴포넌트
 *    => 버튼 종류
 *        - JButton
 *        - JCheckbox     토글 버튼
 *        - JRadioButton  토글 버튼
 *        - JMenu
 *    => 입력 종류
 *    	  - JTextField : 한 줄만 입력 가능 => ID / 이름 / 검색어
 *    	  - JTextArea : 여러줄 입력
 *    	  - JPasswordField : 비밀번호(암호화) 방식 텍스트필드
 *    => 목록출력 종류
 *        - *JTable : 
 *        - JTree :
 *        - JList :
 *    => 기타
 *        - JLabel : 기능없는 화면출력 => 입력 내용 / 이미지 등
 */
public class Login extends JFrame {
	JLabel la1, la2;
	JTextField tf;     // 일반 문자열 입력창
	JPasswordField pf; // 비밀번호 입력창(암호화)
	JButton b1,b2;     // b1 : 로그인 , b2 : 취소
	
	// 시작과 동시에 출력(UI) => 생성자
	public Login() {
		// 레이아웃 - 화면 배치
		setLayout(null); // 직접 배치
		la1 = new JLabel("아이디");
		la2 = new JLabel("비밀번호");
		tf = new JTextField();
		pf = new JPasswordField();
		b1 = new JButton("로그인");
		b2 = new JButton("취소");
		
		// 배치
		la1.setBounds(10, 15, 80, 30);
		tf.setBounds(95, 15, 150, 30);
		
		la2.setBounds(10, 50, 80, 30);
		pf.setBounds(95, 50, 150, 30);
		
		add(la1); add(tf); add(la2); add(pf);
		
		JPanel p = new JPanel();
		p.add(b1); p.add(b2);
		p.setBounds(10,90,235,35);
		add(p);
		
		//setSize(265, 175);
		setBounds(800,400,265,175);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

}
