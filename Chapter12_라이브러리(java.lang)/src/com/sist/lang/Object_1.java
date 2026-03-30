package com.sist.lang;
/*
 *  자바에서 지원하는 클래스의 집합 : 라이브러리
 *  - 라이브러리
 *     1) 자바에서 지원하는 내부 라이브러리
 *     	   => *java.lang / java.util / java.text / java.net / java.sql / java.io   => 1.1~
 *         => javax.http.servlet => 1.2~
 *         => jakarata
 *        웹서버 : tomcat 9.0까지는 javax / **10.0부터는 jakarata
 *        spring :         sts 3.9까지              sts 4.0부터
 *                            유지보수                최신화
 *                         jdk 14                 springboot
 *        
 *     2) 외부 라이브러리 => 자바 개발업체, 오픈 소스 등
 *         => mvnrepository.com
 *             => lombok.jar / jsoup.jar / json.jar
 *             => **spring
 *       -------------------- + 사용자 정의 클래스 => 조립
 *       
 *     -java.lang
 *     	 => 자바에서 많이 사용되는 클래스의 집합
 *       => import가 생략됨(자동추가)
 *       => Object : 모든 클래스에 상속내리는 최상위 클래스
 *           => 모든 클래스에 extends Object 생략
 *           => 모든 데이터형 / 모든 클래스를 관리할 수 있다
 *               ex) Object o = 10;
 *                   o = 15.4;
 *                   o = 'A';
 *                   o = "Hello";
 *                   o = new A();
 *       => 라이브러리에서 지원하는 메소드는 리턴형이 Object / 매개변수도 Object
 *           - 강제 형변환 필요성
 *           - 제네릭 사용 시 형변환 필요x
 *       => 주요 메소드
 *           1) **finalize()
 *                 => 객체 소멸 담당(객체가 메모리에서 사라질 때 자동호출)
 *     		 2) **clone()
 *                 => 값이 있는 상태 그대로 복사 => 새로운 메모리에 저장
 *           3) **equals()
 *           	   => 객체 비교
 *           4) **hashCode()
 *                 => 객체마다의 고유식별번호
 *           5) getClass()
 *               => 리플렉션 : 객체의 정보를 얻어올때
 *       
 *       - String : 문자열 관리 클래스
 *       - StringBuffer / StringBuilder
 *       - Math : 수학
 *       - System : 입출력 / 메모리 / 가비지 컬렉션 관리
 *       - Wrapper : 데이터형을 쉽게 관리하는 클래스의 집합
 *          => Integer, Double, Boolean
 *       - Thread : 여러개의 메소드를 동시에 호출할 수 있음(동시성) => 네트워크 / 애플리케이션 개발
 *                  웹 : Ajax => VueJS / React
 *                      Axios
 *    ---------------------------------------------------------------
 *    - java.util
 *       1) Date / Calendar / Time
 *       2) StringTokenizer : 문자열 자르기 등(split보다 쉬움)
 *       3) Scanner
 *       4) List / Set / Map
 *    
 *    - java.text
 *       1) DecimalFormat    => 1,000,000 
 *       2) SimpleDateFormat => 2026-03-30
 *       3) ChoiceFormat     => switch 대체
 *       4) MessageFormat    => 출력 형식 => SQL 관련
 *     
 *    -----------------응용------------------------
 *    - java.net
 *       => URL / Socket / ServerSocket
 *    
 *    - java.io
 *       => File 관련
 *       
 *    - java.sql
 *       => Database
 *       >= Connection / Statement / ResultSet
 *   ----------------------------------------------
 *   
 *   1. 람다 : 함수포인터 => 소스를 간결하게 만듦
 *      람다스트림
 *       => JWT / Spring 보안
 *       => 데이터베이스를 간단하게 출력
 *       
 *   2. 제네릭 : 데이터형 통일화 => 형변환 없이 쉬운 사용
 *       => 컬렉션 클래스 => 클래스를 모아서 관리(Object)
 *       
 *   3. 어노테이션(@) : 인덱스(검색관련) => 메소드/클래스/멤버변수 찾을때
 *       => Spring
 *   
 *   4. 리플렉션 : new 없이 클래스명으로 메모리 할당
 *       => Spring
 *       
 *   5. 정규식 : 패턴으로 문자열을 찾는 경우
 *       => 크롤링(검색)
 *   
 *  - 파일처리 => txt, csv, json
 *                        =====> 자바에서 데이터를 모아서 Vue/React로 전달
 *  
 * 1권 : 문법(형식 등)
 *       => 변수/연산자/제어문
 *       => 메소드
 *       => 객체지향(캡슐화, 다형성 등)
 *       => 클래스
 *       => 클래스 생성 : 객체
 *       => 클래스 종류(추상클래스/인터페이스)
 *       => 예외처리  
 * 2권 : 실제 프로그램 개발(라이브러리 활용)
 *       => 네트워크 : 흐름파악 => Client / Server(웹) 
 *       => 데이터베이스 : 웹
 *       => 게임
 * => 12장 라이브러리 클래스
 * 
 *  p499
 *   Object 클래스 : 모든 클래스의 상위 클래스
 *    => extends Object => java.lang.Object 
 *                                   System/String/Number/StringBuffer/Thread
 *    1. 객체 생성 ~ 소멸
 *          new    finalize() : 소멸자 메소드
 *                  => 메모리에서 해제
 *    2. 복제 / 비교
 *    3. 문자열                                
 *    
 */
// finalize()
class Sawon {
	private String name;
	private String dept;
	public Sawon(String name, String dept) {
		this.name = name; 
		this.dept = dept;
		// this => Sawon 클래스 자신의 객체
		// 매개변수 / 인스턴스 변수 구분
		// this는 static => 모든 클래스에 대입
		// this는 new를 이용해서 객체 생성시에 주소값을 대입
		// 변수 충돌이 없으면 this 생략
	}
	public void print() {
		System.out.println("이름 : " + name + ", 부서 : " + dept);
	}
	// this는 클래스 {} 안에서만 사용이 가능
	//  => 생성자 / 인스턴스 메소드
	// 인스턴스 초기화 블록 / static 블록 / static 메소드에서는 사용불가

	// 소멸자
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 메모리 해제");
	}
	
	/*
	 *   설계             객체 생성       객체 활용         객체 소멸         메모리 해제=>finalize()   
	 * class 제작 ==== new 생성자() ==== 객체.메소드() ==== 객체=null ==== GC()에 의해 해제
	 * 
	 */
	
}
public class Object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성
		Sawon sa = new Sawon("홍길동", "개발부");
		
		// 객체 활용
		sa.print();
		
		// 객체 소멸
		sa = null;
		
		// 자동으로 GC호출 => 수거 => finalize() 호출
		// 메모리가 많으면 종료 후에 나중에 회수
		// 바로 해제 => 자동 메모리 해제
		System.gc();
		// Object : 객체 생성 ~ 객체 소멸
	}

}
