package com.sist.exception;
/*
 *  throws => 예외 회피 => 예측 후 선언
 *   => 메소드 throws 예상되는 예외 클래스
 *   => 컴파일러에게 알려주는 경우
 *     ----------------------> 컴파일 시 통과
 *   - 단점 : 예외복구 불가 / 비정상 종료 가능성 / 시스템 자체 처리
 *      => 라이브러리가 처리를 하지 않고 사용 시에 처리해서 사용
 *         ---------> java.io / java.net / java.sql / Thread
 *   - 장점 : 어떤 예외가 발생할 지 알 수 있다
 *   
 *  - 사용자 정의 예외
 *     throws Exception / throws Throwable
 *    => 자바에서 지원하지 않는 예외가 있는 경우
 *        ex) 입력/짝수만
 *  
 *  - throw
 *     임의로 발생
 *    => throw new 예외처리 클래스("Message")
 *    => 밑에 코딩을 할 수 없다
 * 
 * 
 */
import java.util.*;
public class 예외처리_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		try {
			if(num%2!=0) {
				// 임의로 예외 발생 => 해당 catch 절 이동
				// 사용자 정의 예외 처리 시
				throw new Exception("짝수만 필요함");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
