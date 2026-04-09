package com.sist.inner;
/*
 *  윈도우, 빅데이터, Spring AI
 * 1. 내부클래스 종류
 *    1. 멤버 클래스 : 공통으로 사용되는 변수/메소드가 있을 때
 *       => 네트워크(서버), 쓰레드(자원x => 윈도우에 있는 기능 바로 활용) 사용시 
 *    
 *    class MyWindow {
 *    	
 *    class Thread { // 내부 클래스
 *    
 *    	}
 *    }
 *    
 *    2. 익명 클래스
 *       => extends를 사용하지 않고 오버라이딩 할때
 *         
 *    3. 지역 클래스
 *       => 메소드 안에 클래스 정의 
 *       => 사용빈도 x
 *       
 *       class A {
 *    
 *       	public void display()
 * 
 *  멤버 클래스/익명 클래스  => 윈도우, UI
 * 
 * 2. 장점 : 다른 클래스와 연결해서 사용하기 쉽다
 * 
 *          => 코드의 복잡성을 줄일 수 있다  
 *    
 * 
 * 
 */
// 웹은 독립적 => 내부 클래스 사용 x
//1. 멤버 클래스
class Outer { // 서버
	private String name = "홍길동";  // 서버가 가지고 있는 변수 사용
	class Inner {  // 클라이언트
		private int a=10;
		public void print() {
			Outer out = new Outer();
			System.out.println("Inner:print() call | name : " + out.name);
		}
	}
	
	public void display() {
		Inner in = new Inner();
		in.print();
	}
	
}

// 2. static
class Outer2 {
	static class Inner {
		public void print() {
			System.out.println("static Inner : print() call...");
		}
	}
}

// 3. 익명 클래스 : 한번만 사용
class Outer3 {
	Inner in = new Inner() {
		public void print() {
			System.out.println("Outer3에서 Inner의 print메소드 오버라이딩...");
		}
	};
}

class Inner {
	public void print() {
		System.out.println("익명 클래스 Inner : print() call...");
	}
}


// 4. 지역 클래스
class Outer4 {
	public void print() { // 클래스 캡슐화
		class Inner {
			public void print() {
				System.out.println("지역 클래스 Inner : print() call...");
			}
		}
		Inner i = new Inner();
		i.print();
	}
}

public class 내부클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("==== 멤버 클래스 ====");
		Outer p = new Outer();
		p.display();
		
		System.out.println("==== static 클래스 ====");
		Outer2.Inner c1 = new Outer2.Inner();
		c1.print();
		
		System.out.println("==== 익명 클래스 ====");
		Inner i1 = new Inner();
		i1.print();
		Outer3 c3 = new Outer3();
		c3.in.print();
		
		System.out.println("==== 지역 클래스 ====");
		Outer4 c2 = new Outer4();
		c2.print();
		
	}

}
