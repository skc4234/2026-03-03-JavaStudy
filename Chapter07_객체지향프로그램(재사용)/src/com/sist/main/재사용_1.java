package com.sist.main;
/*
 *  객체지향 => 설계
 *  1. 요구사항 분석
 *  	=> 데이터보다 기능 중심으로
 *  	   (변수)    (메소드)    => 인터페이스/추상
 *  2. 객체 생성
 *  3. 클래스마다 역할 / 책임(단일 책임 원칙)
 *  	=> 한가지 기능을 모아서 관리
 *  	=> 게시판 / 회원가입
 *  4. 관계 설정
 *  	=> 상속 / 포함
 *  5. 구현 => 리팩토링
 *  	=> 중복제거 / 객체설계 위반 여부 확인
 *  6. 실행
 *  
 *  객체지향의 4대 특성
 *  1. 데이터 보호 : 캡슐화
 *    - 변수는 private(은닉화) / 외부에서 사용 => getter/setter
 *                                       변수값 읽기 / 변수값 설정
 *    - 메모리에 저장이 되면 해킹 가능성 많음
 *      => 변수가 메모리에 저장된 값 => 메소드 : 주소값만 가지고 있다
 *    - 캡슐화의 목적
 *		 1) 데이터 보호 => 잘못된 값 설정 방지(손실/변경)
 *			          => 데이터베이스 : 무결성 원칙
 *		 2) 유지보수 용이 => 내부는 변경이 안되기 때문
 *		 3) 코드 안정성 향상 
 * 
 * 	  - 구현
 * 		 변수는 private으로 선언
 * 		 getter / setter 로 접근 : lombok
 * 		  => 전체를 만드는 것보다 필요한 부분만 설정 - ex)Button/TextField는 만들 필요 x
 * 	  	 다른 메소드를 사용할 수 있다
 * 		 => 캡슐화는 데이터를 감추고 메소드를 이용해서 접근하는 기술(안정성/유지보수 up)
 * 		 => 웹에서 주로 사용되는 기술 => *시큐어 코딩(private)
 * 
 *  2. 상속 : 재사용의 일종
 *  			20%         80%
 *  	- 상속 : is-a / 포함 : has-a
 *  	    수정해서 확장   있는 그대로 사용
 *  		=> 윈도우,     => 라이브러리, DB, 빅데이터, 크롤링 등
 * 			   쓰레드, 네트워크 등
 * 		   - 자바에서 지원하는 라이브러리
 * 		   - 외부업체에서 만든 라이브러리 : mvnrepository.com
 *        1) 개념
 *        	  - 기존의 클래스의 멤버변수/메소드 를 받아서 확장하는 프로그램
 *        	  - 코드 재사용 / 확장성을 높이는 방법
 *        	  - 상속의 키워드 : extends
 *        2) 특징
 *        	  - 단일 상속만 가능(다중 상속 시 중복 메소드 / 중복 변수 처리 불가)
 *        	     => 다중 상속 시 *인터페이스 사용
 *            - 상속 예외
 *            	 - 생성자
 *            	 - 초기화 블록
 *            	 - static
 *            	 - private
 *            - super 키워드를 이용해서 생성자/메소드 호출 가능
 *              ----------
 *              ------super------
 *               상속받은 변수/메소드
 *              ------this------
 *               상속 외 자체 변수/메소드
 *              -----------------
 *              -----------------
 *              class A {
 *              	int a,b,c,d;
 *              }
 *              class B extends A {
 *              	// int a,b,c,d; => Heap에 이미 a,b,c,d 저장
 *              } 
 *        3) 장점
 *            - 중복 코드 제거(코드가 간결해진다)
 *            - 신뢰성이 뛰어나다
 *            - 유지보수가 좋다
 *            - 개발시간 단축
 *        4) 단점
 *        	  - 캡슐화 파괴 가능성 => OOP의 기본 목적 위배
 *        		 => 스프링은 private 이지만 접근 가능
 *                  변수/생성자를 이용해서 사용
 *              class A {
 *              	//@Autowired => 자동으로 주소값 배정(private 여도 가능)
 *              	//private B b;
 *              
 *              	=> 생성자 이용
 *              	@Autowired
 *              	A(B b) {
 *              		this.b = b;
 *              	}
 *              }
 *            - 결합성이 강하다 => 의존도가 상위클래스에 묶여있다 => 영향력이 높다
 *            - 결함이 많이 발생할 수 있다
 *               => 상속 => 재정의 : 개발자마다 다르게 코딩하기 때문
 *            - 문서화 작업이 어렵다
 *            	 => 포함 클래스 => 인터페이스
 *            				    ---------
 *            					ㄴ 영향력이 많다
 *            				    ㄴ 인터페이스 고정
 * 
 * 
 * 
 */

// 중복 코드
/*
 * 단일 상속
 *  상속 내리는 클래스 : 부모 클래스 / 슈퍼 클래스 / 베이스 클래스
 *  상속 받는 클래스 : 자식 클래스 / 서브 클래스 / 파생 클래스
 *  => 상속 내리는 클래스가 상속 받는 클래스보다 크다
 *  	=> 메모리에서는 상속받는 클래스가 크다
 *  	=> 위로 올라갈수록 크다
 *  	=> 모든 클래스는 Object 클래스 상속을 받는다
 *  	=> 관련된 클래스를 여러개 묶어서 관리
 *  	=> 형변환(클래스의 크기 : 상속, 포함) => 서로 다른 클래스는 크기 비교 x
 *  	    ex)
 *  			class A {
 *  				int a,b,c,d;
 *  			}
 *  			class B {
 *  				int a,b,c;
 * 				}
 * 				동물
 * 				 |
 *              사람 => 사람은 동물이다 : is-a
 *               |
 *           ---------
 *           |       |
 *          남자     여자
 *           1) 자동 형변환
 *           	 사람 a = new 남자();
 *           	 사람 b = new 여자();
 *           	 남자 c = (남자)new 사람();
 *           2) 단일 상속
 *           	 사람은 동물, 남자는 사람,동물
 *            A    B
 *            |    |
 *            ------
 *              |
 *              C => 다중 상속, 오류
 *              
 * 
 */
import java.util.*;
class Super {
	int a,b,c; // super
	public void display() {
		System.out.println("Super : display() Call");
	}
}

class Sub extends Super {
	// int a,b,c; => 생성자, 초기화블록, static 제외
	// private는 상속되지만 접근은 불가능 => getter/setter
	// 메모리 상에 존재
	int d; // this
	// display() => 변경/그대로 사용
	// 오버라이딩
	public void display() {
		System.out.println("Sub : display() Call");
	}
}
// 상속 내리는 클래스는 상속 받은 클래스의 데이터나 메소드를 사용할 수 없다

public class 재사용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		sub.a = 3;
		System.out.println("a : " + sub.a);
		System.out.println("b : " + sub.b);
		System.out.println("c : " + sub.c);

		System.out.println("d : " + sub.d);
		sub.display();
		
		Super su = new Super();
		su.display();
		
		Super s = new Sub();
		s.display(); // 변수는 클래스 타입, 메소드는 생성자
		//Sub ss = (Sub)new Super();
		//ss.display(); // 오류
		Sub ss = (Sub)s;
		ss.display();
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add("aaa");
		list.add('A');
		list.add(new Sub());
		
		Object o = list.get(3);
		Sub sss = (Sub)list.get(3);
		sss.display();
		
		// 제네릭  
		//su.d = 3;
	}

}
