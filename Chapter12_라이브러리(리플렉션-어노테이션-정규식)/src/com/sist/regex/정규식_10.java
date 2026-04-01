package com.sist.regex;
// 이스케이프 문제
//  => 이미 기호로 사용된 문자를 정규식 처리
//  => . ? * + | ^ $
public class 정규식_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("...".matches("\\.+"));
		System.out.println("1+2".matches("\\d\\+\\d"));
		System.out.println("a\\b".matches("a\\\\b"));
		System.out.println("^abc$".matches("^\\^abc\\$ "));
		System.out.println("c++".matches("[a-z]\\+\\+"));
		System.out.println("211.412.542.12".matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}"));
	}

}
