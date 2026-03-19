/*
 *  생성자(229page)
 *    => 자신의 생성자를 호출 가능
 *    => this() => 자신의 생성자 => 상속 super()
 *       this => 객체(자신) => 상속 내린 클래스 : super
 *       
 *   class A {
 *   	int a,b,c,d,e,f;
 *   	A() {
 *   		a=1;
 *   		b=2;
 *   		c=3;
 *   		d=4;
 *   		e=5;
 *   		f=6;
 *   	}
 *   	A(int k) {
 *   		//a=1;
 *   		//b=2;
 *   		//c=3;
 *   		//d=4;
 *   		//f=6;
 *   		this();
 *   		e=k;
 *   	}
 *   }
 *   
 *   ==> 1. 반복된 코드 제거 => for / 메소드 / 생성자
 *   		공통모듈 => 수정 편리
 *   
 *   class A {
 *   	int a;
 *   	void aaa() {
 *   		a=1
 *   	}
 *   	void aaa() {
 *   		a=1
 *   	}
 *   	void aaa() {
  *   		a=1
 *   	}
 *   	void aaa() {
 *   		a=1
 *   	}
 *   }
 */
class Member2 {
	int mno;
	String name, address;
	// 인스턴스 변수 사용이 안되는 곳 : static {} / static 메소드 안
	// static 변수들은 모든 곳에서 사용 가능
	// ctrl + 메소드 클릭 => 현재 선언된 메소드 위치로 이동
	
	Member2() {
		mno=1;
		name = "홍길동";
		address = "Seoul";
	}
	
	Member2(String n) {
		// 중복 코딩이 많을 때 this() 사용
		this(); // 기본 생성자 호출, 생성자 안에서만 사용가능, 반드시 첫번째 줄에 사용
		name = n;
	}
	
	Member2(String n, String s) {
		this(n); // 현재 클래스의 생성자 호출
		//name = n;
		address = s;
	}
}
public class 생성자_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member2 m1 = new Member2();
		System.out.println("회원번호 : " + m1.mno);
		System.out.println("이름 : " + m1.name);
		System.out.println("주소 : " + m1.address);
		Member2 m2 = new Member2("심청이");
		System.out.println("회원번호 : " + m2.mno);
		System.out.println("이름 : " + m2.name);
		System.out.println("주소 : " + m2.address);
		Member2 m3 = new Member2("박문수", "부산");
		System.out.println("회원번호 : " + m3.mno);
		System.out.println("이름 : " + m3.name);
		System.out.println("주소 : " + m3.address);
		
	}

}
