package com.sist.thread;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Runnable_2 extends JFrame implements ActionListener{

	JProgressBar[] bar = new JProgressBar[5];
	JButton btn1, btn2;
	static int rank=0;
	static int p = 1;
	BarThread[] bt = new BarThread[5];
	public Runnable_2() {
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
	
	class BarThread extends Thread {
		int index;
		public BarThread(int index) {
			this.index = index;
		}
		public void run() {
			for(int i=0; i<=100; i++) {
				bar[index].setValue(i);
				int a=(int)(Math.random()*300);
				try {
					Thread.sleep(a);
				} catch (Exception e) {
					// TODO: handle exception
				}
				if(i==100) {
					rank++;
					if(rank==1) {
						setPriority(++p);
						System.out.println(p);
					}
					interrupt();
				}
			}
			System.out.println((index+1) + "번 : " + rank + "등");
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Runnable_2();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==btn1) {
			for(int i=0; i<5; i++) {
				bt[i] = new BarThread(i);
				bt[i].start();
			}
			rank=0;
			System.out.println("=====================");
		}
		if(e.getSource()==btn2) {
			System.exit(0);
		}
	}

}
