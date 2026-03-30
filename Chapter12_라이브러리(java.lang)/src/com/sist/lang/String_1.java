package com.sist.lang;
/*
 *  문자열을 저장하는 클래스
 *   => 데이터형 / 클래스형으로 사용 가능
 *               =======> 지원하는 메소드
 *    1) 문자열 생성
 *        **String s = "Hello";
 *        String s = new String("Hello");
 *    2) 웹/모바일/윈도우에서 주로 사용
 *        => 전송 값 받기 => String
 *        정수/실수 변환 => Wrapper
 *    3) 주요 기능
 *        - 비교
 *           *equals() : 문자열 자체 비교
 *           compare() : 문자열의 크기 비교 => 정렬
 *        - 검색
 *           *startsWith() : 시작 문자열이 같은지 => 쿠키에 저장된 데이터 찾기
 *           EndsWith() : 마지막 문자열리 같은지 => 확장자명/다운로드/파일첨부 등
 *           *contains() : 포함된 문자열인지 => 실제 검색 기능 사용시
 *        - 변환
 *           toUpperCase() : 대문자 변환
 *           toLowerCase() : 소문자 변환
 *           *replace() : 문자열 / 문자 변경
 *           *replaceAll() : 정규식을 이용해서 변경
 *        - 문자열 제어
 *           *length() : 문자 갯수
 *           *trim() : 공백 제거
 *           *substring() : 원하는 위치 문자열 제거
 *           *indexOf() : 문자나 문자열 위치 찾기(앞에서)
 *           *lastIndexOf() : 뒤에서부터 인덱스 찾기
 *        - 모든 데이터형을 문자열로 변환
 *           => *valueOf - static 메소드
 *   ================================================
 *   String 은 불변 => 변경x => 변환 메소드는 String 리턴
 *   
 *   String s = "Hello";
 *   s.replace('l', 'k'); => 리턴형은 String
 *   ===> s는 변하지 않음
 *   s=s.replace() => 변경
 *   문자열은 가급적이면 유지
 * 
 *   String 객체에는 문자열이 저장된게 아니라 주소가 저장되어 있다
 *    => "" 자체가 주소 => char[] c = {'H','e','l','l','o'};
 * 
 *   => String은 클래스
 *      클래스 / 배열은 참조변수(메모리 주소를 사용하는 프로그램)
 *       => Call by Reference
 *      **String은 Call by Value
 */
class A {
	int aa = 100;
	
}
class B {
	public void setAA(A a) { // Call by Reference
		a.aa = 1000;
	}
	public void setStr(String s) { // Call by Value
		s="홍길동";
	}
}
public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		System.out.println(a.aa);
		B b = new B();
		b.setAA(a);
		System.out.println(a.aa);
		
		String name1 = new String("심청이");
		String name2 = "심청이";
		b.setStr(name1);
		System.out.println(name1);
		System.out.println(name1==name2);
		System.out.println(name1.equals(name2));
	}

}
