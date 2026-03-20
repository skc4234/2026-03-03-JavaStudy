package com.sist.oop;
/*
 *  접근지정어
 *  
 *  제어자
 *  --------------
 *  구분 => package / 안에 있는 클래스 가져오기 => import
 *  
 *  1. package : 한번만 사용
 *  2. import : 여러번 사용이 가능
 *  3. class
 *  	=> *접근지정어 public, default만 사용 가능
 *  ----------------------------- 클래스 제작 순서
 *  4. 클래스 구조
 *  (public) class ClassName {
 *  	-------
 *  	멤버 변수 => private
 *      -------
 *      생성자 => 다른 클래스와 연결 필요 => 디폴트가 public
 *      ------- 
 *      메소드 => 다른 클래스와 통신 => public
 *      ------
 *  }
 *  
 *  1) static
 *  	- 공유 목적 => 동일한 내용을 출력한다 => 로그 / css / DB / 메인 화면 출력
 *  	- 객체 생성 없이 사용 가능 => 클래스명.변수 / 클래스명.메소드
 *  	- 컴파일 시에 메모리에 1개만 저장
 *  	- 독립적으로 사용 가능
 *  	- 공유 멤버 변수를 가지고 있다 - ex) 학교명, 회사명 등
 *  	- 변경이 되면 모든 인스턴스 한번에 변경
 *  	- 오라클에 저장되는 변수는 static
 *  	- static 메소드 안에서는 static 변수만 사용 가능
 *  	  => 인스턴스 변수를 사용하려면 new를 이용해서 객체 생성 후 사용
 *  	- 사용 목적 : 전역 변수 / 전역 함수 
 *   2) instance
 *   	- 객체 변수 => 새로운 메모리를 만들어서 저장 후 사용 - ex) 장바구니 등
 *   	- 다른 주소에 저장된 데이터는 접근이 불가능 => 본인 객체만 접근 가능
 *   	- 반드시 저장시에 new 생성자() 사용 => 새로운 메모리 생성
 *   	- static/instance 변수는 프로그램 종료시까지 메모리 유지
 *   	- instance 변수 구분 => this.변수명
 *   	- **static은 객체가 아니기 때문에 this를 사용할 수 없다
 *   	class A {
 *   		int a,b;       => 실제로 저장되는 메모리(Heap) 크기 => int a,b => 8byte
 *   		static int c;
 *   	}
 *   	static void display() {
 *   		a=4; // instance 변수 사용 불가능
 *   	}
 *   
 *   	우선순위 : 매개변수(지역변수) -> 멤버변수(인스턴스 변수)
 *   	void display2(int b) {
 *   	객체	this.b = b; 매개변수(지역변수)
 *   		System.out.println(this.a); // 구분할 변수명이 없는 경우 this. 생략
 *   		System.out.println(b);
 *   		System.out.println(c); // A.c 생략
 *   	}
 *		A aa = new A();    Heap          MethodArea
 *			aa -------->  0x100           ----c----
 *						----a----             0
 *			 this 영역	    0             ---------
 *		  				----b----       --display()--
 *							0           -------------
 *						---------
 *	
 *   - 생성자 => 클래스를 저장해서 객체를 생성시에 호출 => new 생성자();
 *   	- 클래스명과 동일
 *   	- 리턴형이 없다
 *   	- 오버로딩 지원
 *   	   => 같은 이름의 메소드로 새로운 기능을 제작하는 것
 *   		- 메소드명 동일
 *   		- 매개변수의 갯수가 다르거나 데이터형이 달라야함
 *   		- 리턴형이나 접근지정어는 관계없음
 *   	   	- 생성자에서 오버로딩을 지원 => 초기화를 다르게 하기 위해서
 *   	class A {
 *   		String name; => null
 *   		int age;     => 0
 *   		String compony; => null
 *   		long pay;    => 0L
 *   
 *   		// 명시적 초기화
 *   		String name = "홍길동";
 *   		int age = 20;
 *   
 *        	초기화 블록 => 객체마다 같은 값
 *        	{
 *        		name = "심청이";
 *        		age = 25;
 *        	}
 *        
 *        	A() { 생성자 => 객체마다 같은 값
 *        		name = "강감찬";
 *        		age = 30;
 *        		compony = "SIST";
 *        		pay = 30000;
 *        	}
 *        
 *        	A(String name, int age) { // 생성자 오버로딩 => 매개변수를 이용해 초기값 설정 => 초기값을 객체마다 다르게 설정
 *        		this(); => A() 호출 => 변수 초기화 시 중복 제거
 *        		this.name = name;
 *        		this.age = age;
 *        	}
 *        
 *   		*this() => 생성자 안에서 호출
 *   				=> 반드시 첫번째 줄
 *   				=> 생성자 안에서 다른 생성자 호출
 *   				=> 중복 코딩 제거
 *   		*this => 자신의 객체 => 컴파일 시에 생성 => static
 *   				=> 모든 클래스가 가지고 있다.
 *   				=> this는 매개변수/인스턴스 변수 구분
 *   			A a = new A(); => this = a
 *         	 	A b = new A(); => this = b
 *                  => 현재 사용하고 있는 객체가 this
 *                  => 컴파일러가 처리
 *          
 *          *구분
 *          static => 클래스 전체이서 공동으로 사용되는 변수
 *          --------------------------------
 *          this() => 생성자 간에 연결을 통해 효율적인 초기화 수행 => 반복 제거
 *          this => 자신의 객제 => 모든 클래스가 가지고 있다
 *   		--------------------------------
 *   		인스턴수 변수 / 인스턴스 메소드에서만 적용된다(static 제외)
 *
 *	 프로그램 개발
 *		1. 기능 설정 : 메소드
 *			=> 메소드 안에서 공통으로 사용되는 변수 : 인스턴스 변수
 *		 요구사항
 *			-----------------------------
 *			기능         기능에 필요한 요소
 *			-----------------------------
 *			로그인          id / pw
 *			-----------------------------
 *		2. 화면 UI => 초기값 설정
 *			- 명시적 초기화 => 값을 아는 경우
 *			- static 블록 => 객체 생성 없이 화면 출력 => static 변수만 사용 가능
 *			- 인스턴스 블록 => 파일 / 데이터베이스 / 크롤링 을 이용해 초기화할 때 => 거의 사용x
 *			-------------------------- 자동 호출
 *			- 생성자 => 호출 되어야함 => public
 *				*** static 초기화 => static 블록
 *					instance 초기화 => 생성자 이용
 *					모든 변수는 은닉화(private) 해야함
 *		3. 구현
 *			- 메소드 => 다른 클래스와 연결 => public
 *				-static 메소드
 *					=> 공통으로 적용되는 기능
 *				-instance 메소드
 *					=> 각 객체마다 따로 수행하는 기능
 *				- abstract 메소드
 *					=> 개발자에게 맡긴다 => 미완성(선언만 함) => 설계 도구 => 추상클래스/인터페이스
 *			 => static 메소드 : 클래스명.메소드() - ex) Math.random()
 *			 => instance 메소드 : 객체명.메소드() - scan.nextInt()
 * --------------------------------------------------------------------
 * 1. 자바의 접근지정어
 *  - public
 *  	어디서든 접근 가능 => 공개상태
 *  	=> 클래스, 생성자, 메소드
 *  - protected
 *  	같은 패키지(폴더) 안에서 접근 가능 => 다른 패키지에는 접근 불가
 *  	=> *다른 패키지여도 상속을 받은 클래스라면 접근 가능
 *  	=> 사용 빈도가 적음
 *  - default
 *  	같은 패키지 안에서 접근 가능
 *  - private => 은닉화(데이터 무결성) 
 *  	자신의 클래스 안에서만 접근 가능 => instance 변수 등
 *  - public > protected > default > private
 *  	=> *오버라이딩 시에는 접근지정어는 축소할 수 없다
 *  	 ex)
 *  		class A {
 *  			void display() {} // 접근지정어 : default
 *  		}
 *  
 *  		class B extends A {
 *  			private void display() {} // 오류!!(접근지정어가 축소되면 안됨)
 *  			public void display() {} // 가능
 *  		}
 *	---------------------------------------------------------------
 *	          같은 클래스     같은 폴더     다른 클래스(상속)     모든 클래스
 *	---------------------------------------------------------------
 *	private       O           O               O               O
 *	---------------------------------------------------------------
 *  default       O           O                
 *	---------------------------------------------------------------
 *  protected     O           O               O
 *	---------------------------------------------------------------
 *  public        O
 *  ----------------------------------------------------------------
 */
// 한명 / 한개에 대한 설계 => new
// 모든 변수에 private 주는 건 아님
// ex) Button => public / default
class Sawon {
	private int sabun;
	private String name;
	String dept;
	protected String job;
	public String loc;
	private long pay;
	
	// 캡슐화
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPay() {
		return pay;
	}
	public void setPay(long pay) {
		this.pay = pay;
	}
	
	
}


public class 접근지정어_1 {
//	int a = 10;
//	void display(int a) {
//		this.a = a;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		접근지정어_1 A = new 접근지정어_1();
//		A.display(20);
//		System.out.println(A.a);
		Sawon hong = new Sawon();
		hong.dept = "개발부";
		hong.job = "사원";
		hong.loc = "제주";
		// 메소드를 이용해서 접근
		hong.setSabun(1);
		hong.setName("홍길동");
		hong.setPay(3000);
		// 변수 저장할때 setXxx, 읽을 때 getXxx
		System.out.println("이름 : " + hong.getName());
		System.out.println("사번 : " + hong.getSabun());
		System.out.println("연봉 : " + hong.getPay());
		
		System.out.println("부서 : " + hong.dept);
		System.out.println("직위 : " + hong.job);
		System.out.println("근무지 : " + hong.loc);
	}

}
