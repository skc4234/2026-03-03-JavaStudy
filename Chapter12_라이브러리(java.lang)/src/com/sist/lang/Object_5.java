package com.sist.lang;

import java.util.Objects;

// equals() / hashCode()
// 객체 비교    객체 식별자
/*
 *  라이브러리 / 사용자 정의 => Object 상속 => 아래 메소드 전부 가지고 있음
 *  *1. toString() : 문자열 변환 => 생략 가능
 *  *2. clone() : 복제 => 새로운 메모리 생성
 *       => Spring에서는 prototype()
 *  3. finalize() : 소멸자 => 메모리에서 해제(자동 호출)
 *                        => System.gc()
 *  *4. equals / hashCode
 *     객체 비교   객체 식별자
 *  *5. getClass => 기존의 객체 읽기
 * 
 * 
 *  java.lang
 *   => 자바 소스의 기본이 되는 클래스 집합 => import 생략
 *   => 컴파일러가 자동 추가
 *       1) import java.lang.*
 *       2) extends Object
 *       3) 메소드가 void 일때 리턴 생략
 *       4) 기본 생성자 추가
 *       5) 생성자에서 super() 자동 호출
 *     => Object 클래스는 모든 클래스에 상속을 내리는 클래스
 *       ========> 데이터형 중에 가장 큰 데이터형 => 데이터베이스 연동
 *       JavaScript  =>   TypeScript
 *       let a=10         let a:number = 10
 *           a=10.4
 *           a="bb"
 * 
 * 
 */
// equals : 객체 비교
class Human {
	String id, name;
	public Human(String id, String name) {
		this.id = id;
		this.name = name;
	}
	// 값만 비교 => 재정의(오버라이딩)
	// 문자열 => String은 Object의 equals => 재정의
	// 재정의 해서 사용
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id,name); // 메모리 주소가 동일
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Human h = (Human)obj;
		
		return name.equals(h.name) && id.equals(h.id);
		//return super.equals(obj);
	}
	
	
}

// 중복이 없는 객체 생성 => Set
public class Object_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h1 = new Human("hong", "홍길동");
		Human h2 = new Human("hong", "홍길동");

		System.out.println("h1 주소 : " + h1);
		System.out.println("h2 주소 : " + h2);
		// equals 는 값이 아니라 주소값을 비교
		System.out.println("h1 = " + h1.hashCode());
		System.out.println("h2 = " + h2.hashCode());
		
		if(h1.equals(h2)) {
			System.out.println("같은 사람입니다");
		}
		else {

			System.out.println("다른 사람입니다");
		}
		
		
	}

}
