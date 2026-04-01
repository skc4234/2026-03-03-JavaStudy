package com.sist.regex;
/*
 *  - 정규표현식
 *     => 특수기호를 활용한 복잡한 문자패턴을 효율적으로 매칭하는 방법
 *     => 관련된 데이터 검색(검색용)
 *     => 웹(다중검색)
 *     
 *  - 리플렉션
 *     => 클래스 정보에 접근해서 동적으로 제어
 *     => 객체 생성 / 변수값 주입 / 메소드 호출 / 생성자 호출
 *     => 클래스명으로만 접근 가능
 *     => 보안 취약(private 접근 가능), 속도 저하
 *     => 결합성이 낮음(new를 사용하지 않음)
 *     => new를 사용할 수 없다 : 라이브러리 사용
 *  
 *  - 어노테이션
 *     => 구분자를 달아서 찾기 쉽게 만듦
 *     => 프로그램 추가, 삭제, 수정 자동화 처리
 *     => 서버는 수정하지 않고 기능만 추가 
 * 
 *  정규식
 *   1. 임의의 한 문자(한글, 알파벳, 숫자, 특수문자 등) => .
 * 
 * 
 */
public class 정규식_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hekkllo".matches("he.*llo"));
		System.out.println("h#llo".matches("h.llo"));
		System.out.println("hello".matches("h.*"));
		System.out.println("홍길동".matches("홍.+"));
		System.out.println("맛있고".matches("맛있"));
		// 데이터 수집 => 데이터 분석 => 시각화 => 예측 => AI
	    // ------------------------------> 빅데이터	
	}

}
