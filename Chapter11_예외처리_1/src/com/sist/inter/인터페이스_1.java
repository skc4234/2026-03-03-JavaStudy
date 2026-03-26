package com.sist.inter;
/*
 * 기본
 *  => 클래스 : 설계 도구
 *  => 객체 : 실제로 만들어진 것 => 사용
 *  => 인스턴스 : 객체가 만들어질때 생기는 하나의 실체
 *             ---------------
 *             메모리에 저장된 상태
 *  클래스 ========> 메모리에 저장
 *        인스턴스화 ------------- 인스턴스
 *        						   |
 *        						A a => 객체
 *  ex) 스마트폰 설계 == 클래스 : 어떻게 만들지
 *       - 모델명
 *       - 색상
 *       - 저장용량
 *       - 카메라
 *     =========== 메모리에 저장 : 만든것
 *      색상 : 빨간색
 *      모델명 : s26
 *      저장용량 : 512gb
 *      카메라 : 12MP
 *     ============ 인스턴스
 *    스마트폰 구매=>사용
 *     ============= 객체  : 실제 사용
 *     
 *     
 *   1.  인터페이스           추상클래스
 *       |=> 개발자에게 맡김   |=> 일부만 개발자에게 맡김
 *       |=> 구현 가능
 *       
 *      윈도우 => 인터페이스 => 부품 업체(마우스/키보드 등)
 *              --------
 *     => 인터페이스는 추상클래스의 일종(미완성 클래스)
 *         => 직접 사용 불가 / 상속을 내려서 구현한 뒤에 사용
 *                             implements
 *     => 자바의 모든 상속은 단일상속
 *        다중상속을 추가하기 위해 인터페이스 기능 추가
 *        
 *     => 추상 클래스의 단점 보완
 *     
 *     추상클래스
 *      - 구현된 메소드 => 많음
 *      - 구현안된(abstract) 메소드 => 적음
 *         => 구현안된 메소드가 많으 면 인터페이스로
 *       
 *     - 윈도우
 *      => 버튼 / 마우스 / 키보드
 *      class A extends 버튼
 *      class B extends A
 *      class C extends 마우스
 *      class D extends C     <=== 추상클래스
 *      ...
 *      class E implements 버튼, 마우스, 키보드  <=== 인터페이스
 *              
 *    2. 역할
 *        - 서로 다른 클래스를 연결해서 사용 -> 결합성 낮게
 *        - 관련 클래스를 모아서 한개의 이름으로 제어 => 웹 / Spring
 *        - 설계와 관련 => 기능설계
 *        - 모든 개발자가 같은 메소드 구현 => 표준화
 *           => 소스 통일화
 *        - 요구사항 분석 => 기능
 *     --------------------------------------------
 *      => *표준화
 *        -------> Framework
 *                  Ajax Framework
 *                  React, Vue, Collection
 *      => 구성요소
 *          [접근지정어] interface 인터페이스명 {}
 *          ----------
 *          public / default만 가능        
 *          
 *          public [제어어] interface 인터페이스명
 *                 -------
 *                 public / default 
 *          {
 *          	------------------------------------
 *          	변수 : 상수만 가능
 *          		int a; => 오류, 초기화 반드시 필요
 *          	 => int a = 10; => (public static final) int a = 10;
 *                                     자동 추가
 *          	-----------------------------------
 *          	구현안된 메소드(abstract)
 *          	void display(); => {}이 없으면 구현안된 메소드
 *          	// (public abstract) void display(); 생략
 *          	-----------------------------------
 *          	구현된 메소드
 *          	  1.  (public) default void aaa() {}
 *          	  2.  (public) static void bbb() {}
 *          	-----------------------------------
 * 				        
 *          	=> 특별한 경우가 아니라면 구성요소 모두 public
 *          	=> 자체처리 시 private 메소드 가능
 *          }
 *          
 *          => new를 사용할 수 없다(가급적) => 구현안된 메소드를 전부 직접 구현해야 하기 때문에
 *          => 상속을 받아서 구현된 클래스 사용
 *          
 *          상속
 *           interface ============= interface
 *           		   확장 : extends
 *           
 *           *interface ================ class
 *           		   구현 : implements
 *           
 *           class ======= interface
 *                  Error
 *           => 인터페이스는 상위클래스
 *              
 *          class A
 *          class B extends A
 *          class C extends B => C(A,B) 단일상속
 *          
 *          interface A
 *          interface B extends A
 *          interface C extends B
 *          *interface C extends A,B => 다중상속
 *          
 *          interface A
 *          interface B
 *          class C implements A,B => 다중상속
 *          
 *          class A
 *          interface C
 *          interface D
 *          class B extends A implements C,D   => 윈도우에서 사용
 *                  --------- ---------------
 *                  상속 먼저    구현(다중상속)
 *                  
 *          => 인터페이스는 반드시 오버라이딩 되어야 한다
 *           - 오버라이딩
 *           	- 메소드명이 동일
 *           	- 상속 관계에서만 가능
 *           	- 매개변수, 리턴형 동일
 *           	- 기능 변경(modify)
 *           	- 접근지정어는 축소 불가 - public>protected>default>private
 *           => 인터페이스는 only public이기 때문에 public만 가능
 *           interface A {
 *           	void aaa();   => public
 *           }
 *           class B implements B {
 *           	void aaa() {} => default => 접근지정어 축소 오류
 *           }
 *           
 *           => 메소드는 기본적으로 public 사용 => 오버라이딩, 다른 클래스와 통신하기 위해
 *          
 *           클래스 ---|
 *           메소드 ---| 다른 클래스와 연결 => public  
 *           생성자 ---|
 *           
 *           변수 ----- 데이터 무결성을 위해 private => getter/setter로 접근 => 캡슐화  
 *           
 *           특별한 경우가 아니면 인터페이스는 거의 라이브러리
 *              
 */
interface 도형 {
	// public static final
	String COLOR = "black"; // 변경불가
	
	// 도형 그리기
	// abstract
	public void draw();
	/*
	 *  abstract public void draw(); // 접근지정어, 제어어 순서 변경 가능 
	 */
}

//관련된 클래스를 한개로 모아서 하나의 이름으로 제어 => 인터페이스의 역할
// => 메모리 공간을 하나만 사용
// 웹 => 전송받는 메소드 / 브라우저로 보내기
//         request       response : 어떤 파일을 실행
class 선 implements 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR + "를 이용해서 선을 그린다");
	}
	
}

class 사각형 implements 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR + "를 이용해서 사각형을 그린다");
		
	}
	
}

//=> 상속/구현을 받으면 데이터형이 2개(도형, 삼각형)
class 삼각형 implements 도형 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR + "를 이용해서 삼각형을 그린다");
		
	}
	
}


public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		도형 a = new 선();
		a.draw();
		
		a=new 사각형();
		a.draw();
		
		a=new 삼각형();
		a.draw();
		
		// 클래스 모아서 관리 => 상속 내리는 클래스 이용 / 인터페이스 이용
		
	}

}
