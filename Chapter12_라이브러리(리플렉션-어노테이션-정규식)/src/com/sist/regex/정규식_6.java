package com.sist.regex;
// 문자 집합 []
// [abc] => a|b|c
// [^abc]
// ^[abc]
/*
 *  [abcdef] => [a-f]
 *  [abdef] => 그대로 사용
 *  
 *  [A-Z] [a-z] [A-Za-z]
 *  [0-9]
 *  [가-힣]
 *  글자수가 정해지지 않음 => {최소개수, 최대개수}
 
 * 이름 => [가-힣]{2,17}
 * 오라클은 한글이 3바이트 => 51바이트
 */
public class 정규식_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dat".matches("[abc]at"));
		System.out.println("a".matches("[a-z]"));
		System.out.println("A".matches("[A-Z]"));
		System.out.println("9".matches("[0-9]"));
		System.out.println("홍".matches("[가-힣]"));
		// "코메디"
		System.out.println("코메디".matches("[가-힣]{3}"));
		System.out.println("코메디".matches("^코[가-힣]* "));
	}

}
