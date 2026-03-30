package com.sist.customer;
import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.*;
public class CustomerList extends JPanel implements ActionListener {
	
	JLabel la1, la2;
	JTable table;
	DefaultTableModel model;
	JButton b1,b2;
	TableColumn column;
	// 데이터 제어
	int curpage=1; // 첫 페이지
	int totalpage=0;
	CustomerDataCollection cdc = new CustomerDataCollection();
	
	
	public CustomerList() {
		la1 = new JLabel("사원목록", JLabel.CENTER);
		la2 = new JLabel("0 page / 0 pages" , JLabel.CENTER);
		b1 = new JButton("이전");
		b2 = new JButton("다음");
		String[] col = {"아이디","이름","이메일","지역","등급"};
		String[][] row = new String[0][5];
		
		model = new DefaultTableModel(row,col) {
			// 익명 클래스 => 상속없이 오버라이딩이 가능하다 => 9장 내부클래스 => Thread / 네트워크 => 서버(웹서버)
			// 생성자 안에서 처리 => 오버라이딩+추가
			// 편집방지
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false; 
			}
			
			
		}; 

		table = new JTable(model);
		table.setRowHeight(40);
		table.getTableHeader().setReorderingAllowed(false);

		JScrollPane js = new JScrollPane(table);
		
		setLayout(null);
		la1.setFont(new Font("굴림체", Font.BOLD,50));
		la1.setBounds(10, 15, 920, 60);
		add(la1);
		js.setBounds(10, 80, 920, 500);
		add(js);
		
		JPanel p = new JPanel();
		p.add(b1); p.add(la2); p.add(b2);
		
		p.setBounds(10, 590, 920, 60);
		add(p);
		
		for(int i=0; i<col.length; i++) {
			column = table.getColumnModel().getColumn(i);
			if(i==0) column.setPreferredWidth(80);
			else if(i==1) column.setPreferredWidth(80);
			else if(i==2) column.setPreferredWidth(400);
			else if(i==3) column.setPreferredWidth(120);
			else if(i==4) column.setPreferredWidth(80);
		}
		print();
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	
	public void print() {
		// 테이블 지우기
		for(int i=model.getRowCount()-1; i>=0; i--) {
			model.removeRow(i);
		}
		
		// 값 가져오기
		CustomerVO[] cust = cdc.customerListData(curpage);
		totalpage = cdc.customerTotalPage();
		
		for(CustomerVO vo : cust) {
			String[] data = {
				vo.getCustomer_id(),
				vo.getName(),
				vo.getEmail(),
				vo.getLoc(),
				vo.getGrade()
			};
			model.addRow(data);
		}
		la2.setText(curpage + " page / " + totalpage + " pages");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			if(curpage>1) {
				curpage--;
				print();
			}
		}
		else if(e.getSource()==b2) {
			if(curpage<totalpage) {
				curpage++;
				print();
			}
		}
		
	}
	
}
