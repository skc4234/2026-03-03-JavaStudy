package com.sist.clienet;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.*;
import javax.swing.table.*;

import com.sist.commons.Function;
public class ClientMainForm extends JFrame implements ActionListener, Runnable {
    JTextArea ta;
    JTextField tf;
    JTable table;
    DefaultTableModel model;
    JButton b1,b2,b3;
    LoginForm login = new LoginForm();
    // 서버와 연결하는 클래스
    Socket s; // 전화기 => 전화걸면 서버와 연결 => 서버 전화번호(IP) ,전화선(PORT)
    /*
     *  서버는 클라이언트 정보를 가지고 있어야함(각 클라이언트의 IP, PORT)
     *        |                ^
     *        |                |
     *   OutputStream   BufferedReader
     *        |                |
     *   BufferedReader   OutputStream
     *        |                |
     *        V                |
     *  클라이언트는 서버 정보를 가지고 있어야함(서버 IP, 서버 PORT)
     */
    OutputStream out; // 서버로 요청값 보내기
    BufferedReader in; // 서버에서 응답한 값 받기
	
    public ClientMainForm() {
    	ta = new JTextArea();
    	JScrollPane js1 = new JScrollPane(ta);
    	ta.setEditable(false);
    	
    	tf = new JTextField();
    	
    	b1 = new JButton("쪽지 보내기");
    	b2 = new JButton("정보 보기");
    	b3 = new JButton("나가기");
    	
    	String[] col = {"아이디", "이름", "성별"};
    	String[][] row = new String[0][3];
    	// 한번만 사용 => 재사용x
    	model = new DefaultTableModel(row, col) {// 익명 클래스 : 윈도우, 빅데이터 등

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			} 
    		
    	};
    	
    	table = new JTable(model);
    	JScrollPane js2 = new JScrollPane(table);
    	
    
    	// 배치
    	setLayout(null);
    	js1.setBounds(10, 15, 500, 450);
    	tf.setBounds(10, 470, 500, 30);
    	js2.setBounds(515, 15, 250, 300);
    	JPanel p = new JPanel();
    	p.setLayout(new GridLayout(3, 1, 5, 5));
    	p.add(b1); p.add(b2); p.add(b3);
    	p.setBounds(515, 320, 250, 130);
    	
    	// 윈도우에 추가
    	add(js1); add(tf);
    	add(js2); add(p);
    	
    	setBounds(550, 200, 790, 550);
    	//setVisible(true);
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
    	// 이벤트 => 서버로 값 전송
    	login.b1.addActionListener(this);
    	login.b2.addActionListener(this);
    	
    	tf.addActionListener(this); // 채팅
    	b3.addActionListener(this); // 나가기
    
    }
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		} catch (Exception e) {
			// TODO: handle exception
		}
		new ClientMainForm();
	}
	
	// 서버와 연결 + 로그인 처리
	public void connect(String id, String name, String sex) {
		try {
			//s = new Socket("192.168.0.33", 3000); // 서버정보
			s = new Socket("localhost", 3000);
			out = s.getOutputStream(); // 클라이언트가 읽어가는 위치
			in = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out.write((Function.LOGIN + "|" + id + "|" + name + "|" + sex + "\n").getBytes());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// 통신 시작
		// 서버로부터 값 읽기 => Thread
		
		new Thread(this).start();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==login.b2) {
			dispose(); // 메모리 회수
			System.exit(0); // 프로그램 종료
		}
		else if(e.getSource()==login.b1) {
			// 로그인 요청
			String id = login.tf1.getText();
			String name = login.tf2.getText();
			String sex="";
			if(id.trim().length()<1) { // 입력이 안되었을때
				login.tf1.requestFocus();
				return;
			}
			if(name.trim().length()<1) { // 입력이 안되었을때
				login.tf2.requestFocus();
				return;
			}
			if(login.rb1.isSelected()) {
				sex="남자";
			}
			if(login.rb2.isSelected()) {
				sex="여자";
			}
			connect(id,name,sex);
		}
		else if(e.getSource()==tf) { // 채팅
			String msg = tf.getText();
			if(msg.trim().length()<1) { // 입력이 안된 상태
				tf.requestFocus();
				return;
			}
			// 전송
			try {
				out.write((Function.CHAT+"|"+msg+"\n").getBytes());
			} catch (Exception e2) {
				// TODO: handle exception
			}
			tf.setText("");
		}
		else if(e.getSource()==b3) {
			try {
				out.write((Function.EXIT+"\n").getBytes());
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}


	// 클라이언트에서 사용하는 쓰레드는 서버값만 읽어서 출력하는 역할
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while(true) {
				// 서버값 읽기
				String msg = in.readLine();
				StringTokenizer st = new StringTokenizer(msg, "|");
				int protocol = Integer.parseInt(st.nextToken());
				switch(protocol) {
				case Function.LOGIN-> {
					String[] data = {st.nextToken(), st.nextToken(), st.nextToken()};
					model.addRow(data);
				}
				case Function.MYLOG-> {
					String name = st.nextToken();
					login.setVisible(false);
					setVisible(true);
					setTitle(name + " 님 반갑습니다");
				}
				case Function.CHAT-> {
					ta.append(st.nextToken()+"\n");
				}
				case Function.MYEXIT-> {
					dispose();
					System.exit(0);
				}
				case Function.EXIT-> {
					// 남아있는 사람 -> 나간사람 테이블에서 삭제
					String mid = st.nextToken();
					for(int i=0; i<model.getRowCount(); i++) {
						String id = model.getValueAt(i, 0).toString();
						if(mid.equals(id)) {
							model.removeRow(i);
							break;
						}
					}
				}
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
