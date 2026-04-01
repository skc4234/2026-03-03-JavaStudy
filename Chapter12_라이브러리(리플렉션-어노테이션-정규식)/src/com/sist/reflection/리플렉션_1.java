package com.sist.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 *  리플렉션
 *   => 동적 제어
 *   => 현재 실행중인 프로그램 제어
 *      -----------------> 클래스(멤버변수,생성자,메소드)
 *   => 클래스명 이용
 *       => 반드시 패키지명부터 설정
 *   => 메소드 제어(호출), 변수값 설정
 *                     ---------> private 접근이 가능 => OOP 위배(보안)
 *   => 객체 생성 가능
 *   => 어노테이션 확인 가능
 *   --------------------> Spring(자동화)
 *   => 리플렉션 + 어노테이션 : 프레임워크 개발
 *   => JSP -> MVC -> *Spring
 *      Vue   Vuex    Pinia ==> *Nust
 *     React  Redux   *Next
 *     NodeJS => Nest
 *   -------------------------
 *   1. 클래스 정보 얻기 (멤버변수, 생성자, 메소드)
 *       => 객체 생성, 멤버변수 설정, 메소드 호출 자동화
 *   2. 프레임워크(솔루션) => 개발자
 *      프레임워크 사용(SI/SM) => 프로그래머
 * 
 * 
 * 
 */
class Sawon {
	private String name;
	public Sawon() {
		
	}
	public Sawon(String name) {
		this.name = name;
		
	}
	public void info() {
		System.out.println("Sawon:info() Call...");
		System.out.println("이름 : " + name);
	}
}
public class 리플렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Sawon("홍길동").info(); // new : 결합성이 강합
		// 객체 생성 => ClassNotFoundException => CheckedException => 반드시 예외처리
		try {
			// 클래스 정보 입력 : 패키지명.클래스명
			Class clsName = Class.forName("com.sist.reflection.Sawon");
			// 클래스 정보에서 생성자를 가지고 옴
			Constructor con = clsName.getConstructor(); // 매개변수가 없는 생성자(디폴트 생성자)
			// 메모리 할당
			Object obj = con.newInstance();
			// 메소드 읽기
			Method m = clsName.getMethod("info"); // 메소드 정보 저장
			m.invoke(obj); // 메소드 호출
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
