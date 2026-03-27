package com.sist.exception;
// 사용자 정의 예외처리 클래스
class MyException extends Exception {
	private String msg;
	public MyException(String msg) {
		//this.msg = msg;
		super(msg);
	}
}
/*
 *  전세계의  ip주소?
 *  [0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}
 *  127.0.0.1
 */


// 생성자는 new   /  catch는 throw
// 우선 if~else 후 예외처리

public class 예외처리_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		try {
			if(c>='A' && c<='Z') {
				throw new MyException("소문자만 입력 가능");
			}
		} catch (MyException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

}
