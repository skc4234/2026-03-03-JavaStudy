package com.sist.reflection;

import java.lang.reflect.Field;

/*
 *  자바는 실행 시 시점 2개
 *   - 컴파일 시점(javac)
 *   
 *   - 실행 시점(java)
 *      => 리플렉션은 실행 시점에 클래스의 모든 정보를 읽어서 제어가 가능하다(동적)
 *        -------> Spring, Mybatis, Hibernate
 *                  => 동적 객체 생성 / 어노테이션 처리
 *                  => 메소드를 자동 호출하게 만듦
 *         - 클래스 정보
 *         - 클래스 구조
 *            class ClassName {
 *                 변수
 *                 생성자
 *                 메소드
 *            }
 *         1. 주요 클래스 / 메소드
 *             - Class : 클래스 자체 정보 저장하는 클래스
 *             - 변수 => Field
 *             - 메소드 => Method
 *             - 생성자 => Constructor
 *         2. Class 객체 얻기
 *             ex) String 클래스 정보
 *               String str = "";
 *               Class cls = String.class
 *                         = Class.forName("java.lang.String")
 *                         = str.getClass()
 *         3. 장점
 *             - 프레임워크 개발 시 사용
 *             - 코드 재사용 / 유연성(수시로 수정/추가/삭제 가능) => 유지보수
 *         4. 단점
 *             - 직접 호출보다 속도가 느리다 => 성능 저하
 *             - 보안 문제 => private 접근 가능
 *             - 코드의 가독성이 떨어진다 => 동작 과정이 보이지 않음   
 *                  
 */
class Student {
	private String name = "홍길동";
	
}
public class 리플렉션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Student std = new Student();
			
			Class cls = std.getClass();
			Field f = cls.getDeclaredField("name");
			// private 변수 접근 가능하게 만듦
			f.setAccessible(true);
			System.out.println(f.get(std));
			// 변수값 변경
			f.set(std, "박문수");
			System.out.println(f.get(std)); 
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
