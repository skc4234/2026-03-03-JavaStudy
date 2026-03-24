package com.sist.user;

import javax.swing.*;
import com.sist.back.*;
import com.sist.commons.ImageChange;
import com.sist.vo.*;
import java.awt.*;
import java.net.URL;

import javax.swing.table.*;

public class MusicList extends JPanel {
	JLabel titleLa = new JLabel("지니뮤직 Top 50", JLabel.CENTER);
	JTable table; // 테이블 모양
	DefaultTableModel model; // 테이블 데이터 관리
	JComboBox box = new JComboBox();
	JTextField tf;
	JButton findBtn;
	
	public MusicList() {
		setLayout(null); // 직접 배치
		titleLa.setBounds(10, 15, 980, 60);
		titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 35));
		add(titleLa);
		
		box.addItem("제목");
		box.addItem("가수명");
		box.addItem("앨범명");
		tf = new JTextField();
		findBtn = new JButton("검색");
		
		box.setBounds(620, 85, 80, 25);
		tf.setBounds(705, 85, 200, 25);
		findBtn.setBounds(910, 85, 80, 25);
		
		add(box);
		add(tf);
		add(findBtn);
		
        //                         이미지		
		String[] col = {"순위","등폭","","곡명", "가수명"};
		Object[][] row = new Object[0][5];
		model = new DefaultTableModel(row, col);
		table = new JTable(model);
		
		table.setRowHeight(40);
		
		
		JScrollPane js = new JScrollPane(table);
		js.setBounds(10, 120, 980, 580);
		dataPrint();
		add(js);
	}
	
	public void dataPrint() {
		CommonsMusic cm = new GenieMusic();
		cm.init();
		for(Music m : cm.musics) {
			String s = "";
			if(m.getState().equals("유지")) {
				s="-";
			}
			else if(m.getState().equals("상승")) {
				s = "▲"+m.getIncrement();
			}
			else if(m.getState().equals("하강")) {
				s = "▼"+m.getIncrement();
			}
			Image img = null;
			try {
				URL url = new URL("https:" + m.getPoster());
				img = ImageChange.getImage(new ImageIcon(url),30,30);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			Object[] data = {
				m.getMno(),
				s,
				new ImageIcon(img),
				m.getTitle(),
				m.getSinger()
			};
			model.addRow(data);
		}
	}
}
