package com.sist.regex;
// 0개 이상 반복된 문자 => *
public class 정규식_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello".matches("H*llo")); // false
		System.out.println("Hello".matches("H*.l*.")); // true
		System.out.println("ho".matches("h.*o"));
	
		System.out.println("hheeeeeeeee".matches("h*e*"));
	}

}
