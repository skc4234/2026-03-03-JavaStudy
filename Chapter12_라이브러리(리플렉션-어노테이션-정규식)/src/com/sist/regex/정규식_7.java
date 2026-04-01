package com.sist.regex;
// or => |
// REGEXP_LIKE(name, "[가-힣]");
// name LIKE '%가%
// 
public class 정규식_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dog".matches("dog|pig|cat"));  
		System.out.println("gif".matches("gif|jpg|png"));
		// 확장자 찾기
		System.out.println("yes".matches("y(es)?"));
		System.out.println("ye".matches("y(es)?"));
	}

}
