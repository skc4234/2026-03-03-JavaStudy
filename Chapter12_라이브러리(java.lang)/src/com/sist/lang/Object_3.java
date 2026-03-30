package com.sist.lang;
// toString() => 객체를 문자열로 변환
// 오버라이딩 시 가장 많이 사용되는 메소드
// 변수값 출력
// toString은 생략 가능
/*
 *  형변환
 *  class A {
 *  	O X
 *  }
 *  class B extends A {
 *  	P H K
 *  	// O X
 *  }
 *  
 *  A a = new A(); // O X
 *   => A가 가지고 있는 메소드
 *   
 *  B b = new B(); // P H K O X
 *   => B가 가지고 있는 메소드
 *  
 *  A c = new B(); // O X
 *   => B가 가지고 있는 메소드
 *  
 *  => 변수는 클래스를 따라감
 *  => 메소드는 생성자를 따라감
 *  => 상속 내린 클래스는 상속받은 클래스를 제어할 수 없다
 * 
 * 
 */
class Student {
	public String name = "홍길동";
	private String sex = "남자";
	private int age = 20;
	@Override
	public String toString() { // toString 오버라이딩
		// TODO Auto-generated method stub
		String info = "이름 : " + name + "\n성별 : " + sex + "\n나이 : " + age;
		return info;
	}
	
}
public class Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std = new Student();
		// 주소 => new 생성 => 생성자 => 생성된 메모리에 인스턴스 변수값 주입
		 
		// 객체 주소 확인
		System.out.println("std의 주소 : " + std); // toString 생략 : std의 주소값을 문자열로 변환
		System.out.println("std의 주소 : " + std.toString()); 
		
		Object o = new Student();
		// 상위클래스 => 추상클래스 / 인터페이스
	}

}
