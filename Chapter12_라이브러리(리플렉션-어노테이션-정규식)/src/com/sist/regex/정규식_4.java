package com.sist.regex;
// ? => 없음 또는 문자 하나
// color => colu?or
public class 정규식_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("color".matches("colu?or"));
		System.out.println("coluor".matches("colu?or"));
		System.out.println("coluuor".matches("colu?or"));
		System.out.println("at".matches("c?at"));
	}

}
