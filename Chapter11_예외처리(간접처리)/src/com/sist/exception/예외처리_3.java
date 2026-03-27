package com.sist.exception;
// 에러 메시지 처리
/*
 *  public class ArithmticEception extends Exception {
 *  	private String message;
 *  	public ArithmtitcEception(String message) {
 *  		this.message = message;
 *  	}
 *  	public String getMessage() {
 *  		return message;
 *  	}
 * 
 * 
 */
public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// printStackTrace
		// getMessage
		try {
			int a=10;
			int b=2;
			if(b==0) {
				throw new ArithmeticException("0으로 나눌 수 없다");
			}
			else {
				System.out.println(a/b);
			}
			System.out.println(a);
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("타입 : " + e.getClass());
			e.printStackTrace(); // 잘안씀
		}
	}

}
