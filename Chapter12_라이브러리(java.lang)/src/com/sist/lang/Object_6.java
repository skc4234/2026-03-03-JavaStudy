package com.sist.lang;
/*
 *  clone / toString / hashCode / dquals
 *  => record
 *  class record Sawon {
 *  	=> 변수 설정 => getter : Spring AI => 전송 
 *  }
 */
// 보안 => 데이터를 모아서 브라우저에 전송 목적
// 거의 안나옴
record Person(String name, int age) {
	
}
public class Object_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("홍길동", 20);
		
		// getter 자동생성
		System.out.println("이름 : " + p.name() + ", 나이 : " + p.age());
	}

}
