package com.sist.lambda;
/*
 *  1. 람다식이란
 *      1) 익명 함수
 *      2) 메소드의 매개변수 전달이 가능
 *      3) 코드 간결화
 *      4) 함수형 프로그램 스타일
 *      
 *  2. 기본 문법
 *      (매개변수) -> {실행문}
 * 		 => public 리턴형 메소드명(매개변수) { 실행문 }
 *  3. 규칙
 *      - 데이터형을 생략한다 => (int a, int b) -> {} (x)
 *                        => (a,b) -> {}
 *      - 리턴형 생략 => {return a} => {a}
 *      
 *  4. 인터페이스로 제작
 *      => 사용자 정의 보다는 스트림을 주로 사용
 *      
 *  5. 사용 위치
 *      - 메소드 => 한번만 사용하고 버리는 경우
 *      - 재사용이 없는 경우
 *      - List에 저장된 데이터 변환이 많은 경우
 *      - 메소드에 구현시 10줄 이상 => 메소드 구현
 *  
 *  6. 장점
 *      - 속도가 빠르다 => C언어 도입
 *      - 클래스의 .class 파일 생성 안함 => 즉석 처리
 *      - 메모리가 적다
 *      - 외부 클래스 참조
 *      - 재사용 불가
 *      
 *    - 람다는 객체 생성 가능 = > 클래ㅅ 파일만 생성 x
 *      - 재사용 불가
 *      
 *    
 *    - 매개변수가 없는 경우 ()->{}
 *    - 매개변수가 있는 경우 (매개변수) -> {
 *    						여러개의 실행문 가능
 *    					}
 *    - 리턴형
 *      () -> { 값 } : 리턴 생략
 *      
 *    - 외부 메소드 이용
 *       (a) -> {Math.random()*a}
 *       
 *    - default, static 메소드는 구현이 가능
 *      구현없는 메소드(추상메소드) 한개만 설정 
 *      
 */
// 이미 만들어진 라이브러리 사용 만흥
import java.util.*;

@FunctionalInterface // 람다용으로만 사용하겠다
interface Calc { // 메소드는 한개만(추상메소드)
	int calc(int a, int b);
	default int sum(int a, int b) { // default 메소드는 가능
		return a+b;
	}

}
public class Lambda_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc add = (a,b) -> a+b;
		Calc minus = (a,b) -> a-b;
		Calc gop = (a,b) -> a*b;
		Calc div = (a,b) -> a/b;
		
		System.out.println(add.calc(10, 20));
		System.out.println(minus.calc(10, 20));
		System.out.println(div.calc(10, 3));
		
	}

}
