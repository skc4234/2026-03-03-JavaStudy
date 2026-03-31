package com.sist.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 라이브러리 : 메소드 사용
 *  1. java.lang => 자바 기본 클래스
 *      - Object : 최상위 클래스 / 가장 큰 데이터형
 *         - 데이터가 여러개 있는 경우(배열)
 *            Object[] obj = {10, 10.5, "aaa", 'A'};
 *         - String toString()
 *            => 객체 메모리 주소를 문자열 리턴
 *            => 오버라이딩 해서 변수값 출력 가능
 *            => 생략 가능
 *                A a = new A();
 *                System.out.println(a); => a.toString() 생략 => a의 주소값 출력
 *         - boolean equals(Object o)
 *            => 객체 비교(주소값 비교)
 *            => 실제 값을 비교하려면 오버라이딩 해서 사용
 *         - Object clone()
 *            => 같은 값을 새로운 메모리에 생성 및 저장
 *            => Call by Value
 *            => Spring에서는 prototype
 *            => git clone => repository 새로운 메모리에 저장
 *         - int hashCode()
 *            => 객체 식별자
 *      
 *      - String : 문자열 저장 클래스
 *         - int length()
 *            => 문자의 갯수 리턴
 *         - boolean equals(String s)
 *            => 문자열에 있는 값 비교
 *            => 로그인 / 상세보기 / 아이디 중복체크
 *         - boolean startsWith(String s)
 *            => 시작 문자가 같은 경우 true
 *            => 쿠키 찾기 / 자동완성기능
 *         - boolean contains(String s)
 *            => 문자열이 포함되었는지 비교
 *            => 검색
 *         - int indexOf(문자/문자열)
 *            => 앞에서부터 문자 찾기
 *            => 찾은 위치 인덱스 번호 리턴
 *         - int lastIndexOf(문자/문자열)
 *            => 뒤에서부터 문자 찾기
 *         - String replace(String s1, String s2)
 *            => s1을 s2로 변경
 *         - String replaceAll(String regex, String s2)
 *            => regex(정규식)을 이용해서 s2로 변경
 *         - String valueOf(Object o)
 *            => 모든 데이터형을 문자열로 변환
 *         - String substring(int b)        => 처음부터 인덱스 번호만큼 자르기
 *                  substring(int b, int e) => b부터 e-1 만큼 자르기
 *         - String[] split(String regex)
 *            => 정규식을 사용해서 문자열 분리
 *      
 *      - StringBuffer / StringBuilder
 *      
 *      - Wrapper
 *         - Integer : parseInt
 *         - Double  : parseDoublc
 *         - Boolean : parseBoolean
 *         - Long    : parseLong
 *      
 *      - Math
 *         => ceil() : 올림 => 페이징 기법
 *         => random() : 0.0~0.99 난수
 *      
 *      - System
 *         => gc() : 메모리 반환
 *         => currentTimeMills() : 현재 시간 밀리초 리턴
 *         => exit(int signal) : 시스템 종료
 * 
 * 
 * 
 * 
 * 
 * 
 */

class Student {
	int id;
	String name;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
}

public class 중간정리 {
	/*
	 * git config --global user.email "you@example.com"
	   git config --global user.name "Your Name"
	   git config --global user.password "token_key"
	   
	   git init
	   git add .
	   git remote add origin "git 주소"
	   git branch -M main
	   git commit -m "commit message"
	   git push -u origin main -force (한번만 수행)
	   
	   프로젝트명과 repository명 일치
	 */
	
	
	
	public static void main(String[] args) {
		String ips = 
				"""
				211.238.142.21,
				211.238.142.22,
				211.238.142.23,
				211.238.142.24,
				211.238.142.25,
				211.238.142.26,
				211.238.142.27,
				211.238.142.28,
				211.238.142.29,
				011.1111.0000
				""";
		//System.out.println(ips);
		// 웹 사용 x
		Pattern p = Pattern.compile("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\.[0-9]{2}");
		Matcher m = p.matcher(ips);
		while(m.find()) {
			System.out.println(m.group());
		}
		
		Student s1 = new Student(1, "홍길동");
		Student s2 = new Student(1, "홍길동");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String("asdf");
		String s4 = "asdf";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
	}
}
