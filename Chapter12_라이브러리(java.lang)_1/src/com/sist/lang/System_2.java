package com.sist.lang;

public class System_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.print("1. 정수 입력 : ");
			int num=System.in.read();  // 예외처리 필요
			System.out.println("num = " + (num-'0'));
			System.in.read(); // 엔터 처리
			System.out.print("2. 정수 입력 : ");
			int num2=System.in.read();  // 예외처리 필요
			System.in.read(); // 엔터 처리
//			System.out.print("연산자 입력(+-*/) : ");
//			int op = System.in.read();
//			System.in.read();  // 사용 빈도가 거의 없다
			// => Scanner / BufferedReader
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
