package com.sist.exception;
/*
 * ---------------------------
 *  1. try-catch 기본 구조
 *  2. throws / throw 차이점
 *  3. finally의 역할
 *  4. try-with-resource 사용법
 *  ---------------------------
 *  
 *   예외 선언(회피) => 다음에 호출 시 예외처리를 해야한다
 *                => 예외 떠맡기기 : 예상만 한다
 *    - 라이브러리에서 주로 사용
 *    - 일반 개발자는 try-catch 주로 사용
 *       => try-catch(80%) / throws(20%)
 *    - 형식                                       호출 시 예외처리 후 사용
 *    	 [접근지정어][제어어] 리턴형 메소드명(매개변수) throws Exception, ... {}
 *    	 		                                     ---------------> catch절과 다르게 순서 상관 없음
 *    										         기본 : throws Exception / throws Throwable
 *       	void div(int a, int b) throws ArithmeticException { => throws Exception 면 예외처리 필수
 *       		System.out.println(a/b);
 *       	}
 *       
 *       	main() {
 *       		div(10, 0); //  오류가 없다 => UncheckedException
 *       	}
 *       
 *  컴파일 시 예외처리 검사 => 필수                        선택    
 *       CheckedException                     UncheckedException
 *             |                                       |
 *    java.io/java.net/java.sql
 *    
 *    
 *    
 *    
 *    예외 처리 중 가장 큰 클래스 사용 => Exception / Throwable
 *    throws 뒤에는 CheckedException 주로 사용
 * 
 */
public class 예외처리_5 {
	public static void div(int a, int b) throws Exception, ClassNotFoundException, InterruptedException {
		int c = a/b;
		System.out.println(c);
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		div(10,0);
		// 직접 처리 => try-catch
		// 간접 처리(다음번에 처리) => throws
	}

}
