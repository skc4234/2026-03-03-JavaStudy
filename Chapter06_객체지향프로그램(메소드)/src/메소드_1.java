/* 232page
 *  메소드
 *  
 *  모든 프로그램 : 변수 + 메소드
 *  프레임워크(틀) : 직접 개발
 *  
 *  메소드
 *   역할
 *    1) 클래스-클래스 간에 연결(통신) => 메세지
 *    	 매개변수 => 리턴형
 *    2) 반복 제거
 *    3) 구조적인 프로그램
 *    	  절차적 언어 ==> 헌책방
 *    	  객체지향언어 => 교보서적
 *    4) 메소드는 호출시마다 {...} 모두 수행하고 => 호출한 위치로 복귀
 *    5) 구성 요소
 *    	  주고 받기
 *    	 ----- ----
 *    1.매개변수  2. 리턴형  3.메소드명(구분자)  4.구현부
 *       1. 사용자 요청 => 1개 또는 여러개 또는 없을 수 있음
 *                       => 3개 이상이면 배열 / 클래스형으로 사용
 *       2. 사용자 요청에 대한 처리값 => 1개만 가능 => 데이터가 여러개면 배열 / 클래스로
 *       3. 소문자로 시작 => 식별자를 따라가야함 => 5~10자 정도
 *       	=> 약간의 의미부여(가독성)
 *       4.
 *       리턴형 메소드명(매개변수) {
 *       	return; // 생략 가능 => 컴파일 시 자동 추가
 *       	return 값;
 *       }
 *       
 *       컴파일 시 자동 추가 : return; / 생성자 / import java.lang.*; / 모든 클래스 => Object에 상속
 *    	
 *    
 *    	 class A {
 *    		int a;
 *    		String name;
 *    		A(int a, String n) {
 *    			this.a = a;
 *    			name = n;
 *    		}
 *    	 }
 *    
 *    	 A aa = new A(10, "aaa");
 *    	 A bb = new A(10, "aaa");
 *        => 다른 객체 => hashCode 비교
 *        
 *       형식)
 *       public    static / abstract
 *       [접근지정어][제어어] 리턴형 메소드명(매개변수) {
 *       	구현부
 *       	return 값;
 *       }
 *       
 *       - static 메소드 
 *       	클래스명.메소드명(값..)
 *           => 한개의 메모리 안에 저장 => 공유
 *       - instance 메소드
 *       	객체명.메소드명(값..)
 *       	 => 객체마다 따로 저장 => 독립적
 *           => new할때마다 따로 저장
 * 	
 * 		aaa(int a, char b, int c)
 * 		aaa(int a, int b, float c)
 * 		aaa(double a, char b, double c)
 * 		aaa(char a, char b, char c)
 * 		aaa(int a, double b, char c)
 * 		aaa(double a, double b, double c)
 * 		=> 오버로딩
 * 
 * 		aaa(10.5, 10, 10) => double int int 없음 => 근사치
 * 		
 * 		버스(좌석), 버스(고속엔진), 버스(입석)
 * 		=> 버스(Object o)
 * 
 */
class Methods {
	int a = 10;
	String name = "홍길동";
	static int b = 20; // 컴파일 시에 저장
	
	static void display() { // 컴파일 시에 저장
		System.out.println("Commons Methods");
		
	}
	void display(int a) {  // 오버로딩
		this.a = a;
		System.out.println("Instance Method");
	}
	
	/*
	 * String
	 * 	 length()
	 * 	 String s = "Hello"
	 * 	 s.length() => 인스턴스 메소드
	 * 
	 * 
	 */
}

public class 메소드_1 {
	public 메소드_1() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Object o = "Hello"; // javascript에서 let
//		o = 10;
//		o = 'A';
//		o = 3.14;
//		o = true;
//		System.out.println(o);
		
		Methods m = new Methods();
		System.out.println("b : " + Methods.b);
		Methods.display();
		// 목록(변경사항 없는) => static
		
		m.display(100);
		System.out.println("a = " + m.a);
		
		/*
		 *  ------m------
		 *  
		 *     ---a---
		 *       10
		 *     --name--
		 *      "홍길동"
		 *     -------
		 *     display(int)
		 *     
		 *  -------------
		 * 
		 */
	}

}
