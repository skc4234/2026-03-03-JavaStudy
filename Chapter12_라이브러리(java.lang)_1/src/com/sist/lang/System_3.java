package com.sist.lang;
/*
 * 
 *  - 멀티미디어(스트리밍 서버)
 *  - 화상채팅
 * 
 *  네트워크 : 자바(속도가 느림) => 인트라넷(사내 메시지)
 *  흐름(Client / Server)
 *   => 웹
 *   객체 메모리 해제
 *   클래스 ----- 객체생성 ----- 객체활용 ----- 객체 null ------ GC호출
 * 
 */
class Sawon {
	public void print() {
		System.out.println("사원 정보 출력");
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 소멸");
	}
	
}
public class System_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon s = new Sawon();
		s.print();
		s=null; 
		System.gc();
	}

}
