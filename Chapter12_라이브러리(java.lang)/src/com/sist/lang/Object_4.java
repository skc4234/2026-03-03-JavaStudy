package com.sist.lang;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

// toString() 활용

public class Object_4 extends JFrame implements ItemListener {
	JComboBox box = new JComboBox();
	JLabel label = new JLabel("", JLabel.CENTER);
	public Object_4() {
		box.addItem("홍길동"); // String => Object
		box.addItem("심청이");
		box.addItem("박문수");
		add("North", box);
		add("Center", label);
		setSize(300, 350);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		box.addItemListener(this);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Object_4();
	}



	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==box) {
			String name = box.getSelectedItem().toString(); // 리턴형이 Object => toString()으로 문자열변환
			// 윈도우에서 Object를 리턴하기 때문에 자주 사용
			label.setText(name);
		}
	}

}
