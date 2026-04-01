package com.sist.regex;
// ^ => 시작   $=>끝
public class 정규식_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello".matches("^h[a-z]*o$"));
		System.out.println("hello".matches(".*o$"));
		// sdaso  dfso gaeho hello
		// 오라클 / css에서도 등장
	}

}
