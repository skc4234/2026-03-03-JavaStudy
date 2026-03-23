package com.sist.main;
// 같은 파일에서 클래스 여러게 만드는 경우 => public class는 한번만 사용
/*
 * Member m = new Member("홍길동", "남자");
 * 변수 상속 시
 * ------m--------
 *  
 *  ----super=---
 *      name <- 홍길동
 *      sex <- 남자
 *  ------------
 *  
 *  ----this----
 *   display()
 *  ------------
 * 
 * --------------
 * 
 * 
 *  1. 생성자 매개변수 여부
 *  2. class B extends A
 *     A a = new A() <-- X
 *     B b = new B();
 *     A c = new B();
 *     ---   --------
 *     변수    메소드
 * 
 * 
 * 
 * 
 */

class Saram {
	String name;
	String sex;
	static int age; // 상속 예외
	public Saram(String name, String sex) {
		this.name = name;
		this.sex = sex;
		age = 20; // => instance, 생성자는 static 변수 초기화 가능
	}
}
class Member extends Saram {
	// 생성자가 default 생성자면 자동 호출 / 매개변수가 있는 생성자는 super(매개변수) 활용
	public Member(String name, String sex) {
		super(name, sex);
		this.name="박문수";
		this.sex="남성";
	}
	public void display() { 
		System.out.println("이름(super) : " + super.name);
		System.out.println("성별(super) : " + super.sex);
		System.out.println("이름 : " + this.name);
		System.out.println("성별 : " + this.sex);
		Member.age = 40; // 상속은 예외지만 사용가능
		this.age = 30;
		System.out.println("나이 : " + Member.age);
	}
}
public class 재사용_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m = new Member("홍길동", "남자");
		m.display();
	}

}
