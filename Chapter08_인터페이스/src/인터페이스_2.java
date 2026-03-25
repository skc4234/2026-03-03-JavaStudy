import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 *  CheckedException          UncheckedException
 *     일반 예외                    실행 예외
 *      필수                         선택
 *   컴파일 시점(Compile Error)     실행 시점(Runtime Error)
 *    외부 환경                    사용자 입력값 오류, 개발자의 실수
 * 
 * 
 *      throw     vs    throws
 *  예외 고의 발생   /  예외 처리 위임
 */
// extends를 먼저 사용
public class 인터페이스_2 extends JFrame implements ActionListener {
	JButton north = new JButton("North");
	//JButton south = new JButton("South");
	JButton center = new JButton("Center");
	JButton east = new JButton("East");
	JButton west = new JButton("West");
	JTextField tf = new JTextField(); // 입력창
	
	
	
	public 인터페이스_2() {
		// 생성자 - 시작과 동시에 화면 UI
		add("North", north); // 윈도우에 추가
		//add("South", south);
		add("Center", center);
		add("East", east);
		add("West", west);
		add("South", tf);
		
		// 윈도우 크기
		setSize(350, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // X 누르면 종료
		
		// 버튼 액션 등록
		north.addActionListener(this); // 구현된 클래스 이름 사용
		//south.addActionListener(this);
		center.addActionListener(this);
		east.addActionListener(this);
		west.addActionListener(this);
		tf.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 인터페이스_2();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==north) {
			JOptionPane.showMessageDialog(this, "North Button Click...");
		}
//		if(e.getSource()==south) {
//			JOptionPane.showMessageDialog(this, "South Button Click...");
//		}
		else if(e.getSource()==center) { 
			JOptionPane.showMessageDialog(this, "Center Button Click...");
		}
		else if(e.getSource()==east) {
			JOptionPane.showMessageDialog(this, "East Button Click...");
		}
		else if(e.getSource()==west) {
			JOptionPane.showMessageDialog(this, "West Button Click...");
		}
		else if(e.getSource()==tf) {
			String msg = tf.getText();
			if(msg.length()<1) return;
			JOptionPane.showMessageDialog(this, msg);
		}
	}

}
