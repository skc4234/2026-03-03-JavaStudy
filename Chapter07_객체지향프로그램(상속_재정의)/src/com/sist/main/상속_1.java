package com.sist.main;

import javax.swing.JFrame;

/*
 *  1. 상속
 *  	=> 기능을 그냥 사용하는 것
 *  	   -------------
 *         => 마음에 안들 경우 변경할 수 있다(오버라이딩)
 *  2. 상속을 사용하는 이유?
 *  	1) 코드 줄이기 => CV
 *  	2) 상속 받기 => extends
 *  	3) 상속 받으면 코드를 따라 할 필요가 없다
 *  		=> 내부적으로 메모리에 저장 => 코드가 이미 상속받은 클래스에 내장
 *  3. 오해하는 부분
 *  	상속하면 코드를 복사하는 것(x)
 *  	상속 내린 클래스와 연결이 되는 부분
 *  	 => 상속 내린 클래스를 변경하면 상속받는 클래스에 영향을 준다
 *            = super : 상위 클래스
 *            = this : 하위 클래스(상속받은)
 *  4. 상속 => 재사용 + 기능 추가
 *  		 ------
 *            변경
 *      상속은 메모리에 저장하고 사용이 가능하게 해줌 => 필요 시 고쳐서 사용
 *      	|                                         |
 *          -------------------------------------------
 *  	                   오버라이딩
 * 
 *  재사용하는 방법
 *  1. 상속(is-a) => 위로 올라갈수록 ~는 ~이다 관계 성립
 *  	A
 *  	|  ↑추상화          
 *  	B
 *  	|  ↓구체화
 *  	C
 *  클래스의 크기는 상속/포함 관계여야 크기를 비교할 수 있다
 *  class A extends JFrame {      : 상속 => 변경해서 사용
 *  	
 *  }
 *  class A {
 *  	JFrame f = new JFrame();  : 포함 => 있는 그대로 사용
 *  }
 *  2. 포함(has-a) => 가지고 있다
 * 
 *  => 메소드를 이용해서 연결
 */
public class 상속_1 /*extends JFrame*/ {
	// 윈도우를 변경해서 사용 => 오버라이딩
//	public 상속_1() {
//		this.setSize(800, 600);
//		//화면 띄우기
//		setVisible(true);
//	}
	JFrame f = new JFrame();
	public 상속_1() {
		f.setSize(600, 800);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new 상속_1(); // 생성자만 호출
	}

}
