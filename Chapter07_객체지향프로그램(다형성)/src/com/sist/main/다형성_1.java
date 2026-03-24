package com.sist.main;
/* p295
 * 
 * 기본
 *  - static => 
 *  - 클래스 : 설계 => 요구사항 출력
 *  - 객체 : 결과물
 *  - 캡슐화 : 감춘다(private)-> 필요시 메소드 사용(getter/setter)
 *  - 상속 : 공유
 *  - 다형성 : 상황별로 다르게 구현
 *  - 추상클래스 : 절반만 완성된 설계도=>개발자로 택임을 넘긴다
 *  - 인터페이스 : 표준화 작업 => 규칙
 *  - 내부클래스 : 공통변수 / 공통 메소드
 *   ==================   =======    
 *   쉽게 유지보수 목적       추가/수정/재사용
 * => 문법사항 아님(권장)
 *  => OOP에 연연할 필요 없음
 *  
 *  
 *  5장(클래스) 정리
 *   - 클래스의 구조
 *  
 *  6장(객체지향) 정리
 *   - 객체지향 특성
 *  
 *  7장(상속)
 *   - 재사용 : 상속/포함
 *   - 추가/수정 => 다형성
 *  
 *  8장(클래스의 종류)
 *   - 추상클래스/인터페이스
 * 
 * 
 * 
 *  9장(내부클래스)
 *  10장(라이브러리)
 *  11장(예외처리)
 * --------------------------1권
 * 2권의 핵심 => *라이브러리
 * - java.lang.*
 * - java.util.*
 * - java.io.*   => 파일
 * - java.net.*  => 네트워크
 * - java.sql.*  => DB
 * 
 * 코딩
 * 40% => 내부/외부 라이브러리
 * 50% => 사용자 정의 클래스
 * 10% => 조립
 * 
 * **Back-End : *자바, JSP, *Spring, *DB
 * Front-End : javascript, Jquery, Ajax, *Vue, Pinia, *React, Redux, TanStack-Query
 * 			   *TypeScript, Nodejs
 * 아키텍쳐 : 설계 => 문서, UML, ERD
 * **SE(System Engineer) : CI/CD - 리눅스, *AWS, *Docker, Jenkins, Git(GitAction)
 * 
 * 1. p204 : 클래스 구조
 * 	  [접근지정어][제어자] class ClassName {}
 * 	  public / protected / default / private
 * 	  - 클래스는 public / default 만 사용 가능!!
 * 	     => 다른 클래스와 연결하기 위해서 public 주로 사용
 * 	  - 제어자 :    static    /    final     /    abstract
 *             공통으로 사용    상속을 내릴 수 없다    추상=>미완성
 *             					종단(고정)
 *    - 라이브러리 중에 String / System / Math 클래스는 수정하지 않고 그대로 사용(final 클래스)
 *    - C : 클래스 / F : final / A : abstract / I : 인터페이스
 * 
 * 	   class ClassName {
 * 	   		1. 변수
 * 				- 데이터 보호(은닉화) => private
 * 				- 접근 가능 => public getter/setter
 * 				- 캡슐화
 *  			- 인스턴스 변수
 *  			- 공통(정적) 변수 => 사용 빈도 적음
 * 			2. 초기화
 * 				 처리되는 순서
 * 				- static 블록
 * 				   => 메모리 할당 없이 자동 처리(한번만)
 * 				   => 인스턴스 변수 사용 불가
 * 				- 인스턴스 블록
 * 			       => 사용 빈도 적음
 * 				- 생성자
 * 				   - 인스턴스 초기화
 * 				   - 접근지정어 : public
 * 				   - 클래스명과 동일
 * 				   - 오버로딩 : 기능 추가
 * 					   => 매개변수의 갯수/데이터형이 다름
 * 				   - 클래스를 메모리에 저장할때 사용
 * 				   - 생성자는 리턴형이 없다
 * 				   - * new를 사용하면 다른 메모리 생성
 * 			3. 메소드
 * 				- 변수를 활용해서 기능을 만듦
 * 				- 한가지 기능만 수행
 * 				   => 여러개의 명령어로 처리 => 관련된 명령어의 집합
 * 				- 다른 클래스와 통신 : public
 * 				- 구성요소                    |----> 사용자가 보내준 값
 * 				   => public 리턴형 메소드명(매개변수) {
 * 					  	구현
 * 						return 값; => 리턴형이 void면 return 생략 가능
 * 					  	  |---> 처리한 값
 * 					  }
 * 				    => 메소드 호출시마다 처음부터 return 까지 수행
 * 					=> return 하면 호출한 위치로 다시 돌아간다
 * 				- 다형성
 * 					기능추가 => 오버로딩
 * 					기능변경 => 오버라이딩
 * 
 * 	   }
 * 		- 변수
 * 		   => 기본형 / 클래스 / 배열
 * 					 -------------> 참조 변수(주소 참조)
 *      - MethodArea    /     Heap
 *        -메모리 한개만 생성   -new 마다 따로 생성
 *        -static 변수       -클래스에서 등록한 변수
 *        
 *       class ClassName {
 *       	int a,b;
 *       	public void aaa() {}
 *       	public void bbb() {}
 *       }			 	
 *       A aa = new A();
 *       
 *       ---aa---
 *        0x100   new => int => malloc(A)
 *       --------
 * 		주소는 int를 넘어가지 못한다
 *                       0x100 ---a---
 *                                0   ----> aa.a
 *                             -------
 *                             ---b---
 *                                0   ----> aa.b
 *                             -------
 *                              aaa()
 * 						       -------
 * 								bbb() 
 * 						       ------- 
 *       => 자신에게 할당된 메모리 주소만 연결가능
 *       => 상속 => 메모리 두개(상속내린 클래스/상속받은 클래스) => 두개 연결 가능하게 => this/super
 *       
 *    - 오버라이딩(p295)
 *       => 상속받은 메소드 변경해서 사용
 *       => 접근지정어 확대(축소 불가)
 *       => 리턴형, 메소드명, 매개변수 전부 동일
 *       
 *       
 */
class Super {
	int a,b;
	public Super() {
		a = 100;
		b = 200;
		System.out.println("Super.a : " + this.a);
		System.out.println("Super.b : " + this.b);
	}
	public void disp() {
		System.out.println("Super.disp() Calll.....");
	}

	
}
class Sub extends Super {
	//int a,b;
	int c;
	public Sub() {
		this.a = 1000;
		this.b = 2000;
		System.out.println("Super.a : " + super.a);
		System.out.println("Super.b : " + super.b);
		System.out.println("Sub.a : " + this.a);
		System.out.println("Sub.b : " + this.b);
	}
	
	// 오버라이딩
	public void disp() {
		System.out.println("Sub.disp() Calll.....");
	}
}
public class 다형성_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		sub.disp();
		
		// 자동 형변환
		Super sup = new Sub();
		sup.disp();
		// *상속 => 상속 내린 클래스가 더 크다
		// 상위클래스 = new 하위클래스  ==> 변수는 상위클래스, 메소드는 하위클래스
		// 상위클래스는 하위클래스의 변수/메소드를 사용할 수 없다
		
		Super su = new Super();
		su.disp();
	}

}
