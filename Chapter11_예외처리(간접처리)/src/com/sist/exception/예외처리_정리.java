package com.sist.exception;
/*
 * 
 * 
 * 
 *  1. 직접 처리(예외 복구) - try~catch
 *   = try {...}
 *      - 정상 실행이 가능한 코딩
 *      - 에러가 발생할 수 있다(실수/입력 등) => 사전에 방지
 *      - 에러가 나면 밑에 줄은 건너뛴다 => catch문으로 이동
 *   = catch
 *      - 에러 확인이 가능
 *         printStackTrace / getMessage
 *         => 에러 위치 확인  / 에러 메시지만 출력
 *      - 에러 복구 가능 => 이동(goto, 사용금지)
 *   = finally
 *      - 생략 가능
 *      - try/catch 상관없이 무조건 수행
 *        => 서버/오라클/파일 닫기
 *    **catch : 에러 발생시 처리
 *      => 다중 catch 가능
 *        ----------- 통합 : Exception/Throwable
 *    **자동 close 호출
 *       try-with-resource
 *       
 *       
 *  2. 간접 처리(예외 회피) - throws
 *      - 에러를 등록해서 컴파일 시에 통과
 *      - 특별한 경우가 없으면 throws 문장은 많이 없다
 *      
 *      자바 ------> 브라우저(1byte, ASCII)
 *          인코딩   %EC%AE...
 *          <-----
 *          디코딩 => UTF-8 (2byte로 변환)
 *      
 *     => 소스가 긴 경우 : try 위치 설정이 안되는 경우
 *       -------------> 유지보수
 *      - 메소드() throws 예외처리 클래스 {}
 *      - 사용자 정의 메소드보다 라이브러리에 많이 있다
 *      
 *  3. catch 찾기 => throw
 *      - 필요시에는 직접 예외를 만들 수 있다
 *      - 호출 시 반드시 throw new 클래스명() 입력
 *      => throws vs throw
 *        - throws : 예상되는 에러를 선언한다
 *                  => 메소드 호출 시 예외처리를 한 다음에 사용
 *        - throw : 견고한 프로그램인지 확인
 *  
 * 
 * 
 */
public class 예외처리_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
