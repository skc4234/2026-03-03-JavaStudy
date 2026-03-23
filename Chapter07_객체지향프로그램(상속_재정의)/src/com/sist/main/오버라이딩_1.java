package com.sist.main;
/*
 *  - 객체가 생성되면 사용할 메모리 주소 설정
 *     => 객체는 자신의 메모리 주소만 접근 가능
 *     공통으로 사용할 수 있는 메모리가 필요 => static
 *  - 다른 클래스 메모리에 접근 시 메소드를 이용해서 접근 => 상속
 *    객체.변수 => 메모리 주소 접근 연산자
 * 
 *  *액터(Actor) : 동작을 하는 주체
 *    자판기 => 사람
 * 
 */
class Parent {
	int a = 10;
	public void display() {
		System.out.println("Parent : display() Call...");
	}
}
class Child extends Parent {
	int a = 100;

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Child : display() Call...");
	}
	
}
public class 오버라이딩_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		System.out.println("a = " + p.a);
		p.display();
		Child c = new Child();
		System.out.println("a = " + c.a);
		c.display();
		
		Parent pp = new Child();
		// 변수        메소드
		System.out.println("pp.a = " + pp.a); // 변수는 클래스가 가지고 있다(Parent)
		pp.display(); // 메소드는 생성자 타입을 따라간다(Child)
		// 상속 => 기본 목적 => 객체 1개 생성해서 여러개의 클래스를 모아서 관리 
	}

}
