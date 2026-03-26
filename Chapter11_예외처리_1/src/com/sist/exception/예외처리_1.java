package com.sist.exception;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Scanner;

/*
 *  에러가 나는 경우
 *   컴파일 시 에러 / 실행 시 에러 => javascript연동 에러
 *      javac        java
 *  에러가 잘 보임     원인 찾기 어려움
 *                   파일 이동 <a href="...?page=1 "></a> 공백 오류
 *   
 *   1. *사용자 입력 => 유효성 검사 => 1. if 2. try-catch => 예외 처리(선택적) - UnCheckException => Runtime 오류
 *   2. 개발자의 실수 : 예외 처리(필수) - CheckException => 컴파일 시 오류
 *   	 ip주소, URL주소, DB연결, 파일명 오류
 *    => 수정이 가능하다 => 예외
 *    
 *   3. 예상치 못한 에러 => 에러
 * 
 *  
 *   예외처리
 *    => 소스상에서 수정 가능한 에러
 *   예외처리 범위(상속도)
 *   위로 갈수록 범위가 커짐
 *            Object
 *            	|
 *           Throwable : 예외처리의 최상위 클래스
 *           	|
 *        --------------
 *        |            |
 *     Error        Exception
 *     				   |
 *     			  ------------------------------------------
 * CheckException=|                                        |=UncheckException : 선택 조건
 *        - IOException                             RuntimeException
 *           -메모리 입출력 : 표준                            |
 *             System.out.println();               ArrayIndexOutOfBoundsException : 배열 범위 초과
 *                   -----                         NullPointerException : 값이 null인데 호출할 경우
 *             System.in                           ClassCastException : 형변환
 *                   ----                          NumberFormatException : 정수변환 오류(parseInt("10 ") 등)
 *           -네트워크 입출력                          ArithmaticException : 0으로 나누는 경우
 *           -파일 입출력                           ------------------------------------
 *        - ClassNotFoundException                 
 *           리플렉션 : 클래스 정보를 읽어서
 *           		메모리 할당/메소드 호출/변수값 지정
 *                  new 없이 메모리 할당 가능
 *        - MalformedURLException
 *           URL주소 오류
 *        - InterruptedException
 *           Thread 충돌 오류
 *           Thread.sleep(1000)
 * 		  - SQLException
 *  => 무조건 예외처리를 해야한다
 * 
 * 
 *  - 예외처리 방법
 *     1) 직접 처리 => 에러 복구
 *     	   try~catch~finally : 가장 많이 사용
 *     2) 에러 떠맡기기 : 에러 회피
 *         throws
 *         선언 => 메소드 호출 시 처리해서 사용
 *        ------------------------------
 *        소스가 완성이 된 상태 => throws
 *     3) 임의 발생 : 테스트(견고한 프로그램)
 *         throw
 *     4) 사용자 정의 예외처리
 *         class MyException extends Exception {
 *         		
 *         } => throw를 이용해서 호출
 * 
 * 
 *   - 직접 처리
 *      try {
 *      	// 정상으로 수행하는 문장
 *      	// 일반 => 처리 문장
 *      	// 에러 발생에 대한 예상
 *                                        -----------> ArrayIndextOutOfException
 *      	ex) 사용자로부터 문자열 정수를 받아서 배열에 저장
 *                        ----------> NumberFormatException
 *      	   나누기한 값을 출력
 *      	   ---------> ArithmaticException
 *             => catch(NumberFormatException ex1) { 정수변환 오류 }
 *                catch(ArrayIndextOutOfException ex2) { 배열 인덱스 오류}
 *                catch(ArithmaticException ex3) { 0나누기 오류 }
 *                catch(*Exception ex4) {}  ==> 알 수 없는 예외 처리
 *                							===> 상위 클래스가 밑에 있어야함(catch 순서)
 *      }
 *      catch (예외처리 클래스) {
 *      
 *      }
 *      catch() { // catch는 여러번 쓸 수 있다
 *      
 *      }
 *      finally {
 *      	무조건 수행하는 문장
 *      	닫기(파일, 오라클, 네트워크 서버)
 *             -----------
 *      }
 * 
 * 
 * 
 * 
 */
class MyException {
	public void aaa() {
		System.out.println("MyException : aaa() call...");
		//Thread.sleep(1000);
	}
	public void bbb() {
		System.out.println("MyException : bbb() call...");
	}
	public void ccc() {
		System.out.println("MyException : ccc() call...");
	}
}
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			Scanner scan = new Scanner(System.in);
//			System.out.print("입력(aaa,bbb,ccc) : ");
//			String m = scan.next();
//			Class className = Class.forName("com.sist.exception.MyException");
//			Object obj = className.getDeclaredConstructor().newInstance();
//			 // new Exception();
//			Method[] methods = className.getDeclaredMethods();
//			for(Method mm : methods) {
//				if(mm.getName().equals(m)) {
//					mm.invoke(obj, null);
//				}
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
		try {
			//Integer.parseInt("10 ");
			int a=1/0;
		} catch(Throwable e) {
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}

}
