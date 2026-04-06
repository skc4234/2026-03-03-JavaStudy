package com.sist.lambda;

import java.util.List;
import java.util.ListIterator;

/*
 *  - 람다 : 익명 함수
 *     - 코드 블록을 값처럼 전달할 수 있게 만들어 준것
 *     - 기본 문법
 *        (매개변수) -> {실행문}
 *        (a,b) -> {}  // 실행문이 하나면 {} 생략 가능
 *        ----- 데이터형x 변수명만
 *              자바스크립트(=> : 화살표 함수)
 *        - 메소드명, 매개변수 데이터형, 리턴형 생략
 *     - 람다를 사용하는 목적
 *        - 코드가 간결하다
 *        - 함수형 프로그램이 가능하다
 *         => 독립적으로 사용이 가능 => 메소드는 클래스 내에서 사용
 *           --------- 클래스 외에서 선언 가능
 *           
 *           
 *   - 기존 방식 : 익명 클래스 (extends, implements 없이 메소드 재정의가 가능하게 하는 클래스)
 *     // 인터페이스
 *     Runnable r = new Runnable() {
 *     		void run() { // 메소드 오버라이딩
 *     			System.out.println("Hello");
 *     		} 
 *     }
 *     
 *   - 최근 방식(구현안된 메소드가 하나인 경우)
 *     Runnable r = () -> System.out.println("Hello");
 *   
 *   - 람다는 반드시 인터페이스와 함께 사용
 *      - 조건 : 인터페이스에 구현이 안된 메소드(추상 메소드)가 하나만 있을때
 *              default / static 메소드는 상관없다
 * 
 * 
 */

@FunctionalInterface // 람다형 함수
// 사용자 정의는 거의 빈도수가 없다
// 라이브러리에서 제공하는 것이 많다
interface Calc {
	public int calc(int a, int b); // 추상 메소드
	default void display() {
		System.out.println("Calc:diaplay() Call....");
	}
	static void aaa() {
		System.out.println("aaa");
	}
}
public class Lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Runnable r = new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("Thread Running...");
//				
//			}
//		};
		
//		Runnable r = () -> {System.out.println("Thread Running....");};
//		
//		new Thread(r).start();
		
		Calc add = (a,b)-> a+b;
		Calc minus = (a,b)->a-b;
		System.out.println(add.calc(10, 20));
		System.out.println(minus.calc(30, 10));
	}

}
