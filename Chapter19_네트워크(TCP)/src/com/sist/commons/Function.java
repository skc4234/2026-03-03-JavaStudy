package com.sist.commons;
// 프로토콜(약속) => 구분자 => 웹(파일) => 내부 프로토콜
/*
 *  => 0~65535
 *     FTP(파일전송) - 22
 *     SMTP(메일전송) - 25
 *     Telnet - 23
 *     프록시 - 8080
 *     머드 서버 - 4000
 *     ...
 *     *HTTP - 80
 *     
 *     
 *     
 */
/*
 * 자바 공부법
 *  - 형식, 문법, 사용처
 *  1. 메소드
 *  2. 제어문
 *  3. 클래스 => 변수, 메소드, 생성자
 *  4. 캡슐화
 *  5. 추상클래스 / *인터페이스
 *  6. 예외처리
 *  ----------------------------
 *  7. 라이브러리
 *     1) String / Collection(List, Map)
 *     2) IO stream
 *  -----------------------------
 *  2차 자바 => J2EE(JSP)
 *  3차 자바 => Spring
 *  4차 자바 => MyBatis / JPA
 *  5차 자바 => SpringBoot
 *  -----------------------------
 *  구조는 변경 x
 * 
 */
public class Function {
	public static final int LOGIN = 100;
	public static final int MYLOG = 110; // 로그인 : 이미 로그인 된 사람 / 로그인 한 사람
	public static final int CHAT = 200;
	public static final int EXIT = 300;
	public static final int MYEXIT = 310;
	
	
}
