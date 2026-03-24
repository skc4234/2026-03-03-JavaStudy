package com.sist.main;
/*
 *  1. 수정 / 추가 => 오버라이딩 / 오버로딩
 *   - 오버라이딩은 메소드 동일
 *   - 오버로딩은 매개변수의 갯수, 데이터형이 다른 메소드 => 리턴형, 접근지정어는 관계없음
 *   
 *   - final은 상수에서 사용 => 클래스와 메소드에 붙이면 상속과 오버라이딩이 안됨
 *   - static / private / protected / public
 *      => 클래스 영역 안에서만(메소드 x) 사용 가능
 *      지역변수, 클래스 => final
 *   - final => 데이터베이스 주소 / 네트워크 서버 주소 / Port번호 / Username, Password
 *      => 변수명은 대문자로만
 *  2. 형변환(p306)
 *      => 상속/포함 관계일때만 클래스 크기 비교 가능 => 형변환 가능
 *      -상속
 *        - 상속 내린 클래스(Super)
 *        - 상속 받은 클래스(Sub)
 *        => Sub > Super
 *      -포함
 *         - 포함있는 클래스(A)
 *         - 포함되는 클래스(B)
 *         => A > B
 *      - 자동 형변환(UpCasting)
 *         => 상속 내린 클래스 = 상속 받은 클래스  - Super s = new Sub();
 *         => 포함있는 클래스 = 포함되는 클래스    - A a = new B();
 *      - 강제 형변환(DownCasting)
 *         => Sub s = new Super()
 *            --------------------오류 => Sub s = (Sub)new Super();
 *            							 B b = (B)new A();
 *      
 * 
 * 
 */
class A {
	
}

class B extends A {
	void disp() {}
}

class C extends A {
	
}

class D extends A {
	
}
public class 다형성_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
		B b = (B)new A();
		
		// 상속 => 재사용, 관련된 클래스를 모아서 관리
		a = new C();
		a = new D();
		
	}

}
