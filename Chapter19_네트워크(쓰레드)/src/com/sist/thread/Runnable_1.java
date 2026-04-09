package com.sist.thread;
/*
 * 
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Runnable_1 extends JFrame implements Runnable, ActionListener {
	JProgressBar[] bar = new JProgressBar[5];
	JButton btn1, btn2;
	public Runnable_1() {
		btn1 = new JButton("시작");
		btn2 = new JButton("종료");
		
		Color[] color = {Color.yellow, Color.orange, Color.green, Color.cyan, Color.pink};
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(5,1,5,5));
		for(int i=0;i<5;i++) {
			bar[i]=new JProgressBar();
			bar[i].setMaximum(100);
			bar[i].setMinimum(0);
			bar[i].setStringPainted(true); // 진행도 % 나옴
			bar[i].setBackground(Color.white);
			bar[i].setForeground(color[i]);
			p.add(bar[i]);
		}
		JPanel p1 = new JPanel();
		p1.add(btn1); p1.add(btn2);
		add("Center", p);
		add("South", p1);
		setSize(500, 450);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Runnable_1();
	}

	public void go() {
		try {
			int a = (int)Math.random()*101;
			for(int i=0;i<=a; i++) {
				bar[0].setValue(i);
				Thread.sleep(50);
			}
			int b = (int)Math.random()*101;
			for(int i=0;i<=b; i++) {
				bar[1].setValue(i);
				Thread.sleep(50);
			}
			int c = (int)Math.random()*101;
			for(int i=0;i<=c; i++) {
				bar[2].setValue(i);
				Thread.sleep(50);
			}
			int d = (int)Math.random()*101;
			for(int i=0;i<=d; i++) {
				bar[3].setValue(i);
				Thread.sleep(50);
			}
			int e = (int)Math.random()*101;
			for(int i=0;i<=e; i++) {
				bar[4].setValue(i);
				Thread.sleep(50);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		go();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn2) {
			System.exit(0);
		}
		if(e.getSource()==btn1) {
			new Thread(this).start();
		}
	}

}
