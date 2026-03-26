/*
 *   면접 => 무중단 프로그램 짜는법? => nginix?
 *   java 1.8 => sun이 만든 마지막 버전 => 호환성이 좋음 => 실무
 *   최신버전 java 9.0?
 *   
 *   
 *           추상클래스 vs *인터페이스
 *   다중상속     x           o
 *   구성요소  변수, 메소드   상수, 추상메소드, default 메소드
 *   		 추상메소드
 *   키워드    extends    implements
 *    구현할 메소드가 많으면 추상클래스 사용
 *   
 *   
 *   Spring은 클래스 관리자 => 인터페이스
 */
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

import javax.swing.*;

interface Rand {
	public void rand(int[] com);
}

// 다중 상속 => 인터페이스
public class 숫자야구게임 extends JFrame implements ActionListener, Rand {
	// 힌트
	JTextArea ta = new JTextArea();
	JTextField tf = new JTextField(12);
	JButton start = new JButton("시작");
	JButton end = new JButton("종료");
	
	// 게임에 필요한 변수
	private int[] com = new int[3];
	private int[] user = new int[3]; 
	private int s,b;
	
	// 화면 UI
	public 숫자야구게임() {
		JScrollPane js = new JScrollPane(ta); // 스크롤바		
		JPanel p = new JPanel();
		p.add(tf);
		p.add(start);
		p.add(end);
		
		ta.setEditable(false); // TextArea 편집 방지
		tf.setEnabled(false); // 비활성화
		start.addActionListener(this); // actionPerformed 메소드의 위치
		end.addActionListener(this);
		tf.addActionListener(this);
		
		
		add("Center", js);
		add("South", p);
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 숫자야구게임();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==end) {
			JOptionPane.showMessageDialog(this, "프로그램 종료!!");
			System.exit(0); // 0은 정상종료 1은 비정상 종료
		}
		
		else if(e.getSource()==start) {
			JOptionPane.showMessageDialog(this, "야구게임 시작!!");
			ta.setText("");
			rand(com); // call by reference => 객체/배열은 주소에 값 저장 => 자체 처리
			tf.setEnabled(true);
			tf.requestFocus();
			start.setEnabled(false);
			
		}
		else if(e.getSource()==tf) {
			// 입력 값 읽기
			String strInput = tf.getText();
			int input=0;
			try {
				input = Integer.parseInt(strInput);
			} catch (NumberFormatException ex) {
				// TODO: handle exception
				JOptionPane.showMessageDialog(this, "정수만 입력하시오!!"); // this => 어느 윈도우에 띄울건지


				tf.setText("");
				tf.requestFocus();
				return; // 메소드는 return 시 종료
			}
			
			// 정상적으로 입력이 되었다면
			if(input<100 || input >999) {
				JOptionPane.showMessageDialog(this, "세자리 정수를 입력하시오!!");

				tf.setText("");
				tf.requestFocus();
			}
			
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			
			// 중복된 숫자 불가
			if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2]) {

				JOptionPane.showMessageDialog(this, "중복된 숫자 입력금지!!");

				tf.setText("");
				tf.requestFocus();
			}
			
			// 0을 입력하면 안됨
			if(user[0] == 0 || user[1] == 0 || user[2] == 0) {
				JOptionPane.showMessageDialog(this, "0이 들어가면 안됩니다!!");

				tf.setText("");
				tf.requestFocus();
			}
			
			//비교
			s=0;
			b=0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(com[i] == user[j]) {
						if(i==j) // 같은 자리
							s++;
						else
							b++;
					}
				}
			}
			
			//힌트
			String hint = String.format("Input Number : %d\nS : %d, B : %d\n", input,s,b); // printf 대체
			ta.append(hint);
			
			if(s==3) {
				JOptionPane.showMessageDialog(this, "정답입니다!!");
				tf.setEnabled(false);
				start.setEnabled(true);
				
				//System.exit(0);
			}
			
			tf.setText("");
			tf.requestFocus();
		}
	}
	@Override
	public void rand(int[] com) {
		// TODO Auto-generated method stub
		for(int i=0; i<3; i++) {
			com[i] = (int)(Math.random()*8)+1;
			//System.out.println(Arrays.toString(com));
			for(int j=0; j<i; j++) {
				if(com[i] == com[j]) {
					i--;
					break;
				}
			}
		}
	}

}
